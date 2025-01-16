package com.flm.service;

import java.util.List;

import com.flm.entity.Books;

public interface BookService {

	void saveBook(Books book);

	void updateBook(Books book);

	void deleteBook(Long isbn);

	Books getBook(Long sbin);

	List<Books> getAllBooks();

}
