package com.entity.vo;

import com.entity.XiaofeizhangdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 消费账单
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-12 23:05:13
 */
public class XiaofeizhangdanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 名称
	 */
	
	private String mingcheng;
		
	/**
	 * 消费金额
	 */
	
	private Integer xiaofeijine;
		
	/**
	 * 消费内容
	 */
	
	private String xiaofeineirong;
		
	/**
	 * 消费日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xiaofeiriqi;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
	/**
	 * 设置：名称
	 */
	 
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	
	/**
	 * 获取：名称
	 */
	public String getMingcheng() {
		return mingcheng;
	}
				
	
	/**
	 * 设置：消费金额
	 */
	 
	public void setXiaofeijine(Integer xiaofeijine) {
		this.xiaofeijine = xiaofeijine;
	}
	
	/**
	 * 获取：消费金额
	 */
	public Integer getXiaofeijine() {
		return xiaofeijine;
	}
				
	
	/**
	 * 设置：消费内容
	 */
	 
	public void setXiaofeineirong(String xiaofeineirong) {
		this.xiaofeineirong = xiaofeineirong;
	}
	
	/**
	 * 获取：消费内容
	 */
	public String getXiaofeineirong() {
		return xiaofeineirong;
	}
				
	
	/**
	 * 设置：消费日期
	 */
	 
	public void setXiaofeiriqi(Date xiaofeiriqi) {
		this.xiaofeiriqi = xiaofeiriqi;
	}
	
	/**
	 * 获取：消费日期
	 */
	public Date getXiaofeiriqi() {
		return xiaofeiriqi;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
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
			
}
