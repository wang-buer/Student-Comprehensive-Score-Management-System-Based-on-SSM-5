package com.dao;

import com.entity.XueshengxuexiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengxuexiVO;
import com.entity.view.XueshengxuexiView;


/**
 * 学生学习
 * 
 * @author 
 * @email 
 * @date 2022-03-21 10:42:34
 */
public interface XueshengxuexiDao extends BaseMapper<XueshengxuexiEntity> {
	
	List<XueshengxuexiVO> selectListVO(@Param("ew") Wrapper<XueshengxuexiEntity> wrapper);
	
	XueshengxuexiVO selectVO(@Param("ew") Wrapper<XueshengxuexiEntity> wrapper);
	
	List<XueshengxuexiView> selectListView(@Param("ew") Wrapper<XueshengxuexiEntity> wrapper);

	List<XueshengxuexiView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengxuexiEntity> wrapper);
	
	XueshengxuexiView selectView(@Param("ew") Wrapper<XueshengxuexiEntity> wrapper);
	

}
