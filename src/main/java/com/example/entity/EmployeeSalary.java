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
	    private Long id;

	    private double salary;
	    
	    private double bouns;

	    
	    @OneToOne
	    @JoinColumn(name = "employee_id")
	    private Employee employee;


		public EmployeeSalary(Long id, double salary, double bouns, Employee employee) {
			super();
			this.id = id;
			this.salary = salary;
			this.bouns = bouns;
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


		public void setSalary(double salary) {
			this.salary = salary;
		}


		public double getBouns() {
			return bouns;
		}


		public void setBouns(double bouns) {
			this.bouns = bouns;
		}


		public Employee getEmployee() {
			return employee;
		}


		public void setEmployee(Employee employee) {
			this.employee = employee;
		}
		
	    
	    
}
