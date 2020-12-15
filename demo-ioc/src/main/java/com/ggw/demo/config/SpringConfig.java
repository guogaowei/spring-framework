package com.ggw.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

// Javaconfig 配置 类似xml
@Configuration
// 注解扫描包
@ComponentScan("com.ggw")
// 导入xml 引用
@ImportResource("classpath:spring.xml")
public class SpringConfig {

}
