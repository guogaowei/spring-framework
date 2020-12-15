package com.ggw.demo.dao.Impl;

import com.ggw.demo.dao.IndexDao;

public class IndexDaoImpl implements IndexDao {

    private String val;


    public void setVal(String val) {
        this.val = val;
    }

    @Override
    public void test(){
        System.out.println(val);
    }
}
