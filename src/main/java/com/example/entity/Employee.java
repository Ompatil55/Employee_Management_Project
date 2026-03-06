package com.example.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
    private String department;

	private String email;
	
	//One employee have one salary
    @OneToOne(mappedBy="employee")
//    @JsonIgnore
	    private EmployeeSalary salary;
  
    //one employee have multiple family member
    @OneToMany(mappedBy="employee")
//    @JsonIgnore
    private List<EmployeeFamilyDetails> familyDetails;
    
    
    
    

	public Employee(Long id, String name, String department, String email, EmployeeSalary salary,
			List<EmployeeFamilyDetails> familyDetails) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.email = email;
		this.salary = salary;
		this.familyDetails = familyDetails;
	}
	
	

	public Employee() {
		super();
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public EmployeeSalary getSalary() {
		return salary;
	}

	public void setSalary(EmployeeSalary salary) {
		this.salary = salary;
	}

	public List<EmployeeFamilyDetails> getFamilyDetails() {
		return familyDetails;
	}

	public void setFamilyDetails(List<EmployeeFamilyDetails> familyDetails) {
		this.familyDetails = familyDetails;
	}

  

}
    
   
