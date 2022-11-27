package com.example.receiptpricecalculatorapi.dto.mapper;

public interface ItemMapper<D, T> {
    D parseDto(T dto);
}
