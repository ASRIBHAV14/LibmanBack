package com.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advices.InvalidCredentialsException;
import com.advices.UserDetailsNotFoundException;
import com.advices.UserNotFoundException;
import com.dto.UserDto;
import com.entities.Login;
import com.entities.Users;
import com.repository.LoginRepository;
import com.repository.UsersRepository;

@Service
public class UsersServImp implements UsersServ {

	@Autowired
	UsersRepository rep;

	@Autowired
	LoginRepository lrep;

	@Override
	public Users registerUserDetails(UserDto user) throws Throwable {
		Optional<Users> u1 = rep.findById(user.getUserid());
		if (u1.isPresent()) {
			throw new UserNotFoundException("User already exists with given Id");

		}

		Users u2 = new Users();
		u2.setUserid(user.getUserid());
		u2.setFirstName(user.getFirstName());
		u2.setLastName(user.getLastName());
		u2.setMobileno(user.getMobileno());
		u2.setDateofbirth(user.getDateofbirth());
		// u2.setPassword(user.getPassword());

		Login l1 = new Login();
		l1.setEmail(user.getEmail());
		l1.setRole(user.getRole());
		l1.setPassword(user.getPassword());
		l1.setLoggedIn(false);

		u2.setLogin(l1);

		return rep.save(u2);
	}

	@Override
	public List<Users> viewAllUsers() {
		List<Users> l1 = rep.findAll();
		return l1;
	}

	@Override
	public Users updateUserDetails(UserDto user) throws Throwable {

		Optional<Users> b = rep.findById(user.getUserid());
		if (!b.isPresent()) {
			throw new UserNotFoundException("User not found with given id ");
		}

		Users u2 = b.get();
		u2.setUserid(user.getUserid());
		u2.setFirstName(user.getFirstName());
		u2.setLastName(user.getLastName());
		u2.setMobileno(user.getMobileno());
		u2.setDateofbirth(user.getDateofbirth());
		u2.getLogin().setRole(user.getRole());
		u2.getLogin().setEmail(user.getEmail());
		u2.getLogin().setPassword(user.getPassword());
		return rep.save(u2);

	}

	@Override
	public Users deleteUserDetails(Users user) {
		rep.delete(user);
		return user;
	}

//	@Override
//	public Users getEmail(String email) {
//		Users eid =rep.findByEmail(email);
//		return eid;
//	}

	@Override
	public Users getMobileno(String mobileno) {
		Users eid = rep.findByMobileno(mobileno);
		return eid;
	}

}
