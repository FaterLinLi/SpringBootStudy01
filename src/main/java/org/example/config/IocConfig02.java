package org.example.config;


import org.example.dao.AccountDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class IocConfig02 {

    /**
     * 使用@Bean注解声明在方法（注意：方法名一般为Bean对象名称）级别用于返回实例化的Bean对象
     * 一般用于集成第三方框架或组件，比如：数据源、视图解析器等 （只需要实例化一次的Bean对象）
     * @return
     */
    @Bean//通过@Bean注解的方法，方法的返回值会交给IOC进行维护（返回的AccountDa会交给IOC实例化，也是一个单例）
    public AccountDao getAccount(){
        return new AccountDao();
    }

}
