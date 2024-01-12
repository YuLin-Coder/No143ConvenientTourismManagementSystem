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


import com.dao.DiscussjiudianxinxiDao;
import com.entity.DiscussjiudianxinxiEntity;
import com.service.DiscussjiudianxinxiService;
import com.entity.vo.DiscussjiudianxinxiVO;
import com.entity.view.DiscussjiudianxinxiView;

@Service("discussjiudianxinxiService")
public class DiscussjiudianxinxiServiceImpl extends ServiceImpl<DiscussjiudianxinxiDao, DiscussjiudianxinxiEntity> implements DiscussjiudianxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiudianxinxiEntity> page = this.selectPage(
                new Query<DiscussjiudianxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussjiudianxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiudianxinxiEntity> wrapper) {
		  Page<DiscussjiudianxinxiView> page =new Query<DiscussjiudianxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiudianxinxiVO> selectListVO(Wrapper<DiscussjiudianxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiudianxinxiVO selectVO(Wrapper<DiscussjiudianxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiudianxinxiView> selectListView(Wrapper<DiscussjiudianxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiudianxinxiView selectView(Wrapper<DiscussjiudianxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
