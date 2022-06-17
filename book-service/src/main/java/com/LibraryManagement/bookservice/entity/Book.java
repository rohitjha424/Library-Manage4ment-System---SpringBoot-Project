package com.LibraryManagement.bookservice.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Book {



	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long bookId;
	private String bookName;
	private String bookSubject;
	private Long bookPublishYear;
	private Long bookPrice;
	
	private Long libId;
	
	
	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookSubject() {
		return bookSubject;
	}

	public void setBookSubject(String bookSubject) {
		this.bookSubject = bookSubject;
	}

	public Long getBookPublishYear() {
		return bookPublishYear;
	}

	public void setBookPublishYear(Long bookPublishYear) {
		this.bookPublishYear = bookPublishYear;
	}

	public Long getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(Long bookPrice) {
		this.bookPrice = bookPrice;
	}

	public Long getLibId() {
		return libId;
	}

	public void setLibId(Long libId) {
		this.libId = libId;
	}
	
	

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(Long bookId, String bookName, String bookSubject, Long bookPublishYear, Long bookPrice, Long libId) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookSubject = bookSubject;
		this.bookPublishYear = bookPublishYear;
		this.bookPrice = bookPrice;
		this.libId = libId;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookSubject=" + bookSubject
				+ ", bookPublishYear=" + bookPublishYear + ", bookPrice=" + bookPrice + ", libId=" + libId + "]";
	}


}
