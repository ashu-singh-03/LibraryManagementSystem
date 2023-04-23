package com.example.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Entity.Book;
import com.example.Service.BookService;
import com.example.repository.BookRepository;
@Repository
public class BookImpl  implements BookService{

	@Autowired
	BookRepository bookrepository;
	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		return bookrepository.save(book);
	}

	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		return bookrepository.findAll();
	}

	@Override
	public void deleteBook(int BookId) {
		// TODO Auto-generated method stub
		 bookrepository.deleteById(BookId);
	}

	@Override
	public Book findBooktById(int BookId) {
		// TODO Auto-generated method stub
		return bookrepository.findById(BookId).get();
	}

	@Override
	public Book UpdatBook(Book book) {
		// TODO Auto-generated method stub
		Book update_book=bookrepository.findById(book.getBookid()).get();
		update_book.setBookname(update_book.getBookname());
		update_book.setBookAuthor(update_book.getBookAuthor());
		update_book.setBookprice(update_book.getBookprice());
		return update_book;
	}

}
