package com.entity.view;

import com.entity.MubiaoxindeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 目标心得
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-12 23:05:13
 */
@TableName("mubiaoxinde")
public class MubiaoxindeView  extends MubiaoxindeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MubiaoxindeView(){
	}
 
 	public MubiaoxindeView(MubiaoxindeEntity mubiaoxindeEntity){
 	try {
			BeanUtils.copyProperties(this, mubiaoxindeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
