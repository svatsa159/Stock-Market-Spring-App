package com.spring.stockmarket.backend.dao;

import com.spring.stockmarket.backend.entity.StockPrice;
import com.spring.stockmarket.backend.exception.EntityExists;

public interface StockPriceDao {
	public boolean addStockPrice(StockPrice stockPrice) throws EntityExists;
}
