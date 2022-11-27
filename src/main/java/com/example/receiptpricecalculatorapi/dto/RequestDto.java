package com.example.receiptpricecalculatorapi.dto;

import lombok.Data;

@Data
public class RequestDto {
    private ItemDto[] itemDtos;
}
