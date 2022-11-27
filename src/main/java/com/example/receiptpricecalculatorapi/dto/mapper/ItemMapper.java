package com.example.receiptpricecalculatorapi.dto.mapper;

import com.example.receiptpricecalculatorapi.dto.ItemDto;
import com.example.receiptpricecalculatorapi.model.Item;
import com.example.receiptpricecalculatorapi.util.PriceCalcUtil;
import org.springframework.stereotype.Component;

@Component
public class ItemMapper {
    public Item parseDto(ItemDto dto) {
        Item item = new Item();
        item.setBasePrice(dto.getBasePrice());
        item.setItemDescription(dto.getItemDescription());
        item.setUnits(dto.getUnits());
        item.setItemId(dto.getItemId());
        item.setPercentageDiscount(dto.getPercentageDiscount());
        return item;
    }
}
