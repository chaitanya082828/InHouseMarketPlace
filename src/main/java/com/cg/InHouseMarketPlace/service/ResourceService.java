package com.cg.InHouseMarketPlace.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.InHouseMarketPlace.model.Resource;
import com.cg.InHouseMarketPlace.repository.ResourceRepository;

@Service
public class ResourceService {
	@Autowired
	public ResourceRepository resourceRepository;
	
	public Optional<Resource> getAllResources(String category, String type) {
		return resourceRepository.findAll(category, type);
	}
	
	public Optional<Resource> getAllResources(int empId){
		return resourceRepository.findById(empId);
	}
}