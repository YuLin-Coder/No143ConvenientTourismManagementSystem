package com.dao;

import com.entity.MubiaoxindeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MubiaoxindeVO;
import com.entity.view.MubiaoxindeView;


/**
 * 目标心得
 * 
 * @author 
 * @email 
 * @date 2021-04-12 23:05:13
 */
public interface MubiaoxindeDao extends BaseMapper<MubiaoxindeEntity> {
	
	List<MubiaoxindeVO> selectListVO(@Param("ew") Wrapper<MubiaoxindeEntity> wrapper);
	
	MubiaoxindeVO selectVO(@Param("ew") Wrapper<MubiaoxindeEntity> wrapper);
	
	List<MubiaoxindeView> selectListView(@Param("ew") Wrapper<MubiaoxindeEntity> wrapper);

	List<MubiaoxindeView> selectListView(Pagination page,@Param("ew") Wrapper<MubiaoxindeEntity> wrapper);
	
	MubiaoxindeView selectView(@Param("ew") Wrapper<MubiaoxindeEntity> wrapper);
	
}
