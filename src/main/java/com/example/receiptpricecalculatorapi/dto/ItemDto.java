package com.example.receiptpricecalculatorapi.dto;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class ItemDto {
    private Long id;
    private BigDecimal basePrice;
    private String itemDescription;
    private int units;
    private int percentageDiscount;
    private String itemId;
}
