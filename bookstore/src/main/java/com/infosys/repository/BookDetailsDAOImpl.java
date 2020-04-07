package com.infosys.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import com.infosys.model.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class BookDetailsDAOImpl implements BookDetailsInter{
	public NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	@Autowired
	public void setDataSource(DataSource ds) {
		this.namedParameterJdbcTemplate=new NamedParameterJdbcTemplate(ds);
	}
	
	public BookDetailsDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	public int addBook(Book book) {
		// TODO Auto-generated method stub
		String sql="insert into book(book_id,book_name,publication,book_price,author_id) values(:bookId,:bookName,:publication,:bookPrice,:author)";
		SqlParameterSource parameters=new BeanPropertySqlParameterSource(book);
		//System.out.println(parameters.getValue("bookId"));
		return namedParameterJdbcTemplate.update(sql, parameters);
	}

	

	public List<Book> allBooks() {
		String sql="select * from book order by book_price asc";
		
		return namedParameterJdbcTemplate.query(sql,new RowMapper<Book>() {

			public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Book book=new Book();
				book.setBookId(rs.getString("book_id"));
				book.setBookName(rs.getString("book_name"));
				book.setBookPrice(rs.getDouble("book_price"));
				book.setPublication(rs.getString("publication"));
				book.setAuthor(rs.getString("author_id"));
				return book;
			}
			
		});
		// TODO Auto-generated method stub
	}

	public int removeBook(String bookId) {
		// TODO Auto-generated method stub
		String sql="delete from book where book_id=:bookid";
		SqlParameterSource parameters= new MapSqlParameterSource("bookid",bookId);
		return namedParameterJdbcTemplate.update(sql, parameters);
		
		
	}

	public int updateBookDetails(String bookId,Double Price) {
		String sql="update book set book_price=:bookPrice where book_id=:bookid";
		SqlParameterSource parameters= new MapSqlParameterSource("bookPrice",Price).addValue("bookid",bookId);
		return namedParameterJdbcTemplate.update(sql, parameters);
			}

	public Book searchBookby(String bookId) {
		// TODO Auto-generated method stub
		String sql="select book_id,book_name,book_price,publication,author_id from book where book_id=:bookid";
		SqlParameterSource parameters= new MapSqlParameterSource("bookid",bookId);
		return namedParameterJdbcTemplate.queryForObject(sql, parameters,new RowMapper<Book>() {

			public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Book book=new Book();
				book.setBookId(rs.getString("book_id"));
				book.setBookName(rs.getString("book_name"));
				book.setBookPrice(rs.getDouble("book_price"));
				book.setPublication(rs.getString("publication"));
				book.setAuthor(rs.getString("author_id"));
				return book;
			}
			
		});
	}


}
