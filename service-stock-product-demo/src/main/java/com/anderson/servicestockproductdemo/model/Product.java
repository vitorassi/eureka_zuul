package com.anderson.servicestockproductdemo.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {

    private Long id;
    private String description;
    private String observation;
    private StockProduct stockProduct;

}
