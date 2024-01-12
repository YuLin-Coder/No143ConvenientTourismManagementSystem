package com.entity.view;

import com.entity.XiaofeizhangdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 消费账单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-12 23:05:13
 */
@TableName("xiaofeizhangdan")
public class XiaofeizhangdanView  extends XiaofeizhangdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaofeizhangdanView(){
	}
 
 	public XiaofeizhangdanView(XiaofeizhangdanEntity xiaofeizhangdanEntity){
 	try {
			BeanUtils.copyProperties(this, xiaofeizhangdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
