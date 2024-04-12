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
 * 体温上报
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-02-26 21:54:08
 */
@TableName("tiwenshangbao")
public class TiwenshangbaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TiwenshangbaoEntity() {
		
	}
	
	public TiwenshangbaoEntity(T t) {
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
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 学生姓名
	 */
					
	private String xueshengxingming;
	
	/**
	 * 宿舍号
	 */
					
	private String sushehao;
	
	/**
	 * 体温
	 */
					
	private Float tiwen;
	
	/**
	 * 是否咳嗽
	 */
					
	private String shifoukesou;
	
	/**
	 * 是否腹泻
	 */
					
	private String shifoufuxie;
	
	/**
	 * 是否乏力
	 */
					
	private String shifoufali;
	
	/**
	 * 是否就医
	 */
					
	private String shifoujiuyi;
	
	/**
	 * 其他情况
	 */
					
	private String qitaqingkuang;
	
	/**
	 * 上报时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date shangbaoshijian;
	
	
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
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
	/**
	 * 设置：学生姓名
	 */
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
	/**
	 * 设置：宿舍号
	 */
	public void setSushehao(String sushehao) {
		this.sushehao = sushehao;
	}
	/**
	 * 获取：宿舍号
	 */
	public String getSushehao() {
		return sushehao;
	}
	/**
	 * 设置：体温
	 */
	public void setTiwen(Float tiwen) {
		this.tiwen = tiwen;
	}
	/**
	 * 获取：体温
	 */
	public Float getTiwen() {
		return tiwen;
	}
	/**
	 * 设置：是否咳嗽
	 */
	public void setShifoukesou(String shifoukesou) {
		this.shifoukesou = shifoukesou;
	}
	/**
	 * 获取：是否咳嗽
	 */
	public String getShifoukesou() {
		return shifoukesou;
	}
	/**
	 * 设置：是否腹泻
	 */
	public void setShifoufuxie(String shifoufuxie) {
		this.shifoufuxie = shifoufuxie;
	}
	/**
	 * 获取：是否腹泻
	 */
	public String getShifoufuxie() {
		return shifoufuxie;
	}
	/**
	 * 设置：是否乏力
	 */
	public void setShifoufali(String shifoufali) {
		this.shifoufali = shifoufali;
	}
	/**
	 * 获取：是否乏力
	 */
	public String getShifoufali() {
		return shifoufali;
	}
	/**
	 * 设置：是否就医
	 */
	public void setShifoujiuyi(String shifoujiuyi) {
		this.shifoujiuyi = shifoujiuyi;
	}
	/**
	 * 获取：是否就医
	 */
	public String getShifoujiuyi() {
		return shifoujiuyi;
	}
	/**
	 * 设置：其他情况
	 */
	public void setQitaqingkuang(String qitaqingkuang) {
		this.qitaqingkuang = qitaqingkuang;
	}
	/**
	 * 获取：其他情况
	 */
	public String getQitaqingkuang() {
		return qitaqingkuang;
	}
	/**
	 * 设置：上报时间
	 */
	public void setShangbaoshijian(Date shangbaoshijian) {
		this.shangbaoshijian = shangbaoshijian;
	}
	/**
	 * 获取：上报时间
	 */
	public Date getShangbaoshijian() {
		return shangbaoshijian;
	}

}
