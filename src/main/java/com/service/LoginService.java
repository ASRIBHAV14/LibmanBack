package com.service;

import java.util.List;

import com.advices.InvalidCredentialsException;
import com.dto.LoginDto;
import com.entities.Login;

public interface LoginService {
	
	LoginDto login(Login login) throws InvalidCredentialsException;
	
	LoginDto logout(String email) throws InvalidCredentialsException;
}