package com.au.library.model;

public class Book {
	private String id;
	private String bookname;
	private String authorname;
	private String description;
	private double price;
	
	public Book(String id, String bookname, String authorname, String description, double price) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.authorname = authorname;
		this.description = description;
		this.price = price;
	}
	public  Book() {
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
