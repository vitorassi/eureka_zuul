package com.anderson.servicestockproductdemo.integration;

import com.anderson.servicestockproductdemo.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient("product-service")
@Service
public interface ProductIntegration {

    @GetMapping("product/{id}")
    Product get(@PathVariable("id") Long id);

}
