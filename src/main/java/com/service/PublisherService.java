package com.service;

import java.util.List;

import com.entities.Publishers;


public interface PublisherService {
	public Publishers addPublisher(Publishers publisher);
	public Publishers  updatePublisherDetails(Publishers publisher) throws Throwable;
	public boolean removePublisher(int publisherId) throws Throwable;
	public List<Publishers> viewPublishersList();
	public Publishers viewPublisherById(int id) throws Throwable;
	public Publishers getBypublisherName(String publisherName)throws Throwable;
}