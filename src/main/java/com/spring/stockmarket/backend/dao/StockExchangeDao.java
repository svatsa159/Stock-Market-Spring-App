package com.spring.stockmarket.backend.dao;

import java.util.List;

import com.spring.stockmarket.backend.entity.StockExchange;
import com.spring.stockmarket.backend.exception.EntityExists;
import com.spring.stockmarket.backend.exception.EntityNotFound;

public interface StockExchangeDao {
	List<StockExchange> listAllStockExchanges();

	boolean addStockExchange(StockExchange exchange) throws EntityExists;

	boolean deleteStockExchange(StockExchange exchange);

	StockExchange getStockExchangeByName(String name) throws EntityNotFound;
}
