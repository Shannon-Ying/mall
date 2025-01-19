package com.xuanhui.mall.mapper;

import com.xuanhui.mall.entity.HotProduct;
import org.springframework.stereotype.Repository;

@Repository
public interface HotProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HotProduct record);

    int insertSelective(HotProduct record);

    HotProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HotProduct record);

    int updateByPrimaryKey(HotProduct record);
}