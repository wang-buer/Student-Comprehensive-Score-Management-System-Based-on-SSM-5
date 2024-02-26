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

import com.entity.XueshengxiaofeiEntity;
import com.entity.view.XueshengxiaofeiView;

import com.service.XueshengxiaofeiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 学生消费
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-21 10:42:34
 */
@RestController
@RequestMapping("/xueshengxiaofei")
public class XueshengxiaofeiController {
    @Autowired
    private XueshengxiaofeiService xueshengxiaofeiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XueshengxiaofeiEntity xueshengxiaofei, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			xueshengxiaofei.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XueshengxiaofeiEntity> ew = new EntityWrapper<XueshengxiaofeiEntity>();
    	PageUtils page = xueshengxiaofeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshengxiaofei), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XueshengxiaofeiEntity xueshengxiaofei, 
		HttpServletRequest request){
        EntityWrapper<XueshengxiaofeiEntity> ew = new EntityWrapper<XueshengxiaofeiEntity>();
    	PageUtils page = xueshengxiaofeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshengxiaofei), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XueshengxiaofeiEntity xueshengxiaofei){
       	EntityWrapper<XueshengxiaofeiEntity> ew = new EntityWrapper<XueshengxiaofeiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xueshengxiaofei, "xueshengxiaofei")); 
        return R.ok().put("data", xueshengxiaofeiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XueshengxiaofeiEntity xueshengxiaofei){
        EntityWrapper< XueshengxiaofeiEntity> ew = new EntityWrapper< XueshengxiaofeiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xueshengxiaofei, "xueshengxiaofei")); 
		XueshengxiaofeiView xueshengxiaofeiView =  xueshengxiaofeiService.selectView(ew);
		return R.ok("查询学生消费成功").put("data", xueshengxiaofeiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XueshengxiaofeiEntity xueshengxiaofei = xueshengxiaofeiService.selectById(id);
        return R.ok().put("data", xueshengxiaofei);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XueshengxiaofeiEntity xueshengxiaofei = xueshengxiaofeiService.selectById(id);
        return R.ok().put("data", xueshengxiaofei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XueshengxiaofeiEntity xueshengxiaofei, HttpServletRequest request){
    	xueshengxiaofei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xueshengxiaofei);

        xueshengxiaofeiService.insert(xueshengxiaofei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XueshengxiaofeiEntity xueshengxiaofei, HttpServletRequest request){
    	xueshengxiaofei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xueshengxiaofei);

        xueshengxiaofeiService.insert(xueshengxiaofei);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody XueshengxiaofeiEntity xueshengxiaofei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xueshengxiaofei);
        xueshengxiaofeiService.updateById(xueshengxiaofei);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xueshengxiaofeiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<XueshengxiaofeiEntity> wrapper = new EntityWrapper<XueshengxiaofeiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}

		int count = xueshengxiaofeiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	





}
