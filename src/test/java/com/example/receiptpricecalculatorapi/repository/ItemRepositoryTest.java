package com.example.receiptpricecalculatorapi.repository;

import com.example.receiptpricecalculatorapi.dto.ItemProjection;
import com.example.receiptpricecalculatorapi.model.Item;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class ItemRepositoryTest {
    @Autowired
    private ItemRepository itemRepository;

    @Test
    void shouldCalcAndFindPriceWithDiscount() {
        Item item = new Item();
        item.setItemDescription("Roll");
        item.setItemId("300198");
        item.setPercentageDiscount(35);
        item.setUnits(4);
        item.setBasePrice(BigDecimal.valueOf(0.27));
        Item anotherItem = new Item();
        anotherItem.setItemDescription("Soft Drink");
        anotherItem.setItemId("300158");
        anotherItem.setPercentageDiscount(10);
        anotherItem.setUnits(5);
        anotherItem.setBasePrice(BigDecimal.valueOf(0.99));
        itemRepository.saveAll(List.of(item, anotherItem));
        List<ItemProjection> allItems = itemRepository.findAllWithDiscount();
        BigDecimal actual = allItems.get(0).getPrice();
        BigDecimal expected = BigDecimal.valueOf(0.27 * 4 - 0.27 * 4 * 35 / 100).round(new MathContext(2));
        Assertions.assertEquals(expected, actual);
        actual = allItems.get(1).getPrice();
        expected = BigDecimal.valueOf(0.99 * 5 - 0.99 * 5 * 10 / 100).round(new MathContext(3));
        Assertions.assertEquals(expected, actual);
    }
}
