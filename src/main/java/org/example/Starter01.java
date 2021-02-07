package org.example;

import org.example.config.IocConfig;
import org.example.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Starter01 {

    public static void main(String[] args) {
        //基于JAV额配置类获取Spring的上下文环境
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(IocConfig.class);

        //得到Bean对象
        UserService userService = ac.getBean(UserService.class);
        userService.test();
    }
}
