package com.cg.InHouseMarketPlace.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.InHouseMarketPlace.exception.InvalidEmployeeException;
import com.cg.InHouseMarketPlace.model.Employee;
import com.cg.InHouseMarketPlace.model.Offer;
import com.cg.InHouseMarketPlace.model.Proposal;
import com.cg.InHouseMarketPlace.model.Requirement;
import com.cg.InHouseMarketPlace.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/add")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee emp){
		Employee addedEmployee = employeeService.saveEmployee(emp);
		return new ResponseEntity<Employee>(addedEmployee, HttpStatus.OK);
	}
	
	  @PutMapping("/update")
	  public Employee updateEmployee(@RequestBody Employee emp)
	  {
		return employeeService.editEmployee(emp);
	  }
	
	  @GetMapping("/{empId}")
	   public ResponseEntity<Employee> getEmployeeById(@PathVariable int empId)
	  {
		Employee fetchedEmployee = employeeService.getEmployee(empId);
		if(fetchedEmployee.getEmpId()==0)
		{
			throw new InvalidEmployeeException("No employee found with id= : " + empId);
		}
		else 
		{
			return new ResponseEntity<Employee>(fetchedEmployee,HttpStatus.OK);
		}
      	}
	
	    @GetMapping("/getoffer{empId}")
	    public ResponseEntity<List<Offer>> getAllOffers(@PathVariable int empId)
	    {
		      List<Offer> fetchedOffers=employeeService.getAllOffers(empId);
		         if(fetchedOffers.isEmpty())
		       {
			       throw new InvalidEmployeeException("No Employee found with id= : " + empId);
		       }
		           else
		       {
			      return new ResponseEntity<List<Offer>>(fetchedOffers,HttpStatus.OK);
		       }
	   }
	    
	    @GetMapping("/getoffer{empId}")
	    public ResponseEntity<List<Requirement>> getAllRequirements(@PathVariable int empId)
	    {
		  List<Requirement> fetchedRequirements=employeeService.getAllRequirements(empId);
		  
		 if(fetchedRequirements.isEmpty())
		 {
			 throw new InvalidEmployeeException("No Employee found with id= : " + empId);
		 }
		 else
			 return new ResponseEntity<List<Requirement>>(fetchedRequirements,HttpStatus.OK);   
          }
	    
	    @GetMapping("updateOffer")
	    public  Offer updateAvailable(@RequestBody Offer offer)
	    {
	    	return employeeService.updateIsAvailable(offer);
	    	
	    }
	    @GetMapping("updateRequirement")
	    public  Requirement updateFulfilled(@RequestBody Requirement req)
	    {
	    	return employeeService.updateIsFulfilled(req);
	    	
	    }
	    @GetMapping("updateProposal")
	    public  Proposal updateAccepted(@RequestBody Proposal prop)
	    {
	    	return employeeService.updateIsAccepted(prop);
	    	
	    }    
}