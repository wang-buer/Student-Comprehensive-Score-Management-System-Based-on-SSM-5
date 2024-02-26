package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 综合分析
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-21 10:42:34
 */
@TableName("zonghefenxi")
public class ZonghefenxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZonghefenxiEntity() {
		
	}
	
	public ZonghefenxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 学业分析
	 */
					
	private String xueyefenxi;
	
	/**
	 * 消费分析
	 */
					
	private String xiaofeifenxi;
	
	/**
	 * 奖惩情况
	 */
					
	private String jiangchengqingkuang;
	
	/**
	 * 分析日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fenxiriqi;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：学业分析
	 */
	public void setXueyefenxi(String xueyefenxi) {
		this.xueyefenxi = xueyefenxi;
	}
	/**
	 * 获取：学业分析
	 */
	public String getXueyefenxi() {
		return xueyefenxi;
	}
	/**
	 * 设置：消费分析
	 */
	public void setXiaofeifenxi(String xiaofeifenxi) {
		this.xiaofeifenxi = xiaofeifenxi;
	}
	/**
	 * 获取：消费分析
	 */
	public String getXiaofeifenxi() {
		return xiaofeifenxi;
	}
	/**
	 * 设置：奖惩情况
	 */
	public void setJiangchengqingkuang(String jiangchengqingkuang) {
		this.jiangchengqingkuang = jiangchengqingkuang;
	}
	/**
	 * 获取：奖惩情况
	 */
	public String getJiangchengqingkuang() {
		return jiangchengqingkuang;
	}
	/**
	 * 设置：分析日期
	 */
	public void setFenxiriqi(Date fenxiriqi) {
		this.fenxiriqi = fenxiriqi;
	}
	/**
	 * 获取：分析日期
	 */
	public Date getFenxiriqi() {
		return fenxiriqi;
	}

}
