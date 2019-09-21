package com.zhku.mh.servicedemo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zhku.mh.servicedemo.dao")
@EnableDubbo(scanBasePackages = "com.zhku.mh.servicedemo.service")
@SpringBootApplication
public class ServicedemoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicedemoServiceApplication.class, args);
    }

}
