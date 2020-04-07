package com.infosys.service;

import java.util.List;

import com.infosys.model.Author;
import com.infosys.model.Book;

public interface AuthorService {
	public int addAuthor(Author author);
	public List<Book> getBookaname(String Name);
}
