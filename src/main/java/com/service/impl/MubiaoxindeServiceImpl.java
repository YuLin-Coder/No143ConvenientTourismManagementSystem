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


import com.dao.MubiaoxindeDao;
import com.entity.MubiaoxindeEntity;
import com.service.MubiaoxindeService;
import com.entity.vo.MubiaoxindeVO;
import com.entity.view.MubiaoxindeView;

@Service("mubiaoxindeService")
public class MubiaoxindeServiceImpl extends ServiceImpl<MubiaoxindeDao, MubiaoxindeEntity> implements MubiaoxindeService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MubiaoxindeEntity> page = this.selectPage(
                new Query<MubiaoxindeEntity>(params).getPage(),
                new EntityWrapper<MubiaoxindeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MubiaoxindeEntity> wrapper) {
		  Page<MubiaoxindeView> page =new Query<MubiaoxindeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MubiaoxindeVO> selectListVO(Wrapper<MubiaoxindeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MubiaoxindeVO selectVO(Wrapper<MubiaoxindeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MubiaoxindeView> selectListView(Wrapper<MubiaoxindeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MubiaoxindeView selectView(Wrapper<MubiaoxindeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
