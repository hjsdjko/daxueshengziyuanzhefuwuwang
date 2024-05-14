package com.entity.model;

import com.entity.HuodongxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 活动信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class HuodongxinxiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 活动信息标题
     */
    private String huodongxinxiName;


    /**
     * 活动类型
     */
    private Integer huodongxinxiTypes;


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


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：活动信息标题
	 */
    public String getHuodongxinxiName() {
        return huodongxinxiName;
    }


    /**
	 * 设置：活动信息标题
	 */
    public void setHuodongxinxiName(String huodongxinxiName) {
        this.huodongxinxiName = huodongxinxiName;
    }
    /**
	 * 获取：活动类型
	 */
    public Integer getHuodongxinxiTypes() {
        return huodongxinxiTypes;
    }


    /**
	 * 设置：活动类型
	 */
    public void setHuodongxinxiTypes(Integer huodongxinxiTypes) {
        this.huodongxinxiTypes = huodongxinxiTypes;
    }
    /**
	 * 获取：封面
	 */
    public String getHuodongxinxiPhoto() {
        return huodongxinxiPhoto;
    }


    /**
	 * 设置：封面
	 */
    public void setHuodongxinxiPhoto(String huodongxinxiPhoto) {
        this.huodongxinxiPhoto = huodongxinxiPhoto;
    }
    /**
	 * 获取：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 设置：赞
	 */
    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 获取：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 设置：踩
	 */
    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 获取：活动信息详情
	 */
    public String getHuodongxinxiContent() {
        return huodongxinxiContent;
    }


    /**
	 * 设置：活动信息详情
	 */
    public void setHuodongxinxiContent(String huodongxinxiContent) {
        this.huodongxinxiContent = huodongxinxiContent;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
