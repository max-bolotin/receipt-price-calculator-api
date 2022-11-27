package com.example.receiptpricecalculatorapi.controller;

import com.example.receiptpricecalculatorapi.dto.ItemProjection;
import com.example.receiptpricecalculatorapi.service.ItemService;
import io.swagger.annotations.ApiOperation;
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

    @GetMapping("/save")
    @ApiOperation("Save products info from the receipt into the DB")
    public String saveItemsToDb() {
        itemService.syncItems();
        return "Items saved successfully!";
    }

    @GetMapping("/get-result")
    @ApiOperation("Get the products with calculated total price with discounts applied")
    public List<ItemProjection> getResult() {
        return itemService.getTotalPriceForAllItems();
    }
}
