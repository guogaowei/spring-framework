package com.ggw.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
/**
 * 添加包的扫描
 */
@ComponentScan("com")
/**
 * 开启AspectJ语法支持
 */
@EnableAspectJAutoProxy
public class Appconfig {
}
