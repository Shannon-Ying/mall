package com.xuanhui.mall;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@EnableScheduling
@EnableConfigurationProperties
@ServletComponentScan("com.xuanhui.mall.*")
@EnableTransactionManagement
@EnableAspectJAutoProxy
@EnableAsync
@MapperScan("com.xuanhui.mall.mapper")
public class MallApplication {


    public static void main(String[] args) {
        System.setProperty("Log4jContextSelector",
                "org.apache.logging.log4j.core.async.AsyncLoggerContextSelector");
        SpringApplication.run(MallApplication.class, args);
    }


}
