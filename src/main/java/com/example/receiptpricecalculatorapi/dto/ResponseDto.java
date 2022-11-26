package com.example.receiptpricecalculatorapi.dto;

import java.math.BigDecimal;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ResponseDto {
    private Long id;
    private BigDecimal price;
    private String itemDescription;
    private String itemId;

}
