package com.example.receiptpricecalculatorapi.service;

import com.example.receiptpricecalculatorapi.dto.ItemProjection;
import java.util.List;

public interface ItemService {
    void syncItems();

    List<ItemProjection> getTotalPriceForAllItems();
}
