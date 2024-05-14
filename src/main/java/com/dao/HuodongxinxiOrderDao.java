package com.dao;

import com.entity.HuodongxinxiOrderEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.HuodongxinxiOrderView;

/**
 * 活动报名 Dao 接口
 *
 * @author 
 */
public interface HuodongxinxiOrderDao extends BaseMapper<HuodongxinxiOrderEntity> {

   List<HuodongxinxiOrderView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
