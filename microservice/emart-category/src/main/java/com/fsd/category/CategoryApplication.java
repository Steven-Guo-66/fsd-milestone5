package com.fsd.category;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CategoryApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(CategoryApplication.class, args);
	}
}
