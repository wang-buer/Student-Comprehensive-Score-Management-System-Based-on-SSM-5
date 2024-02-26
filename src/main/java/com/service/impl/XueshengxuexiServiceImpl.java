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


import com.dao.XueshengxuexiDao;
import com.entity.XueshengxuexiEntity;
import com.service.XueshengxuexiService;
import com.entity.vo.XueshengxuexiVO;
import com.entity.view.XueshengxuexiView;

@Service("xueshengxuexiService")
public class XueshengxuexiServiceImpl extends ServiceImpl<XueshengxuexiDao, XueshengxuexiEntity> implements XueshengxuexiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengxuexiEntity> page = this.selectPage(
                new Query<XueshengxuexiEntity>(params).getPage(),
                new EntityWrapper<XueshengxuexiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengxuexiEntity> wrapper) {
		  Page<XueshengxuexiView> page =new Query<XueshengxuexiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengxuexiVO> selectListVO(Wrapper<XueshengxuexiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengxuexiVO selectVO(Wrapper<XueshengxuexiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengxuexiView> selectListView(Wrapper<XueshengxuexiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengxuexiView selectView(Wrapper<XueshengxuexiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
