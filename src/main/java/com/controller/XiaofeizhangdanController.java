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

import com.entity.XiaofeizhangdanEntity;
import com.entity.view.XiaofeizhangdanView;

import com.service.XiaofeizhangdanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 消费账单
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-12 23:05:13
 */
@RestController
@RequestMapping("/xiaofeizhangdan")
public class XiaofeizhangdanController {
    @Autowired
    private XiaofeizhangdanService xiaofeizhangdanService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XiaofeizhangdanEntity xiaofeizhangdan,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			xiaofeizhangdan.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XiaofeizhangdanEntity> ew = new EntityWrapper<XiaofeizhangdanEntity>();
		PageUtils page = xiaofeizhangdanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xiaofeizhangdan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XiaofeizhangdanEntity xiaofeizhangdan, HttpServletRequest request){
        EntityWrapper<XiaofeizhangdanEntity> ew = new EntityWrapper<XiaofeizhangdanEntity>();
		PageUtils page = xiaofeizhangdanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xiaofeizhangdan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XiaofeizhangdanEntity xiaofeizhangdan){
       	EntityWrapper<XiaofeizhangdanEntity> ew = new EntityWrapper<XiaofeizhangdanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xiaofeizhangdan, "xiaofeizhangdan")); 
        return R.ok().put("data", xiaofeizhangdanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XiaofeizhangdanEntity xiaofeizhangdan){
        EntityWrapper< XiaofeizhangdanEntity> ew = new EntityWrapper< XiaofeizhangdanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xiaofeizhangdan, "xiaofeizhangdan")); 
		XiaofeizhangdanView xiaofeizhangdanView =  xiaofeizhangdanService.selectView(ew);
		return R.ok("查询消费账单成功").put("data", xiaofeizhangdanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XiaofeizhangdanEntity xiaofeizhangdan = xiaofeizhangdanService.selectById(id);
        return R.ok().put("data", xiaofeizhangdan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XiaofeizhangdanEntity xiaofeizhangdan = xiaofeizhangdanService.selectById(id);
        return R.ok().put("data", xiaofeizhangdan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XiaofeizhangdanEntity xiaofeizhangdan, HttpServletRequest request){
    	xiaofeizhangdan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xiaofeizhangdan);
        xiaofeizhangdanService.insert(xiaofeizhangdan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XiaofeizhangdanEntity xiaofeizhangdan, HttpServletRequest request){
    	xiaofeizhangdan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xiaofeizhangdan);
        xiaofeizhangdanService.insert(xiaofeizhangdan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody XiaofeizhangdanEntity xiaofeizhangdan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xiaofeizhangdan);
        xiaofeizhangdanService.updateById(xiaofeizhangdan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xiaofeizhangdanService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<XiaofeizhangdanEntity> wrapper = new EntityWrapper<XiaofeizhangdanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = xiaofeizhangdanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
