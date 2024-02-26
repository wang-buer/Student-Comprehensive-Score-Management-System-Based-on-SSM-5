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
 * 学生消费
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-21 10:42:34
 */
@TableName("xueshengxiaofei")
public class XueshengxiaofeiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XueshengxiaofeiEntity() {
		
	}
	
	public XueshengxiaofeiEntity(T t) {
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
	 * 校园卡号
	 */
					
	private String xiaoyuankahao;
	
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 消费金额
	 */
					
	private Integer xiaofeijine;
	
	/**
	 * 消费次数
	 */
					
	private Integer xiaofeicishu;
	
	/**
	 * 消费额
	 */
					
	private Integer xiaofeie;
	
	/**
	 * 消费时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date xiaofeishijian;
	
	/**
	 * 月消费总和
	 */
					
	private Integer yuexiaofeizonghe;
	
	/**
	 * 统计时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date tongjishijian;
	
	
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
	 * 设置：校园卡号
	 */
	public void setXiaoyuankahao(String xiaoyuankahao) {
		this.xiaoyuankahao = xiaoyuankahao;
	}
	/**
	 * 获取：校园卡号
	 */
	public String getXiaoyuankahao() {
		return xiaoyuankahao;
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
	 * 设置：消费金额
	 */
	public void setXiaofeijine(Integer xiaofeijine) {
		this.xiaofeijine = xiaofeijine;
	}
	/**
	 * 获取：消费金额
	 */
	public Integer getXiaofeijine() {
		return xiaofeijine;
	}
	/**
	 * 设置：消费次数
	 */
	public void setXiaofeicishu(Integer xiaofeicishu) {
		this.xiaofeicishu = xiaofeicishu;
	}
	/**
	 * 获取：消费次数
	 */
	public Integer getXiaofeicishu() {
		return xiaofeicishu;
	}
	/**
	 * 设置：消费额
	 */
	public void setXiaofeie(Integer xiaofeie) {
		this.xiaofeie = xiaofeie;
	}
	/**
	 * 获取：消费额
	 */
	public Integer getXiaofeie() {
		return xiaofeie;
	}
	/**
	 * 设置：消费时间
	 */
	public void setXiaofeishijian(Date xiaofeishijian) {
		this.xiaofeishijian = xiaofeishijian;
	}
	/**
	 * 获取：消费时间
	 */
	public Date getXiaofeishijian() {
		return xiaofeishijian;
	}
	/**
	 * 设置：月消费总和
	 */
	public void setYuexiaofeizonghe(Integer yuexiaofeizonghe) {
		this.yuexiaofeizonghe = yuexiaofeizonghe;
	}
	/**
	 * 获取：月消费总和
	 */
	public Integer getYuexiaofeizonghe() {
		return yuexiaofeizonghe;
	}
	/**
	 * 设置：统计时间
	 */
	public void setTongjishijian(Date tongjishijian) {
		this.tongjishijian = tongjishijian;
	}
	/**
	 * 获取：统计时间
	 */
	public Date getTongjishijian() {
		return tongjishijian;
	}

}
