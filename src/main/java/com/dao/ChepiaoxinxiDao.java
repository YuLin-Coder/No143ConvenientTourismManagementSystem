package com.dao;

import com.entity.ChepiaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChepiaoxinxiVO;
import com.entity.view.ChepiaoxinxiView;


/**
 * 车票信息
 * 
 * @author 
 * @email 
 * @date 2021-04-12 23:05:13
 */
public interface ChepiaoxinxiDao extends BaseMapper<ChepiaoxinxiEntity> {
	
	List<ChepiaoxinxiVO> selectListVO(@Param("ew") Wrapper<ChepiaoxinxiEntity> wrapper);
	
	ChepiaoxinxiVO selectVO(@Param("ew") Wrapper<ChepiaoxinxiEntity> wrapper);
	
	List<ChepiaoxinxiView> selectListView(@Param("ew") Wrapper<ChepiaoxinxiEntity> wrapper);

	List<ChepiaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ChepiaoxinxiEntity> wrapper);
	
	ChepiaoxinxiView selectView(@Param("ew") Wrapper<ChepiaoxinxiEntity> wrapper);
	
}
