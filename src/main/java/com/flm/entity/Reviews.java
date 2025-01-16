package com.flm.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reviews {
	private Long reviewId;
	private Users user;
	private Books book;
	private Long rating;
	private String reviewText;
	private LocalDateTime reviewCreatedAt;
	
	public Reviews(Users user, Books book, Long rating, String reviewText, LocalDateTime reviewCreatedAt) {
		this.user = user;
		this.book = book;
		this.rating = rating;
		this.reviewText = reviewText;
		this.reviewCreatedAt = reviewCreatedAt;
	}

}
