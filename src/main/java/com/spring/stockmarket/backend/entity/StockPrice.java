package com.spring.stockmarket.backend.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stockprice")
public class StockPrice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long company_code;
	private long stock_exchange_id;
	private float current_price;
	private LocalTime time;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCompany_code() {
		return company_code;
	}

	public void setCompany_code(long company_code) {
		this.company_code = company_code;
	}

	public long getStock_exchange_id() {
		return stock_exchange_id;
	}

	public void setStock_exchange_id(long stock_exchange_id) {
		this.stock_exchange_id = stock_exchange_id;
	}

	public float getCurrent_price() {
		return current_price;
	}

	public void setCurrent_price(float current_price) {
		this.current_price = current_price;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	private LocalDate date;
}
