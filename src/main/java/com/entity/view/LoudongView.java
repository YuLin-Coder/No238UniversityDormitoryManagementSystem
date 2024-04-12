package com.entity.view;

import com.entity.LoudongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 楼栋
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-26 21:54:08
 */
@TableName("loudong")
public class LoudongView  extends LoudongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LoudongView(){
	}
 
 	public LoudongView(LoudongEntity loudongEntity){
 	try {
			BeanUtils.copyProperties(this, loudongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
