package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Employee;
import com.example.entity.EmployeeSalary;
import com.example.service.EmployeeSalaryService;

@RestController
@RequestMapping("/salary")
public class EmployeeSalaryController {

	@Autowired
	private EmployeeSalaryService salaryService;
	
	//Create salary
	@PostMapping
	public EmployeeSalary saveSalary(@RequestBody EmployeeSalary salary) {
		return salaryService.saveSalary(salary);
	}
	
	//get all salaries 
	  @GetMapping
	    public List<EmployeeSalary> getAllSalaries() {
	        return salaryService.getAllSalaries();
	    }
	  
	  //get salaries by Id
	  @GetMapping("/{id}")
	  public EmployeeSalary getSalary(@PathVariable Long id) {
		  return salaryService.getSalaryById(id);
	  }
	  
	  
	  // Update Salary
	    @PutMapping("/{id}")
	    public EmployeeSalary updateSalary(@PathVariable Long id, @RequestBody EmployeeSalary salary) {
	        return salaryService.updateSalary(id, salary);
	    }

	    
	    // Delete Salary
	    @DeleteMapping("/{id}")
	    public String deleteSalary(@PathVariable Long id) {
	        salaryService.deleteSalary(id);
	        return "Salary deleted successfully";
	    }

}
