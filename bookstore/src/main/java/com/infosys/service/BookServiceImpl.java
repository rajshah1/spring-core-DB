package com.infosys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.infosys.model.Book;
import com.infosys.repository.BookDetailsDAOImpl;
import com.infosys.repository.BookDetailsInter;

@Service
public class BookServiceImpl implements BookServiceInterface{
	@Autowired
	@Qualifier("bookDetailsDAOImpl")
	private BookDetailsInter bookDetailsDAOImpl;
	
	public BookServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	public int AddBookDetails(Book book) {
		return bookDetailsDAOImpl.addBook(book);
		// TODO Auto-generated method stub

		
		
	}

	public int removeBook(String BookId) {
		// TODO Auto-generated method stub
		return bookDetailsDAOImpl.removeBook(BookId);
	}

	public List<Book> getallBooks() {
		// TODO Auto-generated method stub
		
		return bookDetailsDAOImpl.allBooks();
	}

	public int updatePrice(String bookid, Double price) {
		// TODO Auto-generated method stub
		return bookDetailsDAOImpl.updateBookDetails(bookid, price);
	}

	public Book getbook(String bookid) {
		// TODO Auto-generated method stub
		return bookDetailsDAOImpl.searchBookby(bookid);
	}

	
}
