package com.anderson.serviceproductdemo.controller;


import com.anderson.serviceproductdemo.model.Order;
import com.anderson.serviceproductdemo.model.Product;
import com.anderson.serviceproductdemo.service.ServiceOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private ServiceOrder serviceOrder;

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id) {

        Order order = serviceOrder.getOrder(id);

        return ResponseEntity.ok(order);
    }
}
