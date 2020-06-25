package com.fsd.seller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SellerApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SellerApplication.class, args);
	}
}
