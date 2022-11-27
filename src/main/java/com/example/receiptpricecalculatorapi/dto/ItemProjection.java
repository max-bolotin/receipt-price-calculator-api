package com.example.receiptpricecalculatorapi.dto;

import org.springframework.stereotype.Component;
import java.math.BigDecimal;

@Component
public interface ItemProjection {
    Long getId();
    BigDecimal getPrice();
    String getItem_description();
    String getItem_id();
}
