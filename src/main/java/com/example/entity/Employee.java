package com.example.entity;

import java.util.List;

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
	
	private String email;
    private String department;

    @OneToMany(mappedBy="employee")
    private List<EmployeeFamilyDetails> familyDetails;

    @OneToOne(mappedBy="employee")
    private EmployeeSalary salary;

	public Employee(Long id, String name, String email, String department, List<EmployeeFamilyDetails> familyDetails,
			EmployeeSalary salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.department = department;
		this.familyDetails = familyDetails;
		this.salary = salary;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public List<EmployeeFamilyDetails> getFamilyDetails() {
		return familyDetails;
	}

	public void setFamilyDetails(List<EmployeeFamilyDetails> familyDetails) {
		this.familyDetails = familyDetails;
	}

	public EmployeeSalary getSalary() {
		return salary;
	}

	public void setSalary(EmployeeSalary salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", department=" + department
				+ ", familyDetails=" + familyDetails + ", salary=" + salary + "]";
	}


	}
    
   
