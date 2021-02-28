package org.example;

import org.example.config.IocConfig04;
import org.example.service.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Starter04 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(IocConfig04.class);

        IocConfig04 iocConfig04 = ac.getBean(IocConfig04.class);

        iocConfig04.test();

        AccountService accountService = ac.getBean(AccountService.class);
        accountService.test();

    }
}
