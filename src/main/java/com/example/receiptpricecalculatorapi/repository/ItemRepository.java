package com.example.receiptpricecalculatorapi.repository;

import com.example.receiptpricecalculatorapi.dto.ItemProjection;
import com.example.receiptpricecalculatorapi.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    @Query(value = "SELECT i.id, ROUND((i.base_price - i.base_price*i.percentage_discount/100) * i.units, 2) as price, i.item_description, i.item_id from items i where i.units != 0", nativeQuery = true)
    List<ItemProjection> findAllWithDiscount();
}
