package com.cg.InHouseMarketPlace.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.InHouseMarketPlace.model.Requirement;

public interface RequirementRepository extends JpaRepository<Requirement,Integer>
{
    //to find requirement based on category, string
	List<Requirement> findAllRequirements(String category, String type);
}
