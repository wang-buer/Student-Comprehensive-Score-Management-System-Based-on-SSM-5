package com.dao;

import com.entity.ZonghefenxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZonghefenxiVO;
import com.entity.view.ZonghefenxiView;


/**
 * 综合分析
 * 
 * @author 
 * @email 
 * @date 2022-03-21 10:42:34
 */
public interface ZonghefenxiDao extends BaseMapper<ZonghefenxiEntity> {
	
	List<ZonghefenxiVO> selectListVO(@Param("ew") Wrapper<ZonghefenxiEntity> wrapper);
	
	ZonghefenxiVO selectVO(@Param("ew") Wrapper<ZonghefenxiEntity> wrapper);
	
	List<ZonghefenxiView> selectListView(@Param("ew") Wrapper<ZonghefenxiEntity> wrapper);

	List<ZonghefenxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZonghefenxiEntity> wrapper);
	
	ZonghefenxiView selectView(@Param("ew") Wrapper<ZonghefenxiEntity> wrapper);
	

}
