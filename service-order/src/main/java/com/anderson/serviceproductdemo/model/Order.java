package com.anderson.serviceproductdemo.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class Order {
    private String hashedId;
    private List<Product> products;
}
