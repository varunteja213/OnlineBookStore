package com.flm.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.flm.entity.Orders;
import com.flm.service.BookService;
import com.flm.service.OrderService;
import com.flm.service.UserService;

public class OrderTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		UserService userService = ctx.getBean(UserService.class);
		BookService bookService = ctx.getBean(BookService.class);
		OrderService orderService = ctx.getBean(OrderService.class);
		
//		Books book = bookService.getBook(2L);
//		Users user = userService.getUser(2L);
//		
//		Orders order = new Orders(book, user, 1L);
//		orderService.placeOrder(order);
//		System.out.println("Order placed :"+ order);
		
//		Orders order = orderService.getOrderDetails(1L);
//		System.out.println("Order details are: "+order);
		
//		Orders order = orderService.getOrderDetails(2L);
//		orderService.cancelOrder(order);
//		System.out.println("Order Cancelled: ");
		

		List<Orders> orderList = orderService.getAllOrders();
		for (Orders order : orderList) {
	        System.out.println("Order ID: " + order.getOrderId());
	        System.out.println("Book Title: " + order.getBook().getTitle());
	        System.out.println("User Name: " + order.getUser().getFirstName());
	        System.out.println("Order Status: " + order.getOrdersStatus());
	        System.out.println("---------------------------------");
	    }
	}

}
