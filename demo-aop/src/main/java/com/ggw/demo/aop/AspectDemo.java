package com.ggw.demo.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Component 不添加的话 Aspect注解的此类是不能是被spring管理的
 */
@Component
@Aspect
public class AspectDemo {

	/**
	 * 切点，多个连接点
	 */
	@Pointcut("execution(* com.ggw.demo.dao.*.*(..))")
	public void pointCut(){
	}

	/**
	 * 前通知
	 */
	@Before("pointCut()")
	public void before(){
		System.out.println("before");
	}

	/**
	 * 后通知
	 */
	@After("pointCut()")
	public void after(){
		System.out.println("after");
	}
}
