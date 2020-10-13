package com.anderson.servicestockproductdemo.controller;


import com.anderson.servicestockproductdemo.integration.ProductIntegration;
import com.anderson.servicestockproductdemo.model.Product;
import com.anderson.servicestockproductdemo.model.StockProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;


@RestController
@RequestMapping("/product/{id}/stock")
public class ProductController {

    @Autowired
    private ProductIntegration productIntegration;

    @GetMapping
    public ResponseEntity get(@PathVariable("id") Long id) {

        Product product = productIntegration.get(id);

        product.setStockProduct(
                StockProduct.builder()
                        .productId(product.getId())
                        .quantity(new BigDecimal("99.00")).build()
        );


        return ResponseEntity.ok(product);
    }
}
