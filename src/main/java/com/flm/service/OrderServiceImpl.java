package com.flm.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.flm.dao.OrderDao;
import com.flm.entity.Orders;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDao orderDao;

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void placeOrder(Orders order) {
		// validating if the order has all the details
		if (order == null || order.getBook() == null || order.getUser() == null || order.getQuantity() == null
				|| order.getQuantity() <= 0) {
			throw new IllegalArgumentException("Invalid order details");
		}

		// calculating the total price
		Double totalPrice = order.getBook().getPrice() * order.getQuantity();
		order.setTotalPrice(totalPrice);

		// updating order status and date
		order.setOrderDate(LocalDate.now());
		order.setOrderCreatedAt(LocalDateTime.now());
		order.setOrdersStatus("pending");

		// saving the order.
		orderDao.saveOrder(order);
		System.out.println("Order Placed Successfully");
	}

	@Override
	@Transactional(rollbackFor = Exception.class, readOnly = true)
	public Orders getOrderDetails(Long orderId) {
		Orders order = orderDao.getOrderById(orderId);
		// the below line is written to get the book details from DB to explicitly bring
		// the data related to books and to escape lazy loading.
		order.getBook().getTitle();
		// the below line is written to get the user details from DB to explicitly bring
		// the data related to user and to escape lazy loading.
		order.getUser().getFirstName();
		return order;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void cancelOrder(Orders order) {
		// checking if the orderId exists
		if (order.getOrderId() == null) {
			throw new IllegalArgumentException("Invalid order");
		}

		Orders existingOrder = orderDao.getOrderById(order.getOrderId());
		if (existingOrder != null) {
			existingOrder.setOrdersStatus("cancelled");
			orderDao.updateOrder(existingOrder);
		} else {
			throw new IllegalArgumentException("Order not found");
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class, readOnly = true)
	public List<Orders> getAllOrders() {
		List<Orders> orders = orderDao.getAllOrders();
		return orders;
	}

}
