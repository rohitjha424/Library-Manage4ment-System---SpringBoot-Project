package com.LibraryManagement.bookservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LibraryManagement.bookservice.VO.ResponseTemplateVO;
import com.LibraryManagement.bookservice.entity.Book;
import com.LibraryManagement.bookservice.service.BookService;


@RestController
@RequestMapping("/books")
public class BookController {

	
	@Autowired
	private BookService bookService;

	@PostMapping("/")
	public Book saveBook(@RequestBody Book book)
	{
		return bookService.saveBook(book);
		
	}
	

	
	@GetMapping("/{id}")
	public ResponseTemplateVO getBookWithLibrary(@PathVariable("id") Long bookId)
	{
		return bookService.getBookWithLibrary(bookId);
		}
	
	@GetMapping("/AscO/{id}")
	public ResponseTemplateVO getBookInAscending(@PathVariable("id") Long bookId)
	{
		return bookService.getBookInAscending(bookId);
		}
	
	@PutMapping("/{id}")
	public Book updateBookYear(@PathVariable("id") Long bookId, 
											@RequestBody Book book) {
		 
		 return bookService.updateBookyear(bookId,book);
		
	}
	
	
	
	
}
