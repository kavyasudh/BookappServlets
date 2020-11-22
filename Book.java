package com.bookstore.model.dao;

import java.util.Date;

public class Book {
private int id;
private String isbn;
private String  title;
private String author;
private Date pubDate;
private double price;

public Book() {}
public Book(String isbn, String title, String author, Date pubDate, double price) {
	super();
	this.isbn = isbn;
	this.title = title;
	this.author = author;
	this.pubDate = pubDate;
	this.price = price;
}
public Book(int id, String isbn, String title, String author, Date pubDate, double price) {
	// TODO Auto-generated constructor stub
	
	this.id=id;
	this.title = title;
	this.author = author;
	this.pubDate = pubDate;
	this.price = price;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public Date getPubDate() {
	return pubDate;
}
public void setPubDate(Date pubDate) {
	this.pubDate = pubDate;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Book [id=" + id + ", isbn=" + isbn + ", title=" + title + ", author=" + author + ", pubDate=" + pubDate
			+ ", price=" + price + "]";
}

}
