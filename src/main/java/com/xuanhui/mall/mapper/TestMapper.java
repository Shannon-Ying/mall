package com.xuanhui.mall.mapper;

import com.xuanhui.mall.entity.Test;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Test record);

    int insertSelective(Test record);

    List<Test> selectByPrimaryKey();

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);

    /**
     * 根据 code 查询
     *
     * @param code
     * @param languageCode
     * @return
     */
    Test selectByCode(@Param("code") String code,
                                    @Param("languageCode") String languageCode);
}