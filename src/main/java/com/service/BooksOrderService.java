package com.service;

import java.util.List;

import com.dto.BooksOrderDto;
import com.entities.BooksOrder;

public interface BooksOrderService {
	public BooksOrder placeBooksOrder(BooksOrderDto orderdetails);
	public String cancelOrder(int orderId) throws Throwable;
	public BooksOrder updateOrder(BooksOrderDto order) throws Throwable;
	public List<BooksOrder> viewOrdersList();
	public BooksOrderDto viewOrderById(int orderId) throws Throwable;
}