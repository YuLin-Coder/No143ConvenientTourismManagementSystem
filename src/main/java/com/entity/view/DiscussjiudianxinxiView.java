package com.entity.view;

import com.entity.DiscussjiudianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 酒店信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-12 23:05:13
 */
@TableName("discussjiudianxinxi")
public class DiscussjiudianxinxiView  extends DiscussjiudianxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjiudianxinxiView(){
	}
 
 	public DiscussjiudianxinxiView(DiscussjiudianxinxiEntity discussjiudianxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussjiudianxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
