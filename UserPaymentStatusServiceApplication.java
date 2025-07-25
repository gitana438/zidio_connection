package com.example.zidio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class UserPaymentStatusServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(UserPaymentStatusServiceApplication.class,args);
	}

}
