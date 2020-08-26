package com.spring.stockmarket.backend.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.spring.stockmarket.backend.entity.StockExchange;
import com.spring.stockmarket.backend.exception.EntityExists;
import com.spring.stockmarket.backend.exception.EntityNotFound;
import com.spring.stockmarket.backend.repository.StockExchangeRepository;

@Service
public class StockExchangeDaoImpl implements StockExchangeDao {

	@Autowired
	StockExchangeRepository stockExchangeRepository;

	@Override
	public List<StockExchange> listAllStockExchanges() {
		return (List<StockExchange>) stockExchangeRepository.findAll();
	}

	@Override
	public boolean addStockExchange(StockExchange exchange) throws EntityExists {
		try {
			stockExchangeRepository.save(exchange);
		} catch (DataIntegrityViolationException e) {
			throw new EntityExists();
		}
		return true;

	}

	@Override
	public boolean deleteStockExchange(StockExchange exchange) {
		stockExchangeRepository.delete(exchange);
		return false;
	}

	@Override
	public StockExchange getStockExchangeByName(String name) throws EntityNotFound {
		StockExchange exchange = stockExchangeRepository.getStockExchangeByName(name);
		if (exchange == null) {
			throw new EntityNotFound();
		} else {
			return exchange;
		}
	}

}
