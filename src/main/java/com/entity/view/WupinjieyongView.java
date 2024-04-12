package com.entity.view;

import com.entity.WupinjieyongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 物品借用
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-26 21:54:08
 */
@TableName("wupinjieyong")
public class WupinjieyongView  extends WupinjieyongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WupinjieyongView(){
	}
 
 	public WupinjieyongView(WupinjieyongEntity wupinjieyongEntity){
 	try {
			BeanUtils.copyProperties(this, wupinjieyongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
