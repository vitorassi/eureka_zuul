package com.anderson.serviceproductdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceProductDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceProductDemoApplication.class, args);
	}

}
