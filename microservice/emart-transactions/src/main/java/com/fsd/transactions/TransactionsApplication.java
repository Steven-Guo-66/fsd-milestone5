package com.fsd.transactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TransactionsApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(TransactionsApplication.class, args);
	}
}
