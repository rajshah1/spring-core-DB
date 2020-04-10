package com.infosys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.model.Book;
import com.infosys.repository.BookRepository;
@Service
public class BookServiceImpl implements BookService{
	@Autowired
	public BookRepository bookRepo;
	public BookServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void savebook(Book book) {
		// TODO Auto-generated method stub
		bookRepo.saveAndFlush(book);
	}

}
