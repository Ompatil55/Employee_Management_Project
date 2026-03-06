package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.entity.EmployeeSalary;
import com.example.repo.SalaryRepository;

@Service
public class EmployeeSalaryService {
	
	@Autowired
	private SalaryRepository salaryRepository;


	public EmployeeSalary saveSalary(EmployeeSalary salary) {
		
		return salaryRepository.save(salary);
	}

	
	  public List<EmployeeSalary> getAllSalaries() {
	        return salaryRepository.findAll();
	   }

	  
	  public EmployeeSalary getSalaryById(Long id) {
	
		return salaryRepository.findById(id).orElse(null);
	  }

	  
	  public EmployeeSalary updateSalary(Long id, EmployeeSalary salary) {
		  EmployeeSalary e = salaryRepository.findById(id).orElse(null);
			
		  if(e != null) {
			  e.setSalary(salary.getSalary());
			  e.setBonus(salary.getBonus());
			  
			  return salaryRepository.save(e);
		  }
		  
		return null;
	  }

	  
	  public void deleteSalary(Long id) {
		
		  salaryRepository.deleteById(id);
	  }
}