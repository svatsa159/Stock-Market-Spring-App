package com.spring.stockmarket.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.stockmarket.backend.dao.StockExchangeDaoImpl;
import com.spring.stockmarket.backend.entity.StockExchange;
import com.spring.stockmarket.backend.exception.EntityExists;
import com.spring.stockmarket.backend.exception.EntityNotFound;

@Service
public class StockExchangeServiceImpl implements StockExchangeService {

	@Autowired
	StockExchangeDaoImpl stockExchangeDaoImpl;

	@Override
	public List<StockExchange> getAllStockExchanges() {
		return stockExchangeDaoImpl.listAllStockExchanges();

	}

	@Override
	public boolean addStockExchange(StockExchange exchange) throws EntityExists {

		return stockExchangeDaoImpl.addStockExchange(exchange);

	}

	@Override
	public boolean removeStockExchange(String name) throws EntityNotFound {

		StockExchange exchange = stockExchangeDaoImpl.getStockExchangeByName(name);
		stockExchangeDaoImpl.deleteStockExchange(exchange);

		return false;
	}

}
