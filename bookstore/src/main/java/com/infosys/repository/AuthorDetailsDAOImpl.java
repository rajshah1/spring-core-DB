package com.infosys.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.infosys.model.Author;
import com.infosys.model.Book;
@Repository
public class AuthorDetailsDAOImpl implements AuthorDetails{
	public NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	@Autowired
	public void setDataSource(DataSource ds) {
		this.namedParameterJdbcTemplate=new NamedParameterJdbcTemplate(ds);
	}
	public AuthorDetailsDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	public int AddAuthorDetails(Author author) {
		// TODO Auto-generated method stub
		String sql="insert into author values(:author_id,:firstName,:lastName,:emailId,:contactNumber)";
		SqlParameterSource parameters=new BeanPropertySqlParameterSource(author);
//		System.out.println(parameters.getValue("bookId"));
		return namedParameterJdbcTemplate.update(sql, parameters);
		
	}
	public List<Book> searchBookByaname(String Name) {
		// TODO Auto-generated method stub
		String sql="select * from book inner join author on book.author_id=author.author_id where author.first_name=:name";
		SqlParameterSource parameters= new MapSqlParameterSource("name",Name);
		return namedParameterJdbcTemplate.query(sql, parameters,new RowMapper<Book>() {

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
