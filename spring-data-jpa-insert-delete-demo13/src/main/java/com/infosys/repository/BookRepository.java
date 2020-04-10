package com.infosys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.model.Book;

public interface BookRepository extends JpaRepository<Book,String>{

}
