package com.spring.stockmarket.backend.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.spring.stockmarket.backend.entity.StockPrice;
import com.spring.stockmarket.backend.exception.ExcelFormatErrorException;

public interface ExcelUploadService {
	public List<StockPrice> uploadExcelStockPrices(MultipartFile file) throws ExcelFormatErrorException;
}
