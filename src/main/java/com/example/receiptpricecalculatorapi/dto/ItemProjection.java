package com.example.receiptpricecalculatorapi.dto;

import java.math.BigDecimal;
import org.springframework.stereotype.Component;

@Component
public interface ItemProjection {
    Long getId();

    BigDecimal getPrice();

    String getItem_description();

    String getItem_id();
}
