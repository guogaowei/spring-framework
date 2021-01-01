package com.ggw.demo.app;

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
	 * 切点，多个连接点 execution 到参数级别 com.ggw.demo.dao 包下所有访问权限，所有返回类型，所有类和接口，所有接口，所有参数个数
	 */
	@Pointcut("execution(* com.ggw.demo.dao.*.*(..))")
	public void pointCutExecution(){
	}

	/**
	 * within 到方法级别  com.ggw.demo.dao 包下任意的接口和类的方法，任意参数
	 */
	@Pointcut("within(com.ggw.demo.dao..*)")
	public void pointCutWithin(){
	}

	/**
	 * 只有一个参数是String的方法
	 */
	@Pointcut("args(java.lang.String)")
	public void pointCutArgs(){
	}

	/**
	 * 有对应的注解参数的
	 */
	@Pointcut("@annotation(com.ggw.demo.anno.AopAnno)")
	public void pointAnnao(){
	}

	//jdk 代理 this表示的是代理对象 是Dao类型示例 不是 JdkProxyAopDemo
	@Pointcut("this(com.ggw.demo.jdkProxy.JdkProxyAopDemo)")
	//@Pointcut("this(com.ggw.demo.jdkProxy.Dao)")
	public void pointCutThis(){
	}

	@Pointcut("target(com.ggw.demo.jdkProxy.JdkProxyAopDemo)")
	//@Pointcut("target(com.ggw.demo.jdkProxy.JdkProxyAopDemo)")
	public void pointCutTarget(){
	}

	/**
	 * 前通知
	 */
	//@Before("pointCutWithin() && !pointCutArgs()")
	@Before("pointCutTarget()")
	public void before(){
		System.out.println("before");
	}

	/**
	 * 后通知
	 */
	/*@After("pointCutArgs()")
	public void after(){
		System.out.println("after");
	}*/
}
