package com.fsd.discounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DiscountsApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(DiscountsApplication.class, args);
	}
}
