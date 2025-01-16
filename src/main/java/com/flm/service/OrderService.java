package com.flm.service;

import java.util.List;

import com.flm.entity.Orders;

public interface OrderService {

	void placeOrder(Orders order);

	Orders getOrderDetails(Long orderId);

	void cancelOrder(Orders order);

	List<Orders> getAllOrders();

}