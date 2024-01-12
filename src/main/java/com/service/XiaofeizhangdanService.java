package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaofeizhangdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaofeizhangdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaofeizhangdanView;


/**
 * 消费账单
 *
 * @author 
 * @email 
 * @date 2021-04-12 23:05:13
 */
public interface XiaofeizhangdanService extends IService<XiaofeizhangdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaofeizhangdanVO> selectListVO(Wrapper<XiaofeizhangdanEntity> wrapper);
   	
   	XiaofeizhangdanVO selectVO(@Param("ew") Wrapper<XiaofeizhangdanEntity> wrapper);
   	
   	List<XiaofeizhangdanView> selectListView(Wrapper<XiaofeizhangdanEntity> wrapper);
   	
   	XiaofeizhangdanView selectView(@Param("ew") Wrapper<XiaofeizhangdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaofeizhangdanEntity> wrapper);
   	
}

