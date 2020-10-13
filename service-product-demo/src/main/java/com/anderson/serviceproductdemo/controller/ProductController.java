package com.anderson.serviceproductdemo.controller;


import com.anderson.serviceproductdemo.model.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/product")
public class ProductController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id) {

        Product product = Product.builder()
                .id(id)
                .description("Produto "+ id)
                .observation("Porta do Serviço que carregou o produto :"+ port)
                .build();

        return ResponseEntity.ok(product);
    }
}
