package org.example;

import org.example.config.IocConfig03;
import org.example.service.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Starter03 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(IocConfig03.class);

        IocConfig03 iocConfig03 = ac.getBean(IocConfig03.class);

        iocConfig03.test();

        AccountService accountService = ac.getBean(AccountService.class);
        accountService.test();

    }
}
