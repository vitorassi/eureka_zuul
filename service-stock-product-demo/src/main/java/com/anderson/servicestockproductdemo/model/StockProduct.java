package com.anderson.servicestockproductdemo.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class StockProduct {

    private Long productId;
    private BigDecimal quantity;

}
