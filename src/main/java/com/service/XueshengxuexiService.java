package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengxuexiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengxuexiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengxuexiView;


/**
 * 学生学习
 *
 * @author 
 * @email 
 * @date 2022-03-21 10:42:34
 */
public interface XueshengxuexiService extends IService<XueshengxuexiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengxuexiVO> selectListVO(Wrapper<XueshengxuexiEntity> wrapper);
   	
   	XueshengxuexiVO selectVO(@Param("ew") Wrapper<XueshengxuexiEntity> wrapper);
   	
   	List<XueshengxuexiView> selectListView(Wrapper<XueshengxuexiEntity> wrapper);
   	
   	XueshengxuexiView selectView(@Param("ew") Wrapper<XueshengxuexiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengxuexiEntity> wrapper);
   	

}

