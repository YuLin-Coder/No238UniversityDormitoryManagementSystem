package com.entity.model;

import com.entity.TiwenshangbaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 体温上报
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-02-26 21:54:08
 */
public class TiwenshangbaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
