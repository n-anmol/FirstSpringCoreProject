package com.cg.spring.javaConfigExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Worker {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DAOConfig.class);
//        DAO daoBean = ctx.getBean(DAO.class);
//        System.out.println(daoBean.create());
        Service serviceBean = ctx.getBean(Service.class);
        serviceBean.printDAO();
    }
}
