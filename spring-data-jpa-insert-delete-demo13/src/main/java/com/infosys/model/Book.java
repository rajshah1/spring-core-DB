package com.infosys.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

	public Book() {
		// TODO Auto-generated constructor stub
	}
	@Id
	private String book_id;
	private String book_name;
	private String publication;
	private String author_id;
	private double book_price;
	public String getBook_id() {
		return book_id;
	}
	
	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public String getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(String author_id) {
		this.author_id = author_id;
	}
	public double getBook_price() {
		return book_price;
	}
	public void setBook_price(double book_price) {
		this.book_price = book_price;
	}
	
	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", book_name=" + book_name + ", publication=" + publication + ", author_id="
				+ author_id + ", book_price=" + book_price + "]";
	}
	public Book(String book_id, String book_name, String publication, String author_id, double book_price) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.publication = publication;
		this.author_id = author_id;
		this.book_price = book_price;
	}

}
