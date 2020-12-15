package com.ggw.demo.service.Impl;

import com.ggw.demo.dao.Impl.AnnotationDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnnotationServiceImpl {

    @Autowired
    private AnnotationDaoImpl annotationDao;

    public void service(){
        annotationDao.test();
    }
}
