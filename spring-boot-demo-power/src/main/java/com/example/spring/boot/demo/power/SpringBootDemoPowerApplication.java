package com.example.spring.boot.demo.power;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.example.spring.boot.demo.power.dao")
@SpringBootApplication
public class SpringBootDemoPowerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoPowerApplication.class, args);
    }

}
