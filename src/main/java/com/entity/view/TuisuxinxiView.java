package com.entity.view;

import com.entity.TuisuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 退宿信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-26 21:54:08
 */
@TableName("tuisuxinxi")
public class TuisuxinxiView  extends TuisuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TuisuxinxiView(){
	}
 
 	public TuisuxinxiView(TuisuxinxiEntity tuisuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, tuisuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
