package com.ggw.demo.jdkProxy;

import org.springframework.stereotype.Service;

@Service
public class JdkProxyAopDemo implements Dao {

	@Override
	public void query() {
		System.out.println("JDK动态代理测试");
	}
}
