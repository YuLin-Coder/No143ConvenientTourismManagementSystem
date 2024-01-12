package com.entity.view;

import com.entity.DiscusslvyougonglveEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 旅游攻略评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-12 23:05:13
 */
@TableName("discusslvyougonglve")
public class DiscusslvyougonglveView  extends DiscusslvyougonglveEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusslvyougonglveView(){
	}
 
 	public DiscusslvyougonglveView(DiscusslvyougonglveEntity discusslvyougonglveEntity){
 	try {
			BeanUtils.copyProperties(this, discusslvyougonglveEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
