package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LvyougonglveEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LvyougonglveVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LvyougonglveView;


/**
 * 旅游攻略
 *
 * @author 
 * @email 
 * @date 2021-04-12 23:05:13
 */
public interface LvyougonglveService extends IService<LvyougonglveEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LvyougonglveVO> selectListVO(Wrapper<LvyougonglveEntity> wrapper);
   	
   	LvyougonglveVO selectVO(@Param("ew") Wrapper<LvyougonglveEntity> wrapper);
   	
   	List<LvyougonglveView> selectListView(Wrapper<LvyougonglveEntity> wrapper);
   	
   	LvyougonglveView selectView(@Param("ew") Wrapper<LvyougonglveEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LvyougonglveEntity> wrapper);
   	
}

