package com.flm.dao;

import java.util.List;

import com.flm.entity.Books;

public interface BookDao {
	
	void saveBook(Books book);
	
	void updateBook(Books book);
	
	void deleteBook(Long isbn);
	
	Books getBook(Long isbn);
	
	List<Books> getAllBooks();
}
