package com.xuanhui.mall.controller;

import com.xuanhui.mall.entity.Test;
import com.xuanhui.mall.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestService service;


    @PostMapping("add")
    public int add(@RequestBody Test test) {
        return service.add(test);
    }

    @PostMapping("update")
    public int update(@RequestBody Test test) {
        return service.update(test);
    }

    @PostMapping("del")
    public int del(@RequestBody Long id) {
        return service.del(id);
    }

    @PostMapping("get")
    public List<Test> get() {
        return service.get();
    }

}
