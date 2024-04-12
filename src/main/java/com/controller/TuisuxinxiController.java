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

import com.entity.TuisuxinxiEntity;
import com.entity.view.TuisuxinxiView;

import com.service.TuisuxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 退宿信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-02-26 21:54:08
 */
@RestController
@RequestMapping("/tuisuxinxi")
public class TuisuxinxiController {
    @Autowired
    private TuisuxinxiService tuisuxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TuisuxinxiEntity tuisuxinxi, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			tuisuxinxi.setXuehao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("suguan")) {
			tuisuxinxi.setSuguanzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<TuisuxinxiEntity> ew = new EntityWrapper<TuisuxinxiEntity>();
		PageUtils page = tuisuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tuisuxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TuisuxinxiEntity tuisuxinxi, HttpServletRequest request){
        EntityWrapper<TuisuxinxiEntity> ew = new EntityWrapper<TuisuxinxiEntity>();
		PageUtils page = tuisuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tuisuxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TuisuxinxiEntity tuisuxinxi){
       	EntityWrapper<TuisuxinxiEntity> ew = new EntityWrapper<TuisuxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( tuisuxinxi, "tuisuxinxi")); 
        return R.ok().put("data", tuisuxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TuisuxinxiEntity tuisuxinxi){
        EntityWrapper< TuisuxinxiEntity> ew = new EntityWrapper< TuisuxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( tuisuxinxi, "tuisuxinxi")); 
		TuisuxinxiView tuisuxinxiView =  tuisuxinxiService.selectView(ew);
		return R.ok("查询退宿信息成功").put("data", tuisuxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TuisuxinxiEntity tuisuxinxi = tuisuxinxiService.selectById(id);
        return R.ok().put("data", tuisuxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TuisuxinxiEntity tuisuxinxi = tuisuxinxiService.selectById(id);
        return R.ok().put("data", tuisuxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TuisuxinxiEntity tuisuxinxi, HttpServletRequest request){
    	tuisuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tuisuxinxi);

        tuisuxinxiService.insert(tuisuxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody TuisuxinxiEntity tuisuxinxi, HttpServletRequest request){
    	tuisuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tuisuxinxi);

        tuisuxinxiService.insert(tuisuxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TuisuxinxiEntity tuisuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(tuisuxinxi);
        tuisuxinxiService.updateById(tuisuxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        tuisuxinxiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<TuisuxinxiEntity> wrapper = new EntityWrapper<TuisuxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("suguan")) {
			wrapper.eq("suguanzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = tuisuxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
