package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class SpringReservationService2Application {
	
	@RequestMapping("/hello")
	String index() {
		return "这是服务2Hello Spring Boot";
	}	

	@RequestMapping("/hello2")
	String index2(String str) {
		return "这是服务2Hello Spring Boot"+str;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringReservationService2Application.class, args);
	}
}
