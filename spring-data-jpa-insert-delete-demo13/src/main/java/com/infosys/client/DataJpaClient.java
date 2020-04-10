package com.infosys.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infosys.model.Book;
import com.infosys.service.BookService;

public class DataJpaClient {

	public DataJpaClient() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-data.xml");
		BookService service = context.getBean(BookService.class);

		Book book1=new Book("B100","2 state","chetan Bhagat","A1003",500.0);
		Book book2=new Book("B1008","Half Girlfriend","chetan Bhagat","A1002",5000.0);
		service.savebook(book2);
		context.close();
		
	}

}
