package com.wiekh.dinobackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DinoBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(DinoBackendApplication.class, args);
    }

}
