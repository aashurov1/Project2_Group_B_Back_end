package com.revature.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.model.Listing;

public interface ListingDao extends JpaRepository<Listing, Integer>{

	//must follow specific Spring naming format
	Page<Listing> findByTypeAndCityContainingIgnoreCase(Integer type, String city, Pageable pageable);
	
	Page<Listing> findByType(Integer type, Pageable pageable);
	
	Page<Listing> findByCityContainingIgnoreCase(String city, Pageable pageable);
	
	List<Listing> findAllByUserId(Integer userId);
}