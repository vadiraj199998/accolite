package com.au.library.repositary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.au.library.model.Book;

@Repository
public class BooksDao {
	
	@Autowired
	JdbcTemplate jdbctemplate;
	
	public List<Book> all()
	{
		return jdbctemplate.query("select * from books", (rs,i)->{
			return new Book(rs.getString("bookid"),
					rs.getString("bookname"),
					rs.getString("bookauthor"),
					rs.getString("descript"),
					rs.getDouble("price"));
		});
	}
	public Book get(String id)
	{
		//return jdbctemplate.queryForObject("select * from libbook where id="+id, Book.class);
		return jdbctemplate.query("select * from books", (rs,i)->{
			return new Book(rs.getString("bookid"),
					rs.getString("bookname"),
					rs.getString("bookauthor"),
					rs.getString("descript"),
					rs.getDouble("price"));
		}).get(0);
	}
	public Book create(Book book)
	{
		jdbctemplate.update("insert into books values(?,?,?,?,?);",
				book.getId(),
				book.getDescription(),
				book.getBookname(),
				book.getAuthorname(),
				book.getPrice());
		return book;
	}
	public Book createcart(Book book)
	{
		jdbctemplate.update("insert into carts values(?,?,?,?,?);",
				book.getId(),
				book.getDescription(),
				book.getBookname(),
				book.getAuthorname(),
				book.getPrice());
		return book;
	}
	public List<Book> allfromcart()
	{
		return jdbctemplate.query("select * from carts", (rs,i)->{
			return new Book(rs.getString("bookid"),
					rs.getString("bookname"),
					rs.getString("bookauthor"),
					rs.getString("descript"),
					rs.getDouble("price"));
		});
	}

}