package com.ggw.demo;

import com.ggw.demo.config.Appconfig;
import com.ggw.demo.jdkProxy.Dao;
import com.ggw.demo.dao.IndexDao;
import com.ggw.demo.jdkProxy.JdkProxyAopDemo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Proxy;

public class AopTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
		IndexDao indexDao = (IndexDao) context.getBean("indexDao");
		//无参数
		//indexDao.query();

		//有参数
		//indexDao.query("str");

		//有返回值
		//indexDao.queryForReturn();

		//注解切面
		//indexDao.queryForAnno();


		//JDK Proxy AOP
		//直接通过类型获取对象
		//Dao jdkProxyAopDemo = context.getBean(JdkProxyAopDemo.class);
		//通过名称获取对象
		Dao jdkProxyAopDemo = (Dao) context.getBean("jdkProxyAopDemo");
		jdkProxyAopDemo.query();
		//jdk 动态代理为什么不使用继承，使用聚合 生成的代理对象会继承 Proxy 类，由于java是单继承，所以目标对象只能是接口
		//cglib 代理对象继承了目标对象
		//实现代理的集中方式1：继承，2:聚合(接口) 3:动态代理
		System.out.println(jdkProxyAopDemo instanceof Dao);
		System.out.println(jdkProxyAopDemo instanceof Proxy);
		System.out.println(jdkProxyAopDemo instanceof JdkProxyAopDemo);

		//这部分目前在源码工程中报错，其他的测试可以
		//给对应的类文件生成一个代理类
		/*Class<?>[] interfaces = new Class<?>[]{Dao.class};
		byte[] bytes = ProxyGenerator.generateProxyClass("AspectDemoA", interfaces);

		File file = new File("/Users/guogw/Test.class");

		try{
			FileOutputStream fw = new FileOutputStream(file);
			fw.write(bytes);
			fw.flush();
			fw.close();
		}catch (Exception ex){

		}finally {

		}*/

	}

}
