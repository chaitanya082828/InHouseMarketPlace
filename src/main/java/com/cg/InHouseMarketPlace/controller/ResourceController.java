package com.cg.InHouseMarketPlace.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.InHouseMarketPlace.exception.InvalidEmployeeException;
import com.cg.InHouseMarketPlace.model.Resource;
import com.cg.InHouseMarketPlace.service.ResourceService;


@RestController
public class ResourceController
{
	@Autowired
	ResourceService resourceService;
	
	@GetMapping("/resource/{category, type}")
	public Optional<Resource> getAllResources(@PathVariable String category,@PathVariable String type){
		return resourceService.getAllResources(category, type);
	}
	@GetMapping("/resource/{empId}")
	public ResponseEntity<Resource> getAllResources(@PathVariable int empId) {
		Optional<Resource> resource = resourceService.getAllResources(empId);
		if (!resource.isPresent()) {
			throw new InvalidEmployeeException("Not found Employee with empId : " + empId + " to return");
		}
		return new ResponseEntity<Resource>(resource.get(), HttpStatus.OK);
	}
}