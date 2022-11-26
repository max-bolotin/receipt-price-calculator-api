package com.example.receiptpricecalculatorapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/items")
public class ItemController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello world!";
    }

}
