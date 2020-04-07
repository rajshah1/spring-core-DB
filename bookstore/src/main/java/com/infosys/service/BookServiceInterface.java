package com.infosys.service;

import java.util.List;

import com.infosys.model.Book;

public interface BookServiceInterface {
	public int AddBookDetails(Book book) ;
	public int removeBook(String BookId);
	public List<Book> getallBooks();
	public int updatePrice(String bookid,Double price);
public Book getbook(String bookid);
}
