package com.cg.InHouseMarketPlace.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.InHouseMarketPlace.model.Offer;

public interface OfferRepository extends JpaRepository<Offer,Integer> 
{

	@Query("select r from Offer r where r.category=?1 and r.type=?2")
	
	 	List<Offer> findAllOffers(String category, String type);

}