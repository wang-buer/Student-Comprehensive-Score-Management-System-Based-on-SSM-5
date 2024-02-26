package com.dao;

import com.entity.XueshengxiaofeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengxiaofeiVO;
import com.entity.view.XueshengxiaofeiView;


/**
 * 学生消费
 * 
 * @author 
 * @email 
 * @date 2022-03-21 10:42:34
 */
public interface XueshengxiaofeiDao extends BaseMapper<XueshengxiaofeiEntity> {
	
	List<XueshengxiaofeiVO> selectListVO(@Param("ew") Wrapper<XueshengxiaofeiEntity> wrapper);
	
	XueshengxiaofeiVO selectVO(@Param("ew") Wrapper<XueshengxiaofeiEntity> wrapper);
	
	List<XueshengxiaofeiView> selectListView(@Param("ew") Wrapper<XueshengxiaofeiEntity> wrapper);

	List<XueshengxiaofeiView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengxiaofeiEntity> wrapper);
	
	XueshengxiaofeiView selectView(@Param("ew") Wrapper<XueshengxiaofeiEntity> wrapper);
	

}
