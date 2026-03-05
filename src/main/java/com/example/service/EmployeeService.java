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

	public Employee saveEmployee(Employee employee) {
		Employee e = employeeRepository.save(employee);
		return e;
	}

	
	public List<Employee> getAllEmployee() {
	
		return employeeRepository.findAll();
	}

	
	public Employee getEmployeeById(Long id) {
		
		
			return employeeRepository.findById(id)
			            .orElse(null);
		 
	}


	public Employee updateEmp(Long id, Employee emp) {
		Employee e = employeeRepository.findById(id).orElse(null);
		
		  e.setName(emp.getName());
		  e.setDepartment(emp.getDepartment());
		  e.setEmail(emp.getEmail());
		  
		return e;
	}


	


	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
		
	}

}
