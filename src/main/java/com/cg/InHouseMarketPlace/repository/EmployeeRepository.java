package com.cg.InHouseMarketPlace.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.InHouseMarketPlace.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
