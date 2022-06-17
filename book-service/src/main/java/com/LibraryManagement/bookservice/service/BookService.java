package com.LibraryManagement.bookservice.service;

import java.util.Objects;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.LibraryManagement.bookservice.VO.Library;
import com.LibraryManagement.bookservice.VO.ResponseTemplateVO;
import com.LibraryManagement.bookservice.entity.Book;
import com.LibraryManagement.bookservice.repository.BookRepository;


@Service
public class BookService {

	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	public Book saveBook(Book book) {
	
		return bookRepository.save(book);
	}
	public ResponseTemplateVO getBookWithLibrary(Long bookId) {
		// TODO Auto-generated method stub
		ResponseTemplateVO vo =new ResponseTemplateVO();
		Book book=bookRepository.findByBookId(bookId);
		
		Library library=
				restTemplate.getForObject("http://LIBRARY-SERVICE/libraries/" + book.getLibId(),Library.class);
		vo.setBook(book);
		vo.setLibrary(library);
		return vo;
	

}
	public ResponseTemplateVO getBookInAscending(Long bookId) {
		ResponseTemplateVO vo =new ResponseTemplateVO();
		Book book=bookRepository.getBookInAscending(bookId);
		
		Library library=
				restTemplate.getForObject("http://LIBRARY-SERVICE/libraries/" + book.getLibId(),Library.class);
		vo.setBook(book);
		vo.setLibrary(library);
		return vo;
	}
	
	

	public Book updateBookyear(Long bookId, Book book) {
		Book bookDb = bookRepository.findById(bookId).get();
		if(Objects.nonNull(book.getBookPublishYear())) {
			bookDb.setBookPublishYear(bookId);
        }
		
		return bookRepository.save(book);
	}
	
	
}
