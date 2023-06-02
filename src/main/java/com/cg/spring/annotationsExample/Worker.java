package com.cg.spring.annotationsExample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Worker {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("annotationsExample.xml");
        Employee employeeBean = (Employee) ctx.getBean("employeeBean");
        System.out.println(employeeBean);
        ctx.close();
    }
}
