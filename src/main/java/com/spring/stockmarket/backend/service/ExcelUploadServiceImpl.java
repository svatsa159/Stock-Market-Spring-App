package com.spring.stockmarket.backend.service;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.spring.stockmarket.backend.entity.StockPrice;
import com.spring.stockmarket.backend.exception.ExcelFormatErrorException;

@Service
public class ExcelUploadServiceImpl implements ExcelUploadService {

	@Override
	public List<StockPrice> uploadExcelStockPrices(MultipartFile file) throws ExcelFormatErrorException {

		try {
//			throw new IOException();
			List<StockPrice> uploadPrices = ExcelUploadHelper.getStockPricesFromExcel(file.getInputStream());
		} catch (IOException e) {
			throw new ExcelFormatErrorException("Excel Sheet Could not be stored ");
		}
		return null;
	}

}
