package com.cg.spring.javaConfigExample_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class EmployeeAddressConfigClass {

    @Bean(name = "employeeAddress")
    @Scope("prototype")
    public Address initAddress() {
        Address add = new Address();
        add.setHouseNumber(101);
        add.setCity("Bengaluru");
        add.setStreet("Vijaynagar");
        return add;
    }


    @Bean(name = "employeeAddress1")
    @Scope("prototype")
    public Address initAddress_1() {
        Address add = new Address();
        add.setHouseNumber(102);
        add.setCity("Chennai");
        add.setStreet("Koimbedu");
        return add;
    }

    @Bean(name = "employee1")
    @Scope("prototype")
    public Employee initEmployee() {
        return new Employee(1001, "Anmol", 26092.0d, null);
    }

    @Bean(name = "employee2")
    public Employee initEmployee_1() {
        Employee emp = new Employee(1002, "Vinod", 26092.0d, null);
        emp.setEmployeeAddress(initAddress_1());
        System.out.println(emp.getEmployeeAddress());
        return emp;
    }

}
