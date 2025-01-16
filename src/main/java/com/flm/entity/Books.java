package com.flm.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
	private Long sbin;
	private String title;
	private String author;
	private Long availability;
	private String bookStatus;
	private LocalDate publishedDate;
	private LocalDateTime bookCreatedAt;
	private LocalDateTime bookUpdatedAt;
	private Double price;
	private String category;

	public Books(String title, String author, LocalDate publishedDate, Double price, String category) {
		this.title = title;
		this.author = author;
		this.publishedDate = publishedDate;
		this.price = price;
		this.category = category;
	}
}
