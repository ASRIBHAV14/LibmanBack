package com.controller;
import java.util.List;
import java.util.Optional;
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

import com.dto.BooksIssuedDto;
import com.entities.BooksIssued;
import com.service.BookIssuedServImp;
@CrossOrigin
@RestController

@RequestMapping("/api")
public class BookIssuedCon {
	
	@Autowired 
	BookIssuedServImp bookissuedservice;
	@PostMapping("/addissuedbook")
	public ResponseEntity<BooksIssued> addIssuedBook(@RequestBody BooksIssuedDto issued) throws Throwable 
	{
		 BooksIssued b1=bookissuedservice.addIssuedBook(issued);
			ResponseEntity re=new ResponseEntity<BooksIssued>(b1,HttpStatus.OK);
		  return re;
	}
	@PutMapping("/updateissuedbook")
	public ResponseEntity<BooksIssued> updateIssuedBookDetails(@RequestBody  BooksIssuedDto booksIssued) throws Throwable 
	{
		BooksIssued  e1=bookissuedservice.updateIssuedBookDetails(booksIssued);
		
		ResponseEntity re=new ResponseEntity<BooksIssued>(e1,HttpStatus.OK);
		return re;
	}
	
	@DeleteMapping("/deleteissuedbook/{issueId}")
	public ResponseEntity<BooksIssued> deleteIssuedBooks(@PathVariable int issueId) throws Throwable
	{
		bookissuedservice.deleteIssuedBooks(issueId);
		
		ResponseEntity re=new ResponseEntity<String>("deleted",HttpStatus.OK);
		return re;
	}
	@GetMapping("/viewbookissuedlist")
	public ResponseEntity<List<BooksIssued>> viewBooksIssuedList()
	{
		List<BooksIssued> v1=bookissuedservice.viewBooksIssuedList();
		ResponseEntity re=new ResponseEntity<>(v1,HttpStatus.OK);
		return re;
	}
	@GetMapping("/viewByIssuedId/{issueId}")
	public  ResponseEntity<BooksIssued> findByIssuedId(@PathVariable int issueId) throws Throwable
	{
		BooksIssuedDto c=bookissuedservice.findByIssueId(issueId);
		ResponseEntity re=new ResponseEntity<BooksIssuedDto>(c,HttpStatus.OK);
		return re;
	}


}