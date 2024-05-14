package com.dao;

import com.entity.HuodongxinxiLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.HuodongxinxiLiuyanView;

/**
 * 活动信息留言 Dao 接口
 *
 * @author 
 */
public interface HuodongxinxiLiuyanDao extends BaseMapper<HuodongxinxiLiuyanEntity> {

   List<HuodongxinxiLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
