package com.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.BooksDto;
import com.entities.Books;

import com.service.BooksServiceImpl;

@CrossOrigin
@RestController
@RequestMapping("/lms")
public class BooksCon {
	@Autowired
	BooksServiceImpl bookservice;
	
	@PostMapping(path="/addBooks")
	public ResponseEntity<Books> addBook(@RequestBody BooksDto book)
	{
		Books b1 = bookservice.addBook(book);
		ResponseEntity re = new ResponseEntity<Books>(b1,HttpStatus.OK);
		return re;
	}
	
	@PutMapping(path="/updateBookDetails")
	public ResponseEntity<Books> updateBookDetails(@RequestBody BooksDto book) throws Throwable
	{
		Books b2 = bookservice.updateBookDetails(book);
		ResponseEntity re = new ResponseEntity<Books>(b2,HttpStatus.OK);
		return  re;
		
	}
	@DeleteMapping(path="/removeBook/{bookid}")
	public ResponseEntity<Books> removeBook(@PathVariable Long bookid) throws Throwable
	{
		 bookservice.removeBook(bookid);
	     ResponseEntity re = new ResponseEntity<String>("Deleted",HttpStatus.OK);
	     return re;
		
	}
	@GetMapping("/searchBookByTitle/{title}")
	public ResponseEntity<BooksDto> searchBookByTitle(@PathVariable String title) throws Throwable 
	{
		BooksDto b3=bookservice.searchBookByTitle(title);
		ResponseEntity re=new ResponseEntity<BooksDto>(b3,HttpStatus.OK);
		return re;
	}
	@GetMapping("/searchBookBySubject/{subject}")
	public ResponseEntity<BooksDto> searchBookBySubject(@PathVariable String subject) throws Throwable 
	{
		BooksDto b3=bookservice.searchBookBySubject(subject);
		ResponseEntity re=new ResponseEntity<BooksDto>(b3,HttpStatus.OK);
		return re;
	}
	@GetMapping("/viewAllBooks")
	public ResponseEntity<Books> viewAllBooks()
	{
		List<Books> lb = bookservice.viewAllBooks();
		ResponseEntity re=new ResponseEntity<List<Books>>(lb,HttpStatus.OK);
		return re;
		
		
	}
	@GetMapping("/viewBookbyId/{bookid}")
	public ResponseEntity<Books> viewAuthorById(@PathVariable Long bookid) throws Throwable{
		Books b1=bookservice.viewBookById(bookid);
		ResponseEntity re=new ResponseEntity<Books>(b1,HttpStatus.OK);
		return re;
	}
	
	

}