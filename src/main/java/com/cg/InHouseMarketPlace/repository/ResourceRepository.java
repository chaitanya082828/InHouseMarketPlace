package com.cg.InHouseMarketPlace.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.InHouseMarketPlace.model.Resource;

public interface ResourceRepository extends JpaRepository<Resource,Integer>
{
	 @Query("select r from Resource r where r.empId=?1")
	 Optional<Resource> findById(int empId);

	 @Query("select r from Resource r where r.category=?1 and r.type=?2")
	 Optional<Resource> findAll(String category, String type);

}