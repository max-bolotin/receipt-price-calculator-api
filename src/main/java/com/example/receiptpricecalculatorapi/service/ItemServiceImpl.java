package com.example.receiptpricecalculatorapi.service;

import com.example.receiptpricecalculatorapi.dto.ItemDto;
import com.example.receiptpricecalculatorapi.dto.mapper.ItemMapper;
import com.example.receiptpricecalculatorapi.model.Item;
import com.example.receiptpricecalculatorapi.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
        ItemDto[] itemDtos = httpClient.get(
                "https://certified-lighting.com/external-api/input-items.json", ItemDto[].class);
        System.out.println(Arrays.toString(itemDtos));
        List<Item> items = Arrays.stream(itemDtos)
                .map(mapper::parseDto)
                .collect(Collectors.toList());
        repository.saveAll(items);
    }

    @Override
    public BigDecimal totalPrice(Item item) {
        BigDecimal totalPriceWithoutDiscount = item.getBasePrice().multiply(BigDecimal.valueOf(item.getUnits()));
        BigDecimal discount = totalPriceWithoutDiscount.multiply(BigDecimal.valueOf(item.getPercentageDiscount() / 100));
        return totalPriceWithoutDiscount.subtract(discount);
    }
}
