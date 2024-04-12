package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 楼栋
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-02-26 21:54:08
 */
@TableName("loudong")
public class LoudongEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LoudongEntity() {
		
	}
	
	public LoudongEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 楼栋
	 */
					
	private String loudong;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：楼栋
	 */
	public void setLoudong(String loudong) {
		this.loudong = loudong;
	}
	/**
	 * 获取：楼栋
	 */
	public String getLoudong() {
		return loudong;
	}
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
