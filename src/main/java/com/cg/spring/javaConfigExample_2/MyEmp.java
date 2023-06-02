package com.cg.spring.javaConfigExample_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyEmp {

    @Bean(name = "employee2")
    public Employee initEmployee_1() {
        return new Employee(1002, "Vinod", 26092.0d, null);
    }

}
