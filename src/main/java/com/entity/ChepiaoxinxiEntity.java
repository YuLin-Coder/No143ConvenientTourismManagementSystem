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
 * 车票信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-12 23:05:13
 */
@TableName("chepiaoxinxi")
public class ChepiaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChepiaoxinxiEntity() {
		
	}
	
	public ChepiaoxinxiEntity(T t) {
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
	 * 班次
	 */
					
	private String banci;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date riqi;
	
	/**
	 * 开车时间
	 */
					
	private String kaicheshijian;
	
	/**
	 * 到站时间
	 */
					
	private String daozhanshijian;
	
	/**
	 * 车票类型
	 */
					
	private String chepiaoleixing;
	
	/**
	 * 票价
	 */
					
	private Integer piaojia;
	
	/**
	 * 票数
	 */
					
	private Integer piaoshu;
	
	/**
	 * 起点站
	 */
					
	private String qidianzhan;
	
	/**
	 * 终点站
	 */
					
	private String zhongdianzhan;
	
	/**
	 * 车辆路线
	 */
					
	private String cheliangluxian;
	
	
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
	 * 设置：班次
	 */
	public void setBanci(String banci) {
		this.banci = banci;
	}
	/**
	 * 获取：班次
	 */
	public String getBanci() {
		return banci;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：日期
	 */
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}
	/**
	 * 设置：开车时间
	 */
	public void setKaicheshijian(String kaicheshijian) {
		this.kaicheshijian = kaicheshijian;
	}
	/**
	 * 获取：开车时间
	 */
	public String getKaicheshijian() {
		return kaicheshijian;
	}
	/**
	 * 设置：到站时间
	 */
	public void setDaozhanshijian(String daozhanshijian) {
		this.daozhanshijian = daozhanshijian;
	}
	/**
	 * 获取：到站时间
	 */
	public String getDaozhanshijian() {
		return daozhanshijian;
	}
	/**
	 * 设置：车票类型
	 */
	public void setChepiaoleixing(String chepiaoleixing) {
		this.chepiaoleixing = chepiaoleixing;
	}
	/**
	 * 获取：车票类型
	 */
	public String getChepiaoleixing() {
		return chepiaoleixing;
	}
	/**
	 * 设置：票价
	 */
	public void setPiaojia(Integer piaojia) {
		this.piaojia = piaojia;
	}
	/**
	 * 获取：票价
	 */
	public Integer getPiaojia() {
		return piaojia;
	}
	/**
	 * 设置：票数
	 */
	public void setPiaoshu(Integer piaoshu) {
		this.piaoshu = piaoshu;
	}
	/**
	 * 获取：票数
	 */
	public Integer getPiaoshu() {
		return piaoshu;
	}
	/**
	 * 设置：起点站
	 */
	public void setQidianzhan(String qidianzhan) {
		this.qidianzhan = qidianzhan;
	}
	/**
	 * 获取：起点站
	 */
	public String getQidianzhan() {
		return qidianzhan;
	}
	/**
	 * 设置：终点站
	 */
	public void setZhongdianzhan(String zhongdianzhan) {
		this.zhongdianzhan = zhongdianzhan;
	}
	/**
	 * 获取：终点站
	 */
	public String getZhongdianzhan() {
		return zhongdianzhan;
	}
	/**
	 * 设置：车辆路线
	 */
	public void setCheliangluxian(String cheliangluxian) {
		this.cheliangluxian = cheliangluxian;
	}
	/**
	 * 获取：车辆路线
	 */
	public String getCheliangluxian() {
		return cheliangluxian;
	}

}
