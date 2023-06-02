package com.cg.spring.javaConfigExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DAOConfig {

    @Bean
    public DAO daoGenerate() {
        return new DAO();
    }

    @Bean
    public Service serviceGenerate() {
        return new Service();
    }
}
