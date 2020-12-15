package com.ggw.demo;

import com.ggw.demo.config.SpringConfig;
import com.ggw.demo.service.Impl.AnnotationServiceImpl;
import com.ggw.demo.service.Impl.AutoAssemblingServiceImpl;
import com.ggw.demo.service.Impl.IndexServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        // 1：测试线程内启动此线程
        /*InnerStartThread  innerStartThread = new InnerStartThread();*/

        // 2：xml形式加载文件  xml配置和注解两种形式
        /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
        IndexServiceImpl service = (IndexServiceImpl) context.getBean("serviceImpl");
        service.service();

        AnnotationServiceImpl test = (AnnotationServiceImpl) context.getBean("annotationServiceImpl");
        test.service();*/

        // 3: Java config形式加载文件
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        AutoAssemblingServiceImpl autoAssemblingServiceImpl = (AutoAssemblingServiceImpl) context.getBean("autoServiceImpl");
        autoAssemblingServiceImpl.service();
    }
}
