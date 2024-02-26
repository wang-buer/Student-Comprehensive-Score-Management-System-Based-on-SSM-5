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


import com.dao.ZonghefenxiDao;
import com.entity.ZonghefenxiEntity;
import com.service.ZonghefenxiService;
import com.entity.vo.ZonghefenxiVO;
import com.entity.view.ZonghefenxiView;

@Service("zonghefenxiService")
public class ZonghefenxiServiceImpl extends ServiceImpl<ZonghefenxiDao, ZonghefenxiEntity> implements ZonghefenxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZonghefenxiEntity> page = this.selectPage(
                new Query<ZonghefenxiEntity>(params).getPage(),
                new EntityWrapper<ZonghefenxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZonghefenxiEntity> wrapper) {
		  Page<ZonghefenxiView> page =new Query<ZonghefenxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZonghefenxiVO> selectListVO(Wrapper<ZonghefenxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZonghefenxiVO selectVO(Wrapper<ZonghefenxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZonghefenxiView> selectListView(Wrapper<ZonghefenxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZonghefenxiView selectView(Wrapper<ZonghefenxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
