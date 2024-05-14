package com.dao;

import com.entity.HuodongxinxiCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.HuodongxinxiCollectionView;

/**
 * 活动信息收藏 Dao 接口
 *
 * @author 
 */
public interface HuodongxinxiCollectionDao extends BaseMapper<HuodongxinxiCollectionEntity> {

   List<HuodongxinxiCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
