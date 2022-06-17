package com.LibraryManagement.bookservice.VO;

import com.LibraryManagement.bookservice.entity.Book;

public class ResponseTemplateVO {
	
	
	private Book  book;
	private Library library;
	
	
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Library getLibrary() {
		return library;
	}
	public void setLibrary(Library library) {
		this.library = library;
	}
	
	public ResponseTemplateVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResponseTemplateVO(Book book, Library library) {
		super();
		this.book = book;
		this.library = library;
	}
	
	@Override
	public String toString() {
		return "ResponseTemplate [book=" + book + ", library=" + library + "]";
	}
	

}
