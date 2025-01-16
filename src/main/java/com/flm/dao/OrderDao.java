package com.flm.dao;

import java.util.List;
import java.util.Map;

import com.flm.entity.Orders;

public interface OrderDao {

	void saveOrder(Orders order);

	void deleteOrder(Long orderId);

	void updateOrder(Orders order);

	Orders getOrderById(Long orderId);

	List<Orders> getAllOrders();

}
