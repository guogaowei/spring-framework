package com.ggw.demo.dao;


import com.ggw.demo.anno.AopAnno;
import org.springframework.stereotype.Repository;

@Repository
public class IndexDao {

	public void query(){
		System.out.println("indexDao query");
	}

	public void query(String str){
		System.out.println("indexDao query Param Str: "+str);
	}

	public String queryForReturn(){
		System.out.println("indexDao query return String");
		return "string";
	}

	@AopAnno
	public void queryForAnno(){
		System.out.println("indexDao query For Anno: ");
	}

}
