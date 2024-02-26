package com.entity.vo;

import com.entity.XueshengxuexiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 学生学习
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-21 10:42:34
 */
public class XueshengxuexiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tongjishijian;
				
	
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
