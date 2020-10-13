package com.anderson.serviceproductdemo.config;

import com.anderson.serviceproductdemo.integration.ProductIntegrationFallBack;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    public ProductIntegrationFallBack productIntegrationFallBack(){
        return new ProductIntegrationFallBack();
    }
}
