package org.example;

import org.example.config.IocConfig02;
import org.example.dao.AccountDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Starter02 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(IocConfig02.class);

        IocConfig02 iocConfig02 = ac.getBean(IocConfig02.class);
        IocConfig02 iocConfig03 = ac.getBean(IocConfig02.class);

        AccountDao accountDao01 = iocConfig02.getAccount();
        AccountDao accountDao02 = iocConfig02.getAccount();

        System.out.println(iocConfig02+"====="+iocConfig03);
        System.out.println(accountDao01+"====="+accountDao02);
    }
}
