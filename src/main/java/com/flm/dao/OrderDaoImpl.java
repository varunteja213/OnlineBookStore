package com.flm.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.flm.entity.Orders;

public class OrderDaoImpl extends HibernateDaoSupport implements OrderDao {

	@Override
	public void saveOrder(Orders order) {
		getHibernateTemplate().save(order);
	}

	@Override
	public void deleteOrder(Long orderId) {
		Orders order = getOrderById(orderId);
		if (order != null) {
			getHibernateTemplate().delete(order);
		} else {
			System.out.println("No order present");
		}
	}

	@Override
	public void updateOrder(Orders order) {
		if (order != null) {
			getHibernateTemplate().update(order);
		} else {
			System.out.println("No order present");
		}
	}

	@Override
	public Orders getOrderById(Long orderId) {
		return getHibernateTemplate().get(Orders.class, orderId);

	}

	@Override
	public List<Orders> getAllOrders() {
		List<Orders> orderList = getHibernateTemplate().loadAll(Orders.class);

		// Explicitly initializing lazy collections
		for (Orders order : orderList) {
			if (order.getBook() != null) {
				order.getBook().getTitle(); // Forces loading of book data
			}
			if (order.getUser() != null) {
				order.getUser().getFirstName(); // Forces loading of user data
			}
		}
		return orderList;
	}

}
