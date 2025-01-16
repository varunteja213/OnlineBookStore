package com.flm.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.flm.dao.BookDao;
import com.flm.entity.Books;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookDao bookDao;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void saveBook(Books book) {
		book.setBookStatus("active");
		book.setAvailability(20L);
		book.setPublishedDate(LocalDate.now());
		bookDao.saveBook(book);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updateBook(Books book) {
		bookDao.updateBook(book);		
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void deleteBook(Long isbn) {
		bookDao.deleteBook(isbn);		
	}

	@Override
	@Transactional(rollbackFor = Exception.class, readOnly = true)
	public Books getBook(Long isbn) {
		return bookDao.getBook(isbn);
	}

	@Override
	@Transactional(rollbackFor = Exception.class, readOnly = true)
	public List<Books> getAllBooks() {
		return bookDao.getAllBooks();
	}

}
