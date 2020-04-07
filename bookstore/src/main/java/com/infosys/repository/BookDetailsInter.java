package com.infosys.repository;



import java.util.List;

import com.infosys.model.Book;

public interface BookDetailsInter {
	public int addBook(Book book);
	public Book searchBookby(String bookId);
	public List<Book> allBooks();
	public int removeBook(String bookId);
	public int updateBookDetails(String bookId,Double price);
	
	
}
