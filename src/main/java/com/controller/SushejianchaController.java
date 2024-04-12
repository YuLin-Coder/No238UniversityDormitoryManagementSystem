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

import com.entity.SushejianchaEntity;
import com.entity.view.SushejianchaView;

import com.service.SushejianchaService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 宿舍检查
 * 后端接口
 * @author 
 * @email 
 * @date 2021-02-26 21:54:08
 */
@RestController
@RequestMapping("/sushejiancha")
public class SushejianchaController {
    @Autowired
    private SushejianchaService sushejianchaService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,SushejianchaEntity sushejiancha, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			sushejiancha.setXuehao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("suguan")) {
			sushejiancha.setSuguanzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<SushejianchaEntity> ew = new EntityWrapper<SushejianchaEntity>();
		PageUtils page = sushejianchaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, sushejiancha), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,SushejianchaEntity sushejiancha, HttpServletRequest request){
        EntityWrapper<SushejianchaEntity> ew = new EntityWrapper<SushejianchaEntity>();
		PageUtils page = sushejianchaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, sushejiancha), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( SushejianchaEntity sushejiancha){
       	EntityWrapper<SushejianchaEntity> ew = new EntityWrapper<SushejianchaEntity>();
      	ew.allEq(MPUtil.allEQMapPre( sushejiancha, "sushejiancha")); 
        return R.ok().put("data", sushejianchaService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(SushejianchaEntity sushejiancha){
        EntityWrapper< SushejianchaEntity> ew = new EntityWrapper< SushejianchaEntity>();
 		ew.allEq(MPUtil.allEQMapPre( sushejiancha, "sushejiancha")); 
		SushejianchaView sushejianchaView =  sushejianchaService.selectView(ew);
		return R.ok("查询宿舍检查成功").put("data", sushejianchaView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        SushejianchaEntity sushejiancha = sushejianchaService.selectById(id);
        return R.ok().put("data", sushejiancha);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        SushejianchaEntity sushejiancha = sushejianchaService.selectById(id);
        return R.ok().put("data", sushejiancha);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SushejianchaEntity sushejiancha, HttpServletRequest request){
    	sushejiancha.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(sushejiancha);

        sushejianchaService.insert(sushejiancha);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody SushejianchaEntity sushejiancha, HttpServletRequest request){
    	sushejiancha.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(sushejiancha);

        sushejianchaService.insert(sushejiancha);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SushejianchaEntity sushejiancha, HttpServletRequest request){
        //ValidatorUtils.validateEntity(sushejiancha);
        sushejianchaService.updateById(sushejiancha);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        sushejianchaService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<SushejianchaEntity> wrapper = new EntityWrapper<SushejianchaEntity>();
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

		int count = sushejianchaService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
