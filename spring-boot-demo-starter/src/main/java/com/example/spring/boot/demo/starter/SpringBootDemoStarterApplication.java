package com.example.spring.boot.demo.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class SpringBootDemoStarterApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoStarterApplication.class, args);
	}

}
