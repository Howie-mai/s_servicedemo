package com.zhku.mh.servicedemo;

import com.zhku.mh.servicedemo.entities.User;
import com.zhku.mh.servicedemo.service.UserService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ServicedemoServiceApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void TestGet(){
        User user = userService.get(1);
        System.out.println(user);
    }
}
