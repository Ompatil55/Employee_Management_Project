package com.example.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repo.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
//	public EmployeeService(EmployeeRepository employeeRepo) {
//		this.employeeRepository = employeeRepository;
//	}

	//save employee
	public Employee saveEmployee(Employee employee) {
		Employee e = employeeRepository.save(employee);
		return e;
	}

	//Get all employee
	public List<Employee> getAllEmployee() {
	
		return employeeRepository.findAll();
	}

	//Get employee by id
	public Employee getEmployeeById(Long id) {
		
		return employeeRepository.findById(id)
			            .orElse(null);
		 
	}


	//update employee
	public Employee updateEmp(Long id, Employee emp) {
		Employee e = employeeRepository.findById(id).orElse(null);
		if(e != null) {
		  e.setName(emp.getName());
		  e.setDepartment(emp.getDepartment());
		  e.setEmail(emp.getEmail());
		  
		return e;
		}
		return null;
	}


    //Delete Employee
	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
	}

}
