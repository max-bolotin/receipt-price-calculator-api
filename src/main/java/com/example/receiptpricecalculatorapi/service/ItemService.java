package com.example.receiptpricecalculatorapi.service;

import com.example.receiptpricecalculatorapi.model.Item;

import java.math.BigDecimal;

public interface ItemService {
    void syncItems();

    BigDecimal totalPrice(Item item);
}
