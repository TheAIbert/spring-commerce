package com.thealbert.springcommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class OrderItemDto {
    private Long productId;
    private String productName;
    private String productBrand;
    private int quantity;
    private BigDecimal price;
}
