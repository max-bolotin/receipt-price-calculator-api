package com.example.receiptpricecalculatorapi.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ItemDto {
    private Long id;
    private BigDecimal basePrice;
    private int units;
    private int percentageDiscount;
    private String itemId;
}
