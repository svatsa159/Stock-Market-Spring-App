package com.spring.stockmarket.backend.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import com.spring.stockmarket.backend.entity.StockPrice;
import com.spring.stockmarket.backend.exception.ExcelFormatErrorException;

public class ExcelUploadHelper {
	public static String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";

	public static boolean hasExcelFormat(MultipartFile file) {

		if (!TYPE.equals(file.getContentType())) {
			return false;
		}

		return true;
	}

	public static List<StockPrice> getStockPricesFromExcel(InputStream is) throws ExcelFormatErrorException {
		try {
			Workbook workbook = new XSSFWorkbook(is);
			if (workbook.getNumberOfSheets() < 1) {
				throw new ExcelFormatErrorException("No Sheets Found");
			}
			Iterator<Sheet> sheets = workbook.sheetIterator();
			while (sheets.hasNext()) {
				Sheet sheet = sheets.next();
				Iterator<Row> rows = sheet.rowIterator();
				int rowno = 0;
				while (rows.hasNext()) {
					Row row = rows.next();
					if (rowno == 0) {
						rowno++;
						continue;
					}

					Cell cell = row.getCell(0);
					if (cell.getStringCellValue() != "") {
						System.out.println(cell.getStringCellValue());
					}
					rowno++;
				}
//				System.out.println(sheet.getSheetName());
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

		return null;

	}

}
