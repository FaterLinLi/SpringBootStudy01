package org.example.config;


import org.example.dao.AccountDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.example")
//通过@PropertySource加载配置文件，结合@Value直接获取指定key的value
@PropertySource(value = {"classpath:jdbc.properties","classpath:user.properties"})
public class IocConfig03 {

    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String name;
    @Value("${jdbc.password}")
    private String pwd;
    @Value("${user.userName}")
    private String userName;
    @Value("${user.password}")
    private String userPwd;

    public void test(){
        System.out.println(driver + "," + url);
        System.out.println(name + "," + pwd);
        System.out.println(userName + "," + userPwd);
    }

}
