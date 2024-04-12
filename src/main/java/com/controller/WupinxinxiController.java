package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.WupinxinxiEntity;
import com.entity.view.WupinxinxiView;

import com.service.WupinxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 物品信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-02-26 21:54:08
 */
@RestController
@RequestMapping("/wupinxinxi")
public class WupinxinxiController {
    @Autowired
    private WupinxinxiService wupinxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WupinxinxiEntity wupinxinxi, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("suguan")) {
			wupinxinxi.setSuguanzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<WupinxinxiEntity> ew = new EntityWrapper<WupinxinxiEntity>();
		PageUtils page = wupinxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wupinxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WupinxinxiEntity wupinxinxi, HttpServletRequest request){
        EntityWrapper<WupinxinxiEntity> ew = new EntityWrapper<WupinxinxiEntity>();
		PageUtils page = wupinxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wupinxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WupinxinxiEntity wupinxinxi){
       	EntityWrapper<WupinxinxiEntity> ew = new EntityWrapper<WupinxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wupinxinxi, "wupinxinxi")); 
        return R.ok().put("data", wupinxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WupinxinxiEntity wupinxinxi){
        EntityWrapper< WupinxinxiEntity> ew = new EntityWrapper< WupinxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wupinxinxi, "wupinxinxi")); 
		WupinxinxiView wupinxinxiView =  wupinxinxiService.selectView(ew);
		return R.ok("查询物品信息成功").put("data", wupinxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WupinxinxiEntity wupinxinxi = wupinxinxiService.selectById(id);
        return R.ok().put("data", wupinxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WupinxinxiEntity wupinxinxi = wupinxinxiService.selectById(id);
        return R.ok().put("data", wupinxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WupinxinxiEntity wupinxinxi, HttpServletRequest request){
    	wupinxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wupinxinxi);

        wupinxinxiService.insert(wupinxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WupinxinxiEntity wupinxinxi, HttpServletRequest request){
    	wupinxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wupinxinxi);

        wupinxinxiService.insert(wupinxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody WupinxinxiEntity wupinxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wupinxinxi);
        wupinxinxiService.updateById(wupinxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wupinxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<WupinxinxiEntity> wrapper = new EntityWrapper<WupinxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("suguan")) {
			wrapper.eq("suguanzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = wupinxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
