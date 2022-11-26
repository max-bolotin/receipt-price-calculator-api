package com.example.receiptpricecalculatorapi.controller;

import com.example.receiptpricecalculatorapi.service.ItemService;
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

    @GetMapping("/hello")
    public String hello() {
        itemService.syncItems();
        return "Hello world!";
    }

}
