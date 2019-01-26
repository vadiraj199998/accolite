package com.au.library.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.au.library.model.Book;
import com.au.library.repositary.BooksDao;

@RestController
public class BooksController {
	
	@Autowired
	private BooksDao dao;
	
	
	@RequestMapping(value="/books",method=RequestMethod.GET,produces = "application/json")
	public List<Book> getAll()
	{
		//List<Book> books=new ArrayList<Book>();
		//books.add(new Book("1","marvel","stanlee","name",200));
		//books.add(new Book("2","marvel studeo","stanlee morgan","name 23",200));
		List<Book> books=dao.all();
		return books;
	}
	@RequestMapping(value="/books/{bookId}/get",method=RequestMethod.GET)
	public Book getbookbyid(@PathVariable(value="bookId")String bookId)
	{
		//List<Book> books=new ArrayList<Book>();
		//return (new Book("1","marvel","stanlee","name",200));
		return dao.get(bookId);
	}
	
	@RequestMapping(value="/books",method=RequestMethod.POST)
	
		public Book create(@RequestBody Book booktocreate)
		{
			return dao.create(booktocreate);
		}
	@RequestMapping(value="/bookscart",method=RequestMethod.POST)
	
	public Book createcart(@RequestBody Book booktocreate)
	{
		return dao.createcart(booktocreate);
	}
	@RequestMapping(value="/booksfromcart",method=RequestMethod.GET,produces = "application/json")
	public List<Book> getAllfromcart()
	{
		//List<Book> books=new ArrayList<Book>();
		//books.add(new Book("1","marvel","stanlee","name",200));
		//books.add(new Book("2","marvel studeo","stanlee morgan","name 23",200));
		List<Book> books=dao.allfromcart();
		return books;
	}
}