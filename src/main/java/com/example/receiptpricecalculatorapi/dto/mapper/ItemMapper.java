package com.example.receiptpricecalculatorapi.dto.mapper;

import com.example.receiptpricecalculatorapi.dto.ItemDto;
import com.example.receiptpricecalculatorapi.model.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemMapper {
    public Item parseDto(ItemDto dto) {
        Item item = new Item();
        item.setBasePrice(dto.getBasePrice());
        item.setUnits(dto.getUnits());
        item.setItemId(dto.getItemId());
        item.setPercentageDiscount(dto.getPercentageDiscount());
        return item;
    }
}
