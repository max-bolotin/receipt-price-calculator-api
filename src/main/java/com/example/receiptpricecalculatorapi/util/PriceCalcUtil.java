package com.example.receiptpricecalculatorapi.util;

import com.example.receiptpricecalculatorapi.model.Item;

import java.math.BigDecimal;

public class PriceCalcUtil {
    public static BigDecimal totalPrice(Item item) {
        BigDecimal totalPriceWithoutDiscount = item.getBasePrice().multiply(BigDecimal.valueOf(item.getUnits()));
        BigDecimal discount = totalPriceWithoutDiscount.multiply(BigDecimal.valueOf(item.getPercentageDiscount() / 100));
        return totalPriceWithoutDiscount.subtract(discount);
    }
}
