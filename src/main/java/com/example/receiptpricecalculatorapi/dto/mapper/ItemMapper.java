package com.example.receiptpricecalculatorapi.dto.mapper;

import com.example.receiptpricecalculatorapi.dto.ItemDto;
import com.example.receiptpricecalculatorapi.dto.ResponseDto;
import com.example.receiptpricecalculatorapi.model.Item;
import com.example.receiptpricecalculatorapi.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ItemMapper {
    ItemService itemService;

    public ItemMapper(ItemService itemService) {
        this.itemService = itemService;
    }

    public Item parseDto(ItemDto dto) {
        Item item = new Item();
        item.setBasePrice(dto.getBasePrice());
        item.setItemDescription(dto.getItemDescription());
        item.setUnits(dto.getUnits());
        item.setItemId(dto.getItemId());
        item.setPercentageDiscount(dto.getPercentageDiscount());
        return item;
    }

    public ResponseDto toResponseDto(Item item) {
        ResponseDto responseDto = new ResponseDto();
        responseDto.setId(item.getId());
        responseDto.setPrice(itemService.totalPrice(item));
        responseDto.setItemId(item.getItemId());
        return responseDto;
    }
}
