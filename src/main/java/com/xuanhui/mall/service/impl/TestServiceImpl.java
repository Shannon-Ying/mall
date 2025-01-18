package com.xuanhui.mall.service.impl;


import com.xuanhui.mall.entity.Test;
import com.xuanhui.mall.mapper.TestMapper;
import com.xuanhui.mall.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {


    @Autowired
    private TestMapper mapper;


    @Override
    public int add(Test errorInfo) {
        return mapper.insert(errorInfo);
    }

    @Override
    public int update(Test errorInfo) {
        return mapper.updateByPrimaryKeySelective(errorInfo);
    }

    @Override
    public int del(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Test> get() {
        return mapper.selectByPrimaryKey();
    }
}
