package com.cg.spring.stereotypeExample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "customerBean")
@Scope(value = "prototype")
public class Customer {
    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Value(value = "101")
    private int id;

    @Value(value = "Anmol")
    private String name;

    public Customer() {
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

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
