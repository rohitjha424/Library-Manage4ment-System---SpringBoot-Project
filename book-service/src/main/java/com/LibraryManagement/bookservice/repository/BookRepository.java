package com.LibraryManagement.bookservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.LibraryManagement.bookservice.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

	Book findByBookId(Long userId);

	
	
	@Query(value = "SELECT * FROM book b WHERE b.bookId=?1 ORDER BY b.bookName",nativeQuery = true)
	Book getBookInAscending(Long bookId);
	


}
