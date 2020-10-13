package com.anderson.servicestockproductdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
//@EnableDiscoveryClient
@EnableEurekaClient
public class ServiceStockProductDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceStockProductDemoApplication.class, args);
	}

}
