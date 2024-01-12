package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiudianyudingDao;
import com.entity.JiudianyudingEntity;
import com.service.JiudianyudingService;
import com.entity.vo.JiudianyudingVO;
import com.entity.view.JiudianyudingView;

@Service("jiudianyudingService")
public class JiudianyudingServiceImpl extends ServiceImpl<JiudianyudingDao, JiudianyudingEntity> implements JiudianyudingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiudianyudingEntity> page = this.selectPage(
                new Query<JiudianyudingEntity>(params).getPage(),
                new EntityWrapper<JiudianyudingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiudianyudingEntity> wrapper) {
		  Page<JiudianyudingView> page =new Query<JiudianyudingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiudianyudingVO> selectListVO(Wrapper<JiudianyudingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiudianyudingVO selectVO(Wrapper<JiudianyudingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiudianyudingView> selectListView(Wrapper<JiudianyudingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiudianyudingView selectView(Wrapper<JiudianyudingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
