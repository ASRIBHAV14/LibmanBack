package com.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.entities.Publishers;
@Repository
public interface PublisherRepository extends JpaRepository<Publishers,Integer>  {
	 Optional<Publishers> findBypublisherName(String publisherName) ;
}