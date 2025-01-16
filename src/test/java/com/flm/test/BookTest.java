package com.flm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.flm.entity.Books;
import com.flm.service.BookService;

public class BookTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

		BookService bookService = ctx.getBean(BookService.class);

//		Books book1 = new Books("Heros in the Mars", "Varun", LocalDate.parse("2045-08-15"), 5499D, "Outer Space");
//		bookService.saveBook(book1);
//		System.out.println("Book saved : " + book1);
//
//		book1.setAuthor("K G S ");
//		bookService.updateBook(book1);
//		System.out.println("Book updated");
		
//		Books book = bookService.getBook(1L);
//		System.out.println("Book is "+ book);
		
//		bookService.deleteBook(4L);
//		System.out.println("Book deleted");
		
		for(Books book : bookService.getAllBooks()) {
			System.out.println(book);
		}
	}

}
