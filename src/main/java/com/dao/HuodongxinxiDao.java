package com.dao;

import com.entity.HuodongxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.HuodongxinxiView;

/**
 * 活动信息 Dao 接口
 *
 * @author 
 */
public interface HuodongxinxiDao extends BaseMapper<HuodongxinxiEntity> {

   List<HuodongxinxiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
