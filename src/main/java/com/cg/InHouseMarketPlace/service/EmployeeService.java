package com.cg.InHouseMarketPlace.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.InHouseMarketPlace.model.Employee;
import com.cg.InHouseMarketPlace.model.Offer;
import com.cg.InHouseMarketPlace.model.Proposal;
import com.cg.InHouseMarketPlace.model.Requirement;
import com.cg.InHouseMarketPlace.repository.EmployeeRepository;

@Service
	public class EmployeeService {
		
		@Autowired
		private  EmployeeRepository employeeRepository;
		
		public Employee saveEmployee(Employee employee)
		{
			
			return employeeRepository.save(employee);
		}
		
		  public Employee editEmployee(Employee employee) 
		{
			if(employeeRepository.findById(employee.getEmpId())!=null) 
			{
				return employeeRepository.save(employee);
			}
			
			      else 
			   {
				   return null;
			   }
		}
		
		public Employee getEmployee(int empId)
		{
			return employeeRepository.findById(empId).orElse(null);
		}
		
		public Offer updateIsAvailable(Offer offer)
		{
			boolean off=employeeRepository.existsById(offer.getOfferId());
			
			if(off==true)
			return offer;
			else
		    return null;
		}
		
		public Requirement updateIsFulfilled(Requirement req)
		{
              boolean requirement=employeeRepository.existsById(req.getReqId());
			
			    if(requirement==true)
			    return req;
			    else
		        return null;
		}
		
		public Proposal updateIsAccepted(Proposal prop)
		{
            boolean  proposal=employeeRepository.existsById(prop.getPropId());
			
		     if(proposal==true)
			 return prop;
			 else
		     return null;
		}
		
		@SuppressWarnings("unchecked")
		public List<Offer> getAllOffers(int empId) 
		{
			return(List<Offer>)employeeRepository.findById(empId).orElse(null);
		
		}

		@SuppressWarnings("unchecked")
		public List<Requirement> getAllRequirements(int empId)
		{
			return (List<Requirement>) employeeRepository.findById(empId).orElse(null);
		}
	}
