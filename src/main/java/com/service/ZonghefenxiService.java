package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZonghefenxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZonghefenxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZonghefenxiView;


/**
 * 综合分析
 *
 * @author 
 * @email 
 * @date 2022-03-21 10:42:34
 */
public interface ZonghefenxiService extends IService<ZonghefenxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZonghefenxiVO> selectListVO(Wrapper<ZonghefenxiEntity> wrapper);
   	
   	ZonghefenxiVO selectVO(@Param("ew") Wrapper<ZonghefenxiEntity> wrapper);
   	
   	List<ZonghefenxiView> selectListView(Wrapper<ZonghefenxiEntity> wrapper);
   	
   	ZonghefenxiView selectView(@Param("ew") Wrapper<ZonghefenxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZonghefenxiEntity> wrapper);
   	

}

