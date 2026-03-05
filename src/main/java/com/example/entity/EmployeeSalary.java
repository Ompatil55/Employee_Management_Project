package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_salary")
public class EmployeeSalary {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long salaryId;

	    private double salary;

	    @OneToOne
	    @JoinColumn(name="employee_id")
	    private Employee employee;
}
