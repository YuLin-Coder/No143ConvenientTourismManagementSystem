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


import com.dao.LvyougonglveDao;
import com.entity.LvyougonglveEntity;
import com.service.LvyougonglveService;
import com.entity.vo.LvyougonglveVO;
import com.entity.view.LvyougonglveView;

@Service("lvyougonglveService")
public class LvyougonglveServiceImpl extends ServiceImpl<LvyougonglveDao, LvyougonglveEntity> implements LvyougonglveService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LvyougonglveEntity> page = this.selectPage(
                new Query<LvyougonglveEntity>(params).getPage(),
                new EntityWrapper<LvyougonglveEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LvyougonglveEntity> wrapper) {
		  Page<LvyougonglveView> page =new Query<LvyougonglveView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LvyougonglveVO> selectListVO(Wrapper<LvyougonglveEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LvyougonglveVO selectVO(Wrapper<LvyougonglveEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LvyougonglveView> selectListView(Wrapper<LvyougonglveEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LvyougonglveView selectView(Wrapper<LvyougonglveEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
