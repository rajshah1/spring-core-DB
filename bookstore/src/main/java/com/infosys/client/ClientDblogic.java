/**
 * 
 */
package com.infosys.client;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infosys.model.Author;
import com.infosys.model.Book;
import com.infosys.service.AuthorService;
import com.infosys.service.BookServiceImpl;
import com.infosys.service.BookServiceInterface;


/**
 * @author RAJ SHAH
 *
 */
public class ClientDblogic {

	/**
	 * 
	 */
	public ClientDblogic() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Config.xml");
		BookServiceInterface bookService = ctx.getBean(BookServiceInterface.class);
		AuthorService authorService = ctx.getBean(AuthorService.class);
		Book addone=new Book();
		addone.setBookId("B1003");
		addone.setAuthor("A1001");
		addone.setBookName("Indian girl");
		addone.setBookPrice(1001);
		addone.setPublication("Air India");
		
		Book addtwo=new Book();
		addtwo.setBookId("B1001");
		addtwo.setAuthor("A1001");
		addtwo.setBookName("Indian girl");
		addtwo.setBookPrice(1001);
		addtwo.setPublication("Air India");
		
		
		Author authorone =new Author();
		authorone.setContactNumber(9825039684.0);
		authorone.setAuthor_id("A1005");
		authorone.setEmailId("rajshah@infosys.com");
		authorone.setFirstName("raj");
		authorone.setLastName("shah");
		int authordeatils=authorService.addAuthor(authorone);
		System.out.println(authordeatils);
		int changeRecords=bookService.AddBookDetails(addone);
		
		System.out.println(changeRecords);
		int deleteDetails=bookService.removeBook("B1001");
		System.out.println(deleteDetails);
		System.out.println(bookService.getallBooks());
		System.out.println(bookService.updatePrice("B1002",235671.0));
		Book book=bookService.getbook("B1002");
		System.out.println("\t"+book.getBookId()+"\t"+book.getAuthor()+"\t"+book.getBookName()+"\t"+book.getBookPrice()+"\t"+book.getPublication());
		List<Book> listbooks=authorService.getBookaname("Raj");
		for(Book bk:listbooks) {
			System.out.println("\t"+bk.getBookId()+"\t"+bk.getAuthor()+"\t"+bk.getBookName()+"\t"+bk.getBookPrice()+"\t"+bk.getPublication());
		}
	}

}
