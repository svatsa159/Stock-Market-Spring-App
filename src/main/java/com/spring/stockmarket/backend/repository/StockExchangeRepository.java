package com.spring.stockmarket.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.stockmarket.backend.entity.StockExchange;

@Repository
public interface StockExchangeRepository extends CrudRepository<StockExchange, Long> {
	public StockExchange getStockExchangeByName(String name);
}
