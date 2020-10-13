package com.anderson.servicezuuldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
@EnableZuulProxy
@EnableAutoConfiguration
@EnableDiscoveryClient
public class ServiceZuulDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceZuulDemoApplication.class, args);
	}

}
