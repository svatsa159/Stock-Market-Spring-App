package com.spring.stockmarket.backend.service;

import java.util.List;

import com.spring.stockmarket.backend.entity.StockExchange;
import com.spring.stockmarket.backend.exception.EntityExists;
import com.spring.stockmarket.backend.exception.EntityNotFound;

public interface StockExchangeService {
	public List<StockExchange> getAllStockExchanges();

	public boolean addStockExchange(StockExchange exchange) throws EntityExists;

	public boolean removeStockExchange(String name) throws EntityNotFound;
}
