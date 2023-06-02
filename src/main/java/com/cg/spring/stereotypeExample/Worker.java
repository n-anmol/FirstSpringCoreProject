package com.cg.spring.stereotypeExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Worker {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("stereotypeExample.xml");
        Customer customerBean = (Customer) ctx.getBean("customerBean");
        Customer customerBean_1 = (Customer) ctx.getBean("customerBean");
        System.out.println(customerBean.hashCode());
        System.out.println(customerBean_1.hashCode());
        System.out.println(customerBean_1 + " " + customerBean);
    }
}
