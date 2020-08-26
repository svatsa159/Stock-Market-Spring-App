package com.spring.stockmarket.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.stockmarket.backend.entity.StockPrice;

@Repository
public interface StockPriceRepository extends CrudRepository<StockPrice, Integer> {

}
