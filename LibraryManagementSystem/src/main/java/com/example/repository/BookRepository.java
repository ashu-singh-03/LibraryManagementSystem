package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Book;



public interface BookRepository  extends JpaRepository<Book, Integer>
{
	static List<Book> findAllRepository() {
		// TODO Auto-generated method stub
		return null;
}
}
