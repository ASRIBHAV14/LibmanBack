package com.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advices.BookNotFoundException;
import com.advices.UserNotFoundException;
import com.entities.Admin;
import com.entities.Books;
import com.entities.BooksOrder;
import com.entities.DamagedBooks;
import com.entities.Users;
import com.repository.AdminRepository;
import com.repository.BooksOrderRepository;
import com.repository.BooksRepository;
import com.repository.DamagedBooksRepository;
import com.repository.UsersRepository;
@Service
public class AdminServiceImp implements AdminService{
	@Autowired
	private AdminRepository adminrepo;
	
	
	@Override
	public Admin addAdminDetails(Admin ad)
	{
		adminrepo.save(ad);
		return ad;
	}


}