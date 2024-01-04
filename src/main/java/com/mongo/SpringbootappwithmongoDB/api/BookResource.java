package com.mongo.SpringbootappwithmongoDB.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.SpringbootappwithmongoDB.model.Book;
import com.mongo.SpringbootappwithmongoDB.service.BookService;

@RestController
@RequestMapping("/Books")
public class BookResource {
	
	@Autowired
	private BookService bookService;

	@PostMapping("/addBook")
	public Book addBook(@RequestBody Book book) {
		return bookService.addBook(book);
	}
	
	@GetMapping("/getAllBooks")
	public List<Book> getBooks() {
		return bookService.getBooks();
	}
	
	@GetMapping("/getBook/{bookId}")
	public Book getBook(@PathVariable("bookId") int bookId) {
		return bookService.getBook(bookId);
	}
	
	@PutMapping("/updateBook/{bookId}")
	public Book updateBook(@PathVariable("bookId") int bookId, @RequestBody Book book) {
		return bookService.updateBook(bookId, book);
	}
	
	@DeleteMapping("/deleteBook/{bookId}")
	public String deleteBook(@PathVariable("bookId") int bookId) {
		return bookService.deleteBoook(bookId);
	}
	
}
