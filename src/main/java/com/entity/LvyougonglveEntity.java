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
 * 旅游攻略
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-12 23:05:13
 */
@TableName("lvyougonglve")
public class LvyougonglveEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LvyougonglveEntity() {
		
	}
	
	public LvyougonglveEntity(T t) {
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
	 * 攻略标题
	 */
					
	private String gonglvebiaoti;
	
	/**
	 * 景点名称
	 */
					
	private String jingdianmingcheng;
	
	/**
	 * 出发城市
	 */
					
	private String chufachengshi;
	
	/**
	 * 景点封面
	 */
					
	private String jingdianfengmian;
	
	/**
	 * 行程天数
	 */
					
	private Integer xingchengtianshu;
	
	/**
	 * 行程距离
	 */
					
	private Integer xingchengjuli;
	
	/**
	 * 交通工具
	 */
					
	private String jiaotonggongju;
	
	/**
	 * 行程路线
	 */
					
	private String xingchengluxian;
	
	/**
	 * 攻略详情
	 */
					
	private String gonglvexiangqing;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	
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
	 * 设置：攻略标题
	 */
	public void setGonglvebiaoti(String gonglvebiaoti) {
		this.gonglvebiaoti = gonglvebiaoti;
	}
	/**
	 * 获取：攻略标题
	 */
	public String getGonglvebiaoti() {
		return gonglvebiaoti;
	}
	/**
	 * 设置：景点名称
	 */
	public void setJingdianmingcheng(String jingdianmingcheng) {
		this.jingdianmingcheng = jingdianmingcheng;
	}
	/**
	 * 获取：景点名称
	 */
	public String getJingdianmingcheng() {
		return jingdianmingcheng;
	}
	/**
	 * 设置：出发城市
	 */
	public void setChufachengshi(String chufachengshi) {
		this.chufachengshi = chufachengshi;
	}
	/**
	 * 获取：出发城市
	 */
	public String getChufachengshi() {
		return chufachengshi;
	}
	/**
	 * 设置：景点封面
	 */
	public void setJingdianfengmian(String jingdianfengmian) {
		this.jingdianfengmian = jingdianfengmian;
	}
	/**
	 * 获取：景点封面
	 */
	public String getJingdianfengmian() {
		return jingdianfengmian;
	}
	/**
	 * 设置：行程天数
	 */
	public void setXingchengtianshu(Integer xingchengtianshu) {
		this.xingchengtianshu = xingchengtianshu;
	}
	/**
	 * 获取：行程天数
	 */
	public Integer getXingchengtianshu() {
		return xingchengtianshu;
	}
	/**
	 * 设置：行程距离
	 */
	public void setXingchengjuli(Integer xingchengjuli) {
		this.xingchengjuli = xingchengjuli;
	}
	/**
	 * 获取：行程距离
	 */
	public Integer getXingchengjuli() {
		return xingchengjuli;
	}
	/**
	 * 设置：交通工具
	 */
	public void setJiaotonggongju(String jiaotonggongju) {
		this.jiaotonggongju = jiaotonggongju;
	}
	/**
	 * 获取：交通工具
	 */
	public String getJiaotonggongju() {
		return jiaotonggongju;
	}
	/**
	 * 设置：行程路线
	 */
	public void setXingchengluxian(String xingchengluxian) {
		this.xingchengluxian = xingchengluxian;
	}
	/**
	 * 获取：行程路线
	 */
	public String getXingchengluxian() {
		return xingchengluxian;
	}
	/**
	 * 设置：攻略详情
	 */
	public void setGonglvexiangqing(String gonglvexiangqing) {
		this.gonglvexiangqing = gonglvexiangqing;
	}
	/**
	 * 获取：攻略详情
	 */
	public String getGonglvexiangqing() {
		return gonglvexiangqing;
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
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}

}
