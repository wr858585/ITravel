package com.atguigu.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.service.HelloService;

/**
 * @author oono
 * @date 2020 11 18
 */

//注意：该@Service注解是dubbo的注解，可以进行远程注册。一定不能选以前的spring的@Service注解
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "hello" + name;
    }
}
