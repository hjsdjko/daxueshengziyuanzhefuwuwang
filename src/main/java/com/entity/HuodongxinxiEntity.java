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
 * 活动信息
 *
 * @author 
 * @email
 */
@TableName("huodongxinxi")
public class HuodongxinxiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public HuodongxinxiEntity() {

	}

	public HuodongxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 活动信息标题
     */
    @TableField(value = "huodongxinxi_name")

    private String huodongxinxiName;


    /**
     * 活动类型
     */
    @TableField(value = "huodongxinxi_types")

    private Integer huodongxinxiTypes;


    /**
     * 封面
     */
    @TableField(value = "huodongxinxi_photo")

    private String huodongxinxiPhoto;


    /**
     * 赞
     */
    @TableField(value = "zan_number")

    private Integer zanNumber;


    /**
     * 踩
     */
    @TableField(value = "cai_number")

    private Integer caiNumber;


    /**
     * 活动信息详情
     */
    @TableField(value = "huodongxinxi_content")

    private String huodongxinxiContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：活动信息标题
	 */
    public String getHuodongxinxiName() {
        return huodongxinxiName;
    }
    /**
	 * 获取：活动信息标题
	 */

    public void setHuodongxinxiName(String huodongxinxiName) {
        this.huodongxinxiName = huodongxinxiName;
    }
    /**
	 * 设置：活动类型
	 */
    public Integer getHuodongxinxiTypes() {
        return huodongxinxiTypes;
    }
    /**
	 * 获取：活动类型
	 */

    public void setHuodongxinxiTypes(Integer huodongxinxiTypes) {
        this.huodongxinxiTypes = huodongxinxiTypes;
    }
    /**
	 * 设置：封面
	 */
    public String getHuodongxinxiPhoto() {
        return huodongxinxiPhoto;
    }
    /**
	 * 获取：封面
	 */

    public void setHuodongxinxiPhoto(String huodongxinxiPhoto) {
        this.huodongxinxiPhoto = huodongxinxiPhoto;
    }
    /**
	 * 设置：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }
    /**
	 * 获取：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 设置：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }
    /**
	 * 获取：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 设置：活动信息详情
	 */
    public String getHuodongxinxiContent() {
        return huodongxinxiContent;
    }
    /**
	 * 获取：活动信息详情
	 */

    public void setHuodongxinxiContent(String huodongxinxiContent) {
        this.huodongxinxiContent = huodongxinxiContent;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Huodongxinxi{" +
            "id=" + id +
            ", huodongxinxiName=" + huodongxinxiName +
            ", huodongxinxiTypes=" + huodongxinxiTypes +
            ", huodongxinxiPhoto=" + huodongxinxiPhoto +
            ", zanNumber=" + zanNumber +
            ", caiNumber=" + caiNumber +
            ", huodongxinxiContent=" + huodongxinxiContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
