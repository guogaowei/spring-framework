package com.ggw.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
/**
 * 添加包的扫描
 */
@ComponentScan("com.ggw.demo")
/**
 * 开启AspectJ语法支持 proxyTargetClass true 是使用cglib, 默认使用jdk动态代理
 */
@EnableAspectJAutoProxy(proxyTargetClass = false)
public class Appconfig {
}
