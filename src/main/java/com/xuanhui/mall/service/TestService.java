package com.xuanhui.mall.service;


import com.xuanhui.mall.entity.Test;

import java.util.List;

/**
 * @author sinsy
 * @date 2021-06-26
 */
public interface TestService {

    int add(Test errorInfo);

    int update(Test errorInfo);

    int del(Long id);

    List<Test> get();
}
