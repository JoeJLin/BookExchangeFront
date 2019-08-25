package com.bookexchange.model;

public class Book {

	private String bookName;
	private String ISBN;
	private Double price;
	private String author;
	private Integer bookId;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public Book(String bookName, String ISBN, String author, Double price) {
		this.setBookName(bookName);
		this.setISBN(ISBN);
		this.setPrice(price);
		this.setAuthor(author);
	}

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public String getBookName() {
		return this.bookName;
	}

	public void setBookName(String name) {
		this.bookName = name;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}