package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusslvyougonglveEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusslvyougonglveVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusslvyougonglveView;


/**
 * 旅游攻略评论表
 *
 * @author 
 * @email 
 * @date 2021-04-12 23:05:13
 */
public interface DiscusslvyougonglveService extends IService<DiscusslvyougonglveEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusslvyougonglveVO> selectListVO(Wrapper<DiscusslvyougonglveEntity> wrapper);
   	
   	DiscusslvyougonglveVO selectVO(@Param("ew") Wrapper<DiscusslvyougonglveEntity> wrapper);
   	
   	List<DiscusslvyougonglveView> selectListView(Wrapper<DiscusslvyougonglveEntity> wrapper);
   	
   	DiscusslvyougonglveView selectView(@Param("ew") Wrapper<DiscusslvyougonglveEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusslvyougonglveEntity> wrapper);
   	
}

