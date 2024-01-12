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


import com.dao.ChepiaoxinxiDao;
import com.entity.ChepiaoxinxiEntity;
import com.service.ChepiaoxinxiService;
import com.entity.vo.ChepiaoxinxiVO;
import com.entity.view.ChepiaoxinxiView;

@Service("chepiaoxinxiService")
public class ChepiaoxinxiServiceImpl extends ServiceImpl<ChepiaoxinxiDao, ChepiaoxinxiEntity> implements ChepiaoxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChepiaoxinxiEntity> page = this.selectPage(
                new Query<ChepiaoxinxiEntity>(params).getPage(),
                new EntityWrapper<ChepiaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChepiaoxinxiEntity> wrapper) {
		  Page<ChepiaoxinxiView> page =new Query<ChepiaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChepiaoxinxiVO> selectListVO(Wrapper<ChepiaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChepiaoxinxiVO selectVO(Wrapper<ChepiaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChepiaoxinxiView> selectListView(Wrapper<ChepiaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChepiaoxinxiView selectView(Wrapper<ChepiaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
