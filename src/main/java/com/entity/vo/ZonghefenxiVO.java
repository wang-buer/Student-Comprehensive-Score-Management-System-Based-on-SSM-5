package com.entity.vo;

import com.entity.ZonghefenxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 综合分析
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-21 10:42:34
 */
public class ZonghefenxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fenxiriqi;
				
	
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
