package com.mongo.SpringbootappwithmongoDB.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mongo.SpringbootappwithmongoDB.dao.BookDAO;
import com.mongo.SpringbootappwithmongoDB.model.Book;

@Component
public class BookService {
	
	@Autowired
	private BookDAO bookDAO;
	
	public Book addBook(Book book) {
		return bookDAO.save(book);
	}
	
	public List<Book> getBooks() {
		return bookDAO.findAll();
	}
	
	public Book getBook(int bookId) {
		return bookDAO.findById(bookId).get();
	}
	
	public Book updateBook(int bookId, Book book) {
		book.setId(bookId);
		return bookDAO.save(book);
	}
	
	public String deleteBoook(int bookId) {
		bookDAO.deleteById(bookId);
		return "Book Deleted Successfully";
	}
}
