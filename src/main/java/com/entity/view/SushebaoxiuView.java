package com.entity.view;

import com.entity.SushebaoxiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宿舍报修
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-26 21:54:08
 */
@TableName("sushebaoxiu")
public class SushebaoxiuView  extends SushebaoxiuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SushebaoxiuView(){
	}
 
 	public SushebaoxiuView(SushebaoxiuEntity sushebaoxiuEntity){
 	try {
			BeanUtils.copyProperties(this, sushebaoxiuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
