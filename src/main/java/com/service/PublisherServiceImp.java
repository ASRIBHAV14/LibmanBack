package com.service;

import java.util.List;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advices.BookNotFoundException;
import com.advices.PublisherNotFoundException;
import com.entities.Publishers;
import com.repository.PublisherRepository;
@Service
public class PublisherServiceImp implements PublisherService {
	  @Autowired
      private PublisherRepository publisherrepo;
	@Override
	public Publishers addPublisher(Publishers publisher) {
		publisherrepo.save(publisher);
		return publisher;
	}

	@Override
	public Publishers  updatePublisherDetails(Publishers publisher) throws Throwable {
		Supplier s1 = () -> new PublisherNotFoundException("publisher not found");
	Publishers publisher1 = publisherrepo.findById(publisher.getPublisherId()).orElseThrow(s1);
	 publisher1.setPublisherName(publisher.getPublisherName()); 
	 publisher1.setContactno(publisher.getContactno());
	 publisher1.setEmail(publisher.getEmail());
	 publisher1.setAddress(publisher.getAddress());
	 publisher1.setCity(publisher.getCity());
	 publisher1.setState(publisher.getState());
	 publisher1.setPincode(publisher.getPincode());
	 publisherrepo.save(publisher1);
		return publisher1;
	}
		

	@Override
	public boolean removePublisher(int publisherId) throws Throwable {
		Supplier s = () -> new  PublisherNotFoundException("publisher not found");
		Publishers publisher2 = publisherrepo.findById(publisherId).orElseThrow(s);
		if (publisher2 != null) {
			publisherrepo.deleteById(publisherId);
			return true;
		}
		return false;
	}

	@Override
	public List<Publishers> viewPublishersList() {
		List<Publishers> publisher3 =publisherrepo.findAll();
		return publisher3;
		
	}

	@Override
	public Publishers viewPublisherById(int id) throws Throwable {
		Supplier s1 = () -> new PublisherNotFoundException("publisher not found");
		 Publishers publishers3 = publisherrepo.findById(id).orElseThrow(s1);
		return publishers3;
		
	}
	@Override
	public Publishers getBypublisherName(String publisherName) throws Throwable {
		Supplier s1 = () -> new PublisherNotFoundException("publisher not found");
		Publishers p=publisherrepo.findBypublisherName(publisherName).orElseThrow(s1);
		return p;
	}

}