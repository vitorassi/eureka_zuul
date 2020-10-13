package com.anderson.serviceproductdemo.service;

import com.anderson.serviceproductdemo.integration.ProductIntegration;
import com.anderson.serviceproductdemo.model.Order;
import com.anderson.serviceproductdemo.model.Product;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceOrder {

    private  ProductIntegration productIntegration;

    public ServiceOrder(ProductIntegration productIntegration) {
        this.productIntegration = productIntegration;
    }

    public Order getOrder(Long id){

        Product product = productIntegration.get(1l);

        return Order.builder().products(List.of(product)).build();

    }
}
