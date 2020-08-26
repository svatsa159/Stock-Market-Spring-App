package com.spring.stockmarket.backend.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.spring.stockmarket.backend.entity.StockPrice;
import com.spring.stockmarket.backend.exception.EntityExists;
import com.spring.stockmarket.backend.repository.StockPriceRepository;

@Service
public class StockPriceDaoImpl implements StockPriceDao {

	@Autowired
	StockPriceRepository stockPriceRepository;

	@Override
	public boolean addStockPrice(StockPrice stockPrice) throws EntityExists {
		try {
			stockPriceRepository.save(stockPrice);
		} catch (DataIntegrityViolationException e) {
			throw new EntityExists();
		}
		return false;
	}

}
