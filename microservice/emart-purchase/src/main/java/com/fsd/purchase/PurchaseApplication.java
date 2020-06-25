package com.fsd.purchase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PurchaseApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(PurchaseApplication.class, args);
	}
}
