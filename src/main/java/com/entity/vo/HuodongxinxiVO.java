package com.entity.vo;

import com.entity.HuodongxinxiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 活动信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("huodongxinxi")
public class HuodongxinxiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
