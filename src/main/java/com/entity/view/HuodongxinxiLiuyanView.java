package com.entity.view;

import com.entity.HuodongxinxiLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 活动信息留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("huodongxinxi_liuyan")
public class HuodongxinxiLiuyanView extends HuodongxinxiLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 huodongxinxi
			/**
			* 活动信息标题
			*/
			private String huodongxinxiName;
			/**
			* 活动类型
			*/
			private Integer huodongxinxiTypes;
				/**
				* 活动类型的值
				*/
				private String huodongxinxiValue;
			/**
			* 封面
			*/
			private String huodongxinxiPhoto;
			/**
			* 赞
			*/
			private Integer zanNumber;
			/**
			* 踩
			*/
			private Integer caiNumber;
			/**
			* 活动信息详情
			*/
			private String huodongxinxiContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public HuodongxinxiLiuyanView() {

	}

	public HuodongxinxiLiuyanView(HuodongxinxiLiuyanEntity huodongxinxiLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, huodongxinxiLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}













				//级联表的get和set huodongxinxi

					/**
					* 获取： 活动信息标题
					*/
					public String getHuodongxinxiName() {
						return huodongxinxiName;
					}
					/**
					* 设置： 活动信息标题
					*/
					public void setHuodongxinxiName(String huodongxinxiName) {
						this.huodongxinxiName = huodongxinxiName;
					}

					/**
					* 获取： 活动类型
					*/
					public Integer getHuodongxinxiTypes() {
						return huodongxinxiTypes;
					}
					/**
					* 设置： 活动类型
					*/
					public void setHuodongxinxiTypes(Integer huodongxinxiTypes) {
						this.huodongxinxiTypes = huodongxinxiTypes;
					}


						/**
						* 获取： 活动类型的值
						*/
						public String getHuodongxinxiValue() {
							return huodongxinxiValue;
						}
						/**
						* 设置： 活动类型的值
						*/
						public void setHuodongxinxiValue(String huodongxinxiValue) {
							this.huodongxinxiValue = huodongxinxiValue;
						}

					/**
					* 获取： 封面
					*/
					public String getHuodongxinxiPhoto() {
						return huodongxinxiPhoto;
					}
					/**
					* 设置： 封面
					*/
					public void setHuodongxinxiPhoto(String huodongxinxiPhoto) {
						this.huodongxinxiPhoto = huodongxinxiPhoto;
					}

					/**
					* 获取： 赞
					*/
					public Integer getZanNumber() {
						return zanNumber;
					}
					/**
					* 设置： 赞
					*/
					public void setZanNumber(Integer zanNumber) {
						this.zanNumber = zanNumber;
					}

					/**
					* 获取： 踩
					*/
					public Integer getCaiNumber() {
						return caiNumber;
					}
					/**
					* 设置： 踩
					*/
					public void setCaiNumber(Integer caiNumber) {
						this.caiNumber = caiNumber;
					}

					/**
					* 获取： 活动信息详情
					*/
					public String getHuodongxinxiContent() {
						return huodongxinxiContent;
					}
					/**
					* 设置： 活动信息详情
					*/
					public void setHuodongxinxiContent(String huodongxinxiContent) {
						this.huodongxinxiContent = huodongxinxiContent;
					}
















				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
