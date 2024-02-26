package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengxiaofeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengxiaofeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengxiaofeiView;


/**
 * 学生消费
 *
 * @author 
 * @email 
 * @date 2022-03-21 10:42:34
 */
public interface XueshengxiaofeiService extends IService<XueshengxiaofeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengxiaofeiVO> selectListVO(Wrapper<XueshengxiaofeiEntity> wrapper);
   	
   	XueshengxiaofeiVO selectVO(@Param("ew") Wrapper<XueshengxiaofeiEntity> wrapper);
   	
   	List<XueshengxiaofeiView> selectListView(Wrapper<XueshengxiaofeiEntity> wrapper);
   	
   	XueshengxiaofeiView selectView(@Param("ew") Wrapper<XueshengxiaofeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengxiaofeiEntity> wrapper);
   	

}

