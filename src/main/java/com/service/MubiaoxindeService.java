package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MubiaoxindeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MubiaoxindeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MubiaoxindeView;


/**
 * 目标心得
 *
 * @author 
 * @email 
 * @date 2021-04-12 23:05:13
 */
public interface MubiaoxindeService extends IService<MubiaoxindeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MubiaoxindeVO> selectListVO(Wrapper<MubiaoxindeEntity> wrapper);
   	
   	MubiaoxindeVO selectVO(@Param("ew") Wrapper<MubiaoxindeEntity> wrapper);
   	
   	List<MubiaoxindeView> selectListView(Wrapper<MubiaoxindeEntity> wrapper);
   	
   	MubiaoxindeView selectView(@Param("ew") Wrapper<MubiaoxindeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MubiaoxindeEntity> wrapper);
   	
}

