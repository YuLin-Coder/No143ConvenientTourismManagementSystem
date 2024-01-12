package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscusslvyougonglveEntity;
import com.entity.view.DiscusslvyougonglveView;

import com.service.DiscusslvyougonglveService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 旅游攻略评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-12 23:05:13
 */
@RestController
@RequestMapping("/discusslvyougonglve")
public class DiscusslvyougonglveController {
    @Autowired
    private DiscusslvyougonglveService discusslvyougonglveService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscusslvyougonglveEntity discusslvyougonglve,
		HttpServletRequest request){
        EntityWrapper<DiscusslvyougonglveEntity> ew = new EntityWrapper<DiscusslvyougonglveEntity>();
		PageUtils page = discusslvyougonglveService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusslvyougonglve), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscusslvyougonglveEntity discusslvyougonglve, HttpServletRequest request){
        EntityWrapper<DiscusslvyougonglveEntity> ew = new EntityWrapper<DiscusslvyougonglveEntity>();
		PageUtils page = discusslvyougonglveService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusslvyougonglve), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscusslvyougonglveEntity discusslvyougonglve){
       	EntityWrapper<DiscusslvyougonglveEntity> ew = new EntityWrapper<DiscusslvyougonglveEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discusslvyougonglve, "discusslvyougonglve")); 
        return R.ok().put("data", discusslvyougonglveService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscusslvyougonglveEntity discusslvyougonglve){
        EntityWrapper< DiscusslvyougonglveEntity> ew = new EntityWrapper< DiscusslvyougonglveEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discusslvyougonglve, "discusslvyougonglve")); 
		DiscusslvyougonglveView discusslvyougonglveView =  discusslvyougonglveService.selectView(ew);
		return R.ok("查询旅游攻略评论表成功").put("data", discusslvyougonglveView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscusslvyougonglveEntity discusslvyougonglve = discusslvyougonglveService.selectById(id);
        return R.ok().put("data", discusslvyougonglve);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscusslvyougonglveEntity discusslvyougonglve = discusslvyougonglveService.selectById(id);
        return R.ok().put("data", discusslvyougonglve);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscusslvyougonglveEntity discusslvyougonglve, HttpServletRequest request){
    	discusslvyougonglve.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusslvyougonglve);
        discusslvyougonglveService.insert(discusslvyougonglve);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscusslvyougonglveEntity discusslvyougonglve, HttpServletRequest request){
    	discusslvyougonglve.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusslvyougonglve);
        discusslvyougonglveService.insert(discusslvyougonglve);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscusslvyougonglveEntity discusslvyougonglve, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discusslvyougonglve);
        discusslvyougonglveService.updateById(discusslvyougonglve);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discusslvyougonglveService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiscusslvyougonglveEntity> wrapper = new EntityWrapper<DiscusslvyougonglveEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discusslvyougonglveService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
