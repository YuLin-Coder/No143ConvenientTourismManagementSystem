package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChepiaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChepiaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChepiaoxinxiView;


/**
 * 车票信息
 *
 * @author 
 * @email 
 * @date 2021-04-12 23:05:13
 */
public interface ChepiaoxinxiService extends IService<ChepiaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChepiaoxinxiVO> selectListVO(Wrapper<ChepiaoxinxiEntity> wrapper);
   	
   	ChepiaoxinxiVO selectVO(@Param("ew") Wrapper<ChepiaoxinxiEntity> wrapper);
   	
   	List<ChepiaoxinxiView> selectListView(Wrapper<ChepiaoxinxiEntity> wrapper);
   	
   	ChepiaoxinxiView selectView(@Param("ew") Wrapper<ChepiaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChepiaoxinxiEntity> wrapper);
   	
}

