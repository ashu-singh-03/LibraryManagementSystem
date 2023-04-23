package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Book;
import com.example.Service.BookService;
import com.example.repository.BookRepository;

@RestController
public class BookController {
	@Autowired
	BookService bookService;
	
	   @GetMapping(value="/getBook")
	    public List<Book> getAllLaptop(){
	        return bookService.getAllBook();
	    }

	    @PostMapping(value="/postBook")
	    public Book addLaptop(@RequestBody Book book) {
	        return bookService.addBook(book);  
	    }

	    @GetMapping(value = "/getBook/{bookId}")
	    public Book getBookById(@PathVariable int bookId) {
	        return bookService.findBooktById(bookId);
	    }

	    @PutMapping(value="/updateBook")
	    public Book upBook(@RequestBody Book book) {
	        return bookService.UpdatBook(book);
	    }
	    
	    @DeleteMapping(value="/deleteBook/{bookId}")
	    public String deleteBookById(@PathVariable int bookId) {
	        bookService.deleteBook(bookId);
	        return "Laptop Deleted";
}
}