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


import com.dao.XueshengxiaofeiDao;
import com.entity.XueshengxiaofeiEntity;
import com.service.XueshengxiaofeiService;
import com.entity.vo.XueshengxiaofeiVO;
import com.entity.view.XueshengxiaofeiView;

@Service("xueshengxiaofeiService")
public class XueshengxiaofeiServiceImpl extends ServiceImpl<XueshengxiaofeiDao, XueshengxiaofeiEntity> implements XueshengxiaofeiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengxiaofeiEntity> page = this.selectPage(
                new Query<XueshengxiaofeiEntity>(params).getPage(),
                new EntityWrapper<XueshengxiaofeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengxiaofeiEntity> wrapper) {
		  Page<XueshengxiaofeiView> page =new Query<XueshengxiaofeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengxiaofeiVO> selectListVO(Wrapper<XueshengxiaofeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengxiaofeiVO selectVO(Wrapper<XueshengxiaofeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengxiaofeiView> selectListView(Wrapper<XueshengxiaofeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengxiaofeiView selectView(Wrapper<XueshengxiaofeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
