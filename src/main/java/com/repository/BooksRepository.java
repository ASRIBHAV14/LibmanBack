package com.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.entities.Books;



public interface BooksRepository extends JpaRepository<Books,Long>{
	// Optional<Books> findByTitle(String title);
		
		//@Query("Select book from Books book order by book.title ")
	Optional<Books> findBookByTitle(String title);
		
	Books findBySubject(String subject);
		
		//@Query("Select book from Books book order by book.subject")
	Optional<Books> findBookBySubject(String subject);
		

}