package com.example.receiptpricecalculatorapi.controller;

import com.example.receiptpricecalculatorapi.dto.ItemProjection;
import com.example.receiptpricecalculatorapi.service.ItemService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/items")
public class ItemController {
    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/check")
    public String hello() {
        itemService.syncItems();
        return "The check is parsed and items are added to DB";
    }

    @GetMapping("/result")
    public List<ItemProjection> getResult() {
        return itemService.getTotalPriceForAllItems();
    }
}
