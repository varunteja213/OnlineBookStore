package com.flm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
	private Long paymentId;
	private Orders order;
	private String paymentMethod;
	private String paymentStatus;
	
	public Payment(Orders order, String paymentMethod, String paymentStatus) {
		this.order = order;
		this.paymentMethod = paymentMethod;
		this.paymentStatus = paymentStatus;
	}
}
