package com.cg.spring.javaConfigExample_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    private int employeeId;
    private String employeeName;
    private double employeeSalary;

    @Autowired
    private Address employeeAddress;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, double salary, Address employeeAddress) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = salary;
        this.employeeAddress = employeeAddress;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return employeeSalary;
    }

    public void setSalary(double salary) {
        this.employeeSalary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", employeeAddress=" + employeeAddress +
                '}';
    }

    public Address getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(Address employeeAddress) {
        this.employeeAddress = employeeAddress;
    }
}
