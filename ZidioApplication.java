package com.example.zidio;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.example")
@EntityScan(basePackages="com.example.entity")
public class ZidioApplication{
	
	public static void main(String[] args) {
		SpringApplication.run(ZidioApplication.class, args);
	}
}
