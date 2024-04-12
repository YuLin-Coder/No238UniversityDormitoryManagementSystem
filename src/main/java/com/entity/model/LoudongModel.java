package com.entity.model;

import com.entity.LoudongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 楼栋
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-02-26 21:54:08
 */
public class LoudongModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 位置
	 */
	
	private String weizhi;
		
	/**
	 * 层数
	 */
	
	private Integer cengshu;
		
	/**
	 * 宿舍数量
	 */
	
	private Integer susheshuliang;
				
	
	/**
	 * 设置：位置
	 */
	 
	public void setWeizhi(String weizhi) {
		this.weizhi = weizhi;
	}
	
	/**
	 * 获取：位置
	 */
	public String getWeizhi() {
		return weizhi;
	}
				
	
	/**
	 * 设置：层数
	 */
	 
	public void setCengshu(Integer cengshu) {
		this.cengshu = cengshu;
	}
	
	/**
	 * 获取：层数
	 */
	public Integer getCengshu() {
		return cengshu;
	}
				
	
	/**
	 * 设置：宿舍数量
	 */
	 
	public void setSusheshuliang(Integer susheshuliang) {
		this.susheshuliang = susheshuliang;
	}
	
	/**
	 * 获取：宿舍数量
	 */
	public Integer getSusheshuliang() {
		return susheshuliang;
	}
			
}
