package com.cg.InHouseMarketPlace.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.InHouseMarketPlace.model.Requirement;
import com.cg.InHouseMarketPlace.repository.RequirementRepository;

@Service
public class RequirementService
{
	@Autowired
	private  RequirementRepository requirementRepository;
	
//to add requirement
	public Requirement addRequirement(Requirement requirement)
	{
		return requirementRepository.save(requirement);
	}

//to update requirement	
	public Requirement editRequirement(Requirement requirement) 
	{
		if(requirementRepository.findById(requirement.getReqId())!=null) 
		{
			return requirementRepository.save(requirement);
		}
		else 
		   {
			   return null;
		   }
	}

//to find requirement based on reqId	
	public Requirement getRequirement(int reqId)  
	{
		return requirementRepository.findById(reqId).orElse(new Requirement());
	}
	
//to delete requirement based on reqId
	public Requirement removeRequirement(int reqId)
	{
		requirementRepository.deleteById(reqId);
		return null;
	}
	
//to find all requirements	
	public List<Requirement> getAllRequirements()
	{
		return (List<Requirement>) requirementRepository.findAll();
	}
	
//to find requirements based on category and type
	public List<Requirement> getAllRequirements(String category, String type)
	{
        return (List<Requirement>) requirementRepository.findAllRequirements(category,type);
    }

}
