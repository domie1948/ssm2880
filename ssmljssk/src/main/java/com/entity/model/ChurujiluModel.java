package com.entity.model;

import com.entity.ChurujiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 出入记录
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-11 18:17:26
 */
public class ChurujiluModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 住址
	 */
	
	private String zhuzhi;
		
	/**
	 * 出入情况
	 */
	
	private String churuqingkuang;
		
	/**
	 * 出入时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date churushijian;
		
	/**
	 * 出入去向
	 */
	
	private String churuquxiang;
		
	/**
	 * 体温
	 */
	
	private String tiwen;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：住址
	 */
	 
	public void setZhuzhi(String zhuzhi) {
		this.zhuzhi = zhuzhi;
	}
	
	/**
	 * 获取：住址
	 */
	public String getZhuzhi() {
		return zhuzhi;
	}
				
	
	/**
	 * 设置：出入情况
	 */
	 
	public void setChuruqingkuang(String churuqingkuang) {
		this.churuqingkuang = churuqingkuang;
	}
	
	/**
	 * 获取：出入情况
	 */
	public String getChuruqingkuang() {
		return churuqingkuang;
	}
				
	
	/**
	 * 设置：出入时间
	 */
	 
	public void setChurushijian(Date churushijian) {
		this.churushijian = churushijian;
	}
	
	/**
	 * 获取：出入时间
	 */
	public Date getChurushijian() {
		return churushijian;
	}
				
	
	/**
	 * 设置：出入去向
	 */
	 
	public void setChuruquxiang(String churuquxiang) {
		this.churuquxiang = churuquxiang;
	}
	
	/**
	 * 获取：出入去向
	 */
	public String getChuruquxiang() {
		return churuquxiang;
	}
				
	
	/**
	 * 设置：体温
	 */
	 
	public void setTiwen(String tiwen) {
		this.tiwen = tiwen;
	}
	
	/**
	 * 获取：体温
	 */
	public String getTiwen() {
		return tiwen;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
			
}
