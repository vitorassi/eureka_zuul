package com.anderson.serviceproductdemo.integration;


import com.anderson.serviceproductdemo.config.FeignConfig;
import com.anderson.serviceproductdemo.model.Product;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(value = "product-service",
        configuration = FeignConfig.class,
        fallback = ProductIntegrationFallBack.class
)
public interface ProductIntegration {

    @GetMapping("product/{id}")
    Product get(@PathVariable("id") Long id);

}
