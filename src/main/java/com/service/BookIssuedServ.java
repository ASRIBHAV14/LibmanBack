package com.service;

import java.util.List;
import java.util.Optional;

import com.dto.BooksIssuedDto;
import com.entities.BooksIssued;


public interface BookIssuedServ  {
	public BooksIssued addIssuedBook(BooksIssuedDto issued) throws Throwable;
	public BooksIssued updateIssuedBookDetails(BooksIssuedDto booksIssued) throws Throwable;
	
	public List<BooksIssued> viewBooksIssuedList();
	
   // public	Optional<BooksIssued> findByQuantitySorted(int quantity);
    public 	BooksIssuedDto findByIssueId(int issueId) throws Throwable;
	
	 public boolean deleteIssuedBooks(int issueId) throws Throwable;
	

}