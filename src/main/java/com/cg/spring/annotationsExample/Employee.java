package com.cg.spring.annotationsExample;

import javax.annotation.*;

public class Employee {
    private int id;
    private String name;
    private Address employeeAddress;

    public Employee(int id, String name, Address employeeAddress) {
        this.id = id;
        this.name = name;
        this.employeeAddress = employeeAddress;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(Address employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employeeAddress=" + employeeAddress +
                '}';
    }


    @PostConstruct
    public void initMethod(){
        System.out.println("Inside Init Method");
    }

    @PreDestroy
    public void destroyMethod(){
        System.out.println("Inside destroy method");
    }
}
