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


import com.dao.XiaofeizhangdanDao;
import com.entity.XiaofeizhangdanEntity;
import com.service.XiaofeizhangdanService;
import com.entity.vo.XiaofeizhangdanVO;
import com.entity.view.XiaofeizhangdanView;

@Service("xiaofeizhangdanService")
public class XiaofeizhangdanServiceImpl extends ServiceImpl<XiaofeizhangdanDao, XiaofeizhangdanEntity> implements XiaofeizhangdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaofeizhangdanEntity> page = this.selectPage(
                new Query<XiaofeizhangdanEntity>(params).getPage(),
                new EntityWrapper<XiaofeizhangdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaofeizhangdanEntity> wrapper) {
		  Page<XiaofeizhangdanView> page =new Query<XiaofeizhangdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaofeizhangdanVO> selectListVO(Wrapper<XiaofeizhangdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaofeizhangdanVO selectVO(Wrapper<XiaofeizhangdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaofeizhangdanView> selectListView(Wrapper<XiaofeizhangdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaofeizhangdanView selectView(Wrapper<XiaofeizhangdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
