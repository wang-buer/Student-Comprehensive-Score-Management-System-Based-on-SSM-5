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
 * 学生学习
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-21 10:42:34
 */
@TableName("xueshengxuexi")
public class XueshengxuexiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XueshengxuexiEntity() {
		
	}
	
	public XueshengxuexiEntity(T t) {
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
	 * 月份
	 */
					
	private String yuefen;
	
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 进图书馆时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date jintushuguanshijian;
	
	/**
	 * 出图书馆时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date chutushuguanshijian;
	
	/**
	 * 次数
	 */
					
	private Integer cishu;
	
	/**
	 * 进出时间总和
	 */
					
	private String jinchushijianzonghe;
	
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
	 * 设置：月份
	 */
	public void setYuefen(String yuefen) {
		this.yuefen = yuefen;
	}
	/**
	 * 获取：月份
	 */
	public String getYuefen() {
		return yuefen;
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
	 * 设置：进图书馆时间
	 */
	public void setJintushuguanshijian(Date jintushuguanshijian) {
		this.jintushuguanshijian = jintushuguanshijian;
	}
	/**
	 * 获取：进图书馆时间
	 */
	public Date getJintushuguanshijian() {
		return jintushuguanshijian;
	}
	/**
	 * 设置：出图书馆时间
	 */
	public void setChutushuguanshijian(Date chutushuguanshijian) {
		this.chutushuguanshijian = chutushuguanshijian;
	}
	/**
	 * 获取：出图书馆时间
	 */
	public Date getChutushuguanshijian() {
		return chutushuguanshijian;
	}
	/**
	 * 设置：次数
	 */
	public void setCishu(Integer cishu) {
		this.cishu = cishu;
	}
	/**
	 * 获取：次数
	 */
	public Integer getCishu() {
		return cishu;
	}
	/**
	 * 设置：进出时间总和
	 */
	public void setJinchushijianzonghe(String jinchushijianzonghe) {
		this.jinchushijianzonghe = jinchushijianzonghe;
	}
	/**
	 * 获取：进出时间总和
	 */
	public String getJinchushijianzonghe() {
		return jinchushijianzonghe;
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
