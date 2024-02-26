package com.entity.view;

import com.entity.ZonghefenxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 综合分析
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-21 10:42:34
 */
@TableName("zonghefenxi")
public class ZonghefenxiView  extends ZonghefenxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZonghefenxiView(){
	}
 
 	public ZonghefenxiView(ZonghefenxiEntity zonghefenxiEntity){
 	try {
			BeanUtils.copyProperties(this, zonghefenxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
