package com.dao;

import com.entity.XiaofeizhangdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaofeizhangdanVO;
import com.entity.view.XiaofeizhangdanView;


/**
 * 消费账单
 * 
 * @author 
 * @email 
 * @date 2021-04-12 23:05:13
 */
public interface XiaofeizhangdanDao extends BaseMapper<XiaofeizhangdanEntity> {
	
	List<XiaofeizhangdanVO> selectListVO(@Param("ew") Wrapper<XiaofeizhangdanEntity> wrapper);
	
	XiaofeizhangdanVO selectVO(@Param("ew") Wrapper<XiaofeizhangdanEntity> wrapper);
	
	List<XiaofeizhangdanView> selectListView(@Param("ew") Wrapper<XiaofeizhangdanEntity> wrapper);

	List<XiaofeizhangdanView> selectListView(Pagination page,@Param("ew") Wrapper<XiaofeizhangdanEntity> wrapper);
	
	XiaofeizhangdanView selectView(@Param("ew") Wrapper<XiaofeizhangdanEntity> wrapper);
	
}
