package com.ggw.demo.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

// Javaconfig 配置 类似xml
@Configuration
// 注解扫描包
@ComponentScan(value = "com.ggw"/*,
		excludeFilters = {@ComponentScan.Filter(type = FilterType.REGEX, pattern = "com.ggw.demo.exampleTest")}*/)
// 导入xml 引用
//@ImportResource("classpath:spring.xml")
public class SpringConfig {

	@Bean
	@Autowired
	public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		return sqlSessionFactoryBean;
	}

	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql://123.207.207.41:3306/mortgage");
		driverManagerDataSource.setUsername("carticle");
		driverManagerDataSource.setPassword("eihiAso3+0+abc");
		return driverManagerDataSource;
	}

}
