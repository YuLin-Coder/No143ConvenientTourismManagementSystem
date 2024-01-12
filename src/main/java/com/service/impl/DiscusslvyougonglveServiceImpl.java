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


import com.dao.DiscusslvyougonglveDao;
import com.entity.DiscusslvyougonglveEntity;
import com.service.DiscusslvyougonglveService;
import com.entity.vo.DiscusslvyougonglveVO;
import com.entity.view.DiscusslvyougonglveView;

@Service("discusslvyougonglveService")
public class DiscusslvyougonglveServiceImpl extends ServiceImpl<DiscusslvyougonglveDao, DiscusslvyougonglveEntity> implements DiscusslvyougonglveService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusslvyougonglveEntity> page = this.selectPage(
                new Query<DiscusslvyougonglveEntity>(params).getPage(),
                new EntityWrapper<DiscusslvyougonglveEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusslvyougonglveEntity> wrapper) {
		  Page<DiscusslvyougonglveView> page =new Query<DiscusslvyougonglveView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusslvyougonglveVO> selectListVO(Wrapper<DiscusslvyougonglveEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusslvyougonglveVO selectVO(Wrapper<DiscusslvyougonglveEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusslvyougonglveView> selectListView(Wrapper<DiscusslvyougonglveEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusslvyougonglveView selectView(Wrapper<DiscusslvyougonglveEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
