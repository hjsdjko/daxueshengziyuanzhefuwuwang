package com.entity.vo;

import com.entity.HuodongxinxiOrderEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 活动报名
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("huodongxinxi_order")
public class HuodongxinxiOrderVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 报名编号
     */

    @TableField(value = "huodongxinxi_order_uuid_number")
    private String huodongxinxiOrderUuidNumber;


    /**
     * 活动
     */

    @TableField(value = "huodongxinxi_id")
    private Integer huodongxinxiId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 报名时间
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
	 * 设置：报名编号
	 */
    public String getHuodongxinxiOrderUuidNumber() {
        return huodongxinxiOrderUuidNumber;
    }


    /**
	 * 获取：报名编号
	 */

    public void setHuodongxinxiOrderUuidNumber(String huodongxinxiOrderUuidNumber) {
        this.huodongxinxiOrderUuidNumber = huodongxinxiOrderUuidNumber;
    }
    /**
	 * 设置：活动
	 */
    public Integer getHuodongxinxiId() {
        return huodongxinxiId;
    }


    /**
	 * 获取：活动
	 */

    public void setHuodongxinxiId(Integer huodongxinxiId) {
        this.huodongxinxiId = huodongxinxiId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：报名时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：报名时间
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
