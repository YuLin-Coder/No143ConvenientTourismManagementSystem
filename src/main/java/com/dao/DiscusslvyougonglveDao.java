package com.dao;

import com.entity.DiscusslvyougonglveEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusslvyougonglveVO;
import com.entity.view.DiscusslvyougonglveView;


/**
 * 旅游攻略评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-12 23:05:13
 */
public interface DiscusslvyougonglveDao extends BaseMapper<DiscusslvyougonglveEntity> {
	
	List<DiscusslvyougonglveVO> selectListVO(@Param("ew") Wrapper<DiscusslvyougonglveEntity> wrapper);
	
	DiscusslvyougonglveVO selectVO(@Param("ew") Wrapper<DiscusslvyougonglveEntity> wrapper);
	
	List<DiscusslvyougonglveView> selectListView(@Param("ew") Wrapper<DiscusslvyougonglveEntity> wrapper);

	List<DiscusslvyougonglveView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusslvyougonglveEntity> wrapper);
	
	DiscusslvyougonglveView selectView(@Param("ew") Wrapper<DiscusslvyougonglveEntity> wrapper);
	
}
