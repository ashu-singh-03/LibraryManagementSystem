package com.example.Entity;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Books")
public class Book {
	@Id
	int BookId;
	String Bookname;
	String BookAuthor;
	int Bookprice;
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnoreProperties("member")
	
	Member member;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookId, String bookname, String bookAuthor, int bookprice) {
		super();
		BookId = bookId;
		Bookname = bookname;
		BookAuthor = bookAuthor;
		Bookprice = bookprice;
		
	}
	public int getBookid() {
		return BookId;
	}
	public void setBookid(int bookId) {
		BookId = bookId;
	}
	public String getBookname() {
		return Bookname;
	}
	public void setBookname(String bookname) {
		Bookname = bookname;
	}
	public String getBookAuthor() {
		return BookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}
	public int getBookprice() {
		return Bookprice;
	}
	public void setBookprice(int bookprice) {
		Bookprice = bookprice;
	}
	
	
	
}
