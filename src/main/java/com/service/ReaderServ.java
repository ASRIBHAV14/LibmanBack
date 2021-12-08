package com.service;

import java.util.List;

import com.advices.ReaderNotFoundException;
import com.entities.Readers;


public interface ReaderServ {
	public Readers register(Readers reader);
	public Readers updateReaderDetails(Readers reader);
	public boolean deleteReader(int id) throws Throwable;
	public List<Readers> viewReadersList();
	public Readers viewReaderById(int id);
//	public Boolean loginValidate(String id,String password) throws ReaderNotFoundException;
//	public Readers getPassword(String password);
	public Readers getMobileno(String mobileno);
}