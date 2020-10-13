package com.anderson.serviceproductdemo.integration;

import com.anderson.serviceproductdemo.model.Product;

public class ProductIntegrationFallBack implements ProductIntegration {

    @Override
    public Product get(Long id){
        return Product.builder().description("Fall Back").build();
    }


}
