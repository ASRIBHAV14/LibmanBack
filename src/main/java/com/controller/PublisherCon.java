package com.controller;


import java.util.List;
import java.util.concurrent.Flow.Publisher;

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

import com.entities.Publishers;
import com.service.PublisherService;


@CrossOrigin
@RestController
@RequestMapping("/lms")
public class PublisherCon {
	
	@Autowired
	PublisherService publisherserv;
	
	@PostMapping("/addPublisher")
	public ResponseEntity<Publishers> addPublisher(@RequestBody Publishers p){
		Publishers publishers=publisherserv.addPublisher(p);
		ResponseEntity re=new ResponseEntity<Publishers>(publishers,HttpStatus.OK);
		return re;
	}
	
	@PutMapping("/updatePublisher")
	public ResponseEntity<Publishers> updatePublisher(@RequestBody Publishers p) throws Throwable
	{
		Publishers publishers1=publisherserv.updatePublisherDetails(p);
		ResponseEntity re=new ResponseEntity<Publishers>(publishers1,HttpStatus.OK);
		return re;
	}
	@DeleteMapping("/deletePublisher/{publisherid}")
	public ResponseEntity<String> deletePublisher(@PathVariable  int publisherid) throws Throwable
	{
		publisherserv.removePublisher(publisherid);
		ResponseEntity re=new ResponseEntity<String>("Deleted",HttpStatus.OK);
		return re;
	}
	@GetMapping("/viewPublishers")
	public ResponseEntity<List<Publishers>>viewPublishers () {
		List<Publishers> publishers2 = publisherserv.viewPublishersList();
		ResponseEntity re = new ResponseEntity<List<Publishers>>(publishers2, HttpStatus.OK);
		return re;
	}
	@GetMapping("/viewPublishersbyId/{id}")
	public ResponseEntity<Publishers> viewAuthorById(@PathVariable int id) throws Throwable{
		Publishers publishers2=publisherserv.viewPublisherById(id);
		ResponseEntity re=new ResponseEntity<Publishers>(publishers2,HttpStatus.OK);
		return re;
	}
	@GetMapping("/getbyPublisherName/{publisherName}")
	   public ResponseEntity<Publishers> getbypname(@PathVariable String publisherName) throws Throwable{
		   Publishers p=publisherserv.getBypublisherName(publisherName);
		   ResponseEntity<Publishers> re=new ResponseEntity<Publishers>(p,HttpStatus.OK);
		   return re;
	   }


}