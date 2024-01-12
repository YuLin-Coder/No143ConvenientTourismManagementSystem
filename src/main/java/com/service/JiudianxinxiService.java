package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiudianxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiudianxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiudianxinxiView;


/**
 * 酒店信息
 *
 * @author 
 * @email 
 * @date 2021-04-12 23:05:13
 */
public interface JiudianxinxiService extends IService<JiudianxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiudianxinxiVO> selectListVO(Wrapper<JiudianxinxiEntity> wrapper);
   	
   	JiudianxinxiVO selectVO(@Param("ew") Wrapper<JiudianxinxiEntity> wrapper);
   	
   	List<JiudianxinxiView> selectListView(Wrapper<JiudianxinxiEntity> wrapper);
   	
   	JiudianxinxiView selectView(@Param("ew") Wrapper<JiudianxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiudianxinxiEntity> wrapper);
   	
}

