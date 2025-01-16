package com.flm.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
	private Long cartId;
	private Users user;
	private Books book;
	private Long quantity;
	private LocalDateTime addedAt;
	
	public Cart(Users user, Books book, Long quantity, LocalDateTime addedAt) {
		this.user = user;
		this.book = book;
		this.quantity = quantity;
		this.addedAt = addedAt;
	}
}
