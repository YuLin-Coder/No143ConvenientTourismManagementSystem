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
 * 消费账单
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-12 23:05:13
 */
@TableName("xiaofeizhangdan")
public class XiaofeizhangdanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiaofeizhangdanEntity() {
		
	}
	
	public XiaofeizhangdanEntity(T t) {
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
	 * 账单编号
	 */
					
	private String zhangdanbianhao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	 * 设置：账单编号
	 */
	public void setZhangdanbianhao(String zhangdanbianhao) {
		this.zhangdanbianhao = zhangdanbianhao;
	}
	/**
	 * 获取：账单编号
	 */
	public String getZhangdanbianhao() {
		return zhangdanbianhao;
	}
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
