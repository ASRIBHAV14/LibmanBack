package com.dto;

public class BooksDto {
	private Long bookid;
	private String title;
	private String isbncode;
	private String subject;
	private int quantity;
	private double bookcost;
	private String shelfdetails;
	private int publishedyear;
	private String firstName;
	private String publisherName;
	
	public Long getBookid() {
		return bookid;
	}
	public void setBookid(Long bookid) {
		this.bookid = bookid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIsbncode() {
		return isbncode;
	}
	public void setIsbncode(String isbncode) {
		this.isbncode = isbncode;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getBookcost() {
		return bookcost;
	}
	public void setBookcost(double bookcost) {
		this.bookcost = bookcost;
	}
	public String getShelfdetails() {
		return shelfdetails;
	}
	public void setShelfdetails(String shelfdetails) {
		this.shelfdetails = shelfdetails;
	}
	public int getPublishedyear() {
		return publishedyear;
	}
	public void setPublishedyear(int publishedyear) {
		this.publishedyear = publishedyear;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	
}