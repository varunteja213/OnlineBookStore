package com.flm.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
	private Long orderId;
	private Books book;
	private Users user;
	private LocalDate orderDate;
	private Long quantity;
	private Double totalPrice;
	private String ordersStatus;
	private LocalDateTime orderCreatedAt;

	public Orders(Books book, Users user, Long quantity) {
		this.book = book;
		this.user = user;
		this.quantity = quantity;
	}
}
