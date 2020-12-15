package com.ggw.demo.service.Impl;

import com.ggw.demo.dao.IndexDao;

public class AutoAssemblingServiceImpl {

    private IndexDao indexDao;

    public void service(){
        indexDao.test();
        System.out.println("自动注入,不需要再显示在xml中进行关系映射");
    }

    public IndexDao getIndexDao() {
        return indexDao;
    }

    public void setIndexDao(IndexDao indexDao) {
        this.indexDao = indexDao;
    }
}
