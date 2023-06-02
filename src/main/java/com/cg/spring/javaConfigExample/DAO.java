package com.cg.spring.javaConfigExample;


import org.springframework.stereotype.Component;

@Component
public class DAO {
    public String create(){
        return ("inside DAO class, create method");
    }
}
