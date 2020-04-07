package com.infosys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.infosys.model.Author;
import com.infosys.model.Book;
import com.infosys.repository.AuthorDetails;
@Service
public class AuthorServiceImpl implements AuthorService {
	@Autowired
	@Qualifier("authorDetailsDAOImpl")
	public AuthorDetails authorDetailsDAOImpl;
	
	public AuthorServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	public int addAuthor(Author author) {
		// TODO Auto-generated method stub
		
		return authorDetailsDAOImpl.AddAuthorDetails(author);
	}

	public List<Book> getBookaname(String Name) {
		// TODO Auto-generated method stub
		return authorDetailsDAOImpl.searchBookByaname(Name);
	}
	

}
