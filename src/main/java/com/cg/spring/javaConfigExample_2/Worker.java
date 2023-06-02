package com.cg.spring.javaConfigExample_2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Worker {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EmployeeAddressConfigClass.class);
        Employee employeeBean = ctx.getBean("employee1", Employee.class);
        Employee employeeBean_1 = ctx.getBean("employee2", Employee.class);
        System.out.println(employeeBean);
        System.out.println(employeeBean_1);
    }
}
