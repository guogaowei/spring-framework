package com.ggw.demo.service.Impl;

import com.ggw.demo.dao.IndexDao;
import com.ggw.demo.service.IndexService;

public class IndexServiceImpl implements IndexService {

    private IndexDao indexDao;

    public IndexServiceImpl(IndexDao indexDao) {
        this.indexDao = indexDao;
    }

    public void service(){
        indexDao.test();
    }
}
