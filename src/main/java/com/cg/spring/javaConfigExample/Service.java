package com.cg.spring.javaConfigExample;

import org.springframework.beans.factory.annotation.Autowired;

public class Service {
    @Autowired
    DAO daoBean;
    public void printDAO(){
        System.out.println(daoBean.create());
    }
}
