package com.ggw.demo;

import com.ggw.demo.config.Appconfig;
import com.ggw.demo.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
		IndexDao indexDao = (IndexDao) context.getBean("indexDao");
		indexDao.query();
	}

}
