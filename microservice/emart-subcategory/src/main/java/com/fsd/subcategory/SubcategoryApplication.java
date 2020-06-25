package com.fsd.subcategory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SubcategoryApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SubcategoryApplication.class, args);
	}
}
