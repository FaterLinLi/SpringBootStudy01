package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //标记当前类作为一个配置类，相当于xml配置文件。组合注解，包含其他注解的功能
@ComponentScan("org.example")//设置扫描包的范围
public class IocConfig {
}
