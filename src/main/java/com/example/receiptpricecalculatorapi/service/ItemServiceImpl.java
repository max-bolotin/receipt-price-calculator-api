package com.example.receiptpricecalculatorapi.service;

import com.example.receiptpricecalculatorapi.dto.ItemDto;
import com.example.receiptpricecalculatorapi.dto.ResponseDto;
import com.example.receiptpricecalculatorapi.dto.mapper.ItemMapper;
import com.example.receiptpricecalculatorapi.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ItemServiceImpl implements ItemService {
    private final HttpClient httpClient;
    private final ItemRepository repository;
    private final ItemMapper mapper;

    public ItemServiceImpl(HttpClient httpClient, ItemRepository repository, ItemMapper mapper) {
        this.httpClient = httpClient;
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public void syncItems() {
        ItemDto[] responseDto = httpClient.get(
                "https://certified-lighting.com/external-api/input-items.json", ItemDto[].class);
        System.out.println(Arrays.toString(responseDto));

    }
}
