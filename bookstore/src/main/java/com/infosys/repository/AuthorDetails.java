package com.infosys.repository;

import java.util.List;

import com.infosys.model.Author;
import com.infosys.model.Book;

public interface AuthorDetails {
public int AddAuthorDetails(Author author);
public List<Book> searchBookByaname(String Name);
}
