package com.flm.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.flm.entity.Books;

public class BookDaoImpl extends HibernateDaoSupport implements BookDao{

	@Override
	public void saveBook(Books book) {
		getHibernateTemplate().save(book);
	}

	@Override
	public void updateBook(Books book) {
		getHibernateTemplate().update(book);		
	}

	@Override
	public void deleteBook(Long isbn) {
		Books book = getBook(isbn);
		if(book != null) {
			getHibernateTemplate().delete(book);
		}else {
			System.out.println("No Book present");
		}
	}

	@Override
	public Books getBook(Long isbn) {
		return getHibernateTemplate().get(Books.class, isbn);
	}

	@Override
	public List<Books> getAllBooks() {
		return getHibernateTemplate().loadAll(Books.class);
	}

}
