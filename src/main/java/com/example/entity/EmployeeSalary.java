package com.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	    private Long id;

	    private Double salary;
	    
	    private Double bonus;

	    
	    @OneToOne
	    @JoinColumn(name = "employee_id")
	    @JsonIgnore
	    private Employee employee;


		public EmployeeSalary(Long id, Double salary, Double bonus, Employee employee) {
			super();
			this.id = id;
			this.salary = salary;
			this.bonus = bonus;
			this.employee = employee;
		}


		public EmployeeSalary() {
			super();
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public double getSalary() {
			return salary;
		}


		public void setSalary(Double salary) {
			this.salary = salary;
		}


		public double getBonus() {
			return bonus;
		}


		public void setBonus(Double bonus) {
			this.bonus = bonus;
		}


		public Employee getEmployee() {
			return employee;
		}


		public void setEmployee(Employee employee) {
			this.employee = employee;
		}
		
	    
	    
}
