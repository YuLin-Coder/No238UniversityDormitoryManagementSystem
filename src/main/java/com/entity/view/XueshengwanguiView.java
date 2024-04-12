package com.entity.view;

import com.entity.XueshengwanguiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生晚归
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-26 21:54:08
 */
@TableName("xueshengwangui")
public class XueshengwanguiView  extends XueshengwanguiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengwanguiView(){
	}
 
 	public XueshengwanguiView(XueshengwanguiEntity xueshengwanguiEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengwanguiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
