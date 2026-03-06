package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_family_details")
public class EmployeeFamilyDetails {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long Id;

	    private String memberName;
	    
	    private String relation;

	    @ManyToOne
	    @JoinColumn(name = "employee_id")
	    private Employee employee;

		public EmployeeFamilyDetails(Long id, String memberName, String relation, Employee employee) {
			super();
			Id = id;
			this.memberName = memberName;
			this.relation = relation;
			this.employee = employee;
		}

		
		public EmployeeFamilyDetails() {
			super();
		}

		
		
		public Long getId() {
			return Id;
		}

		public void setId(Long id) {
			Id = id;
		}

		public String getMemberName() {
			return memberName;
		}

		public void setMemberName(String memberName) {
			this.memberName = memberName;
		}

		public String getRelation() {
			return relation;
		}

		public void setRelation(String relation) {
			this.relation = relation;
		}

		public Employee getEmployee() {
			return employee;
		}

		public void setEmployee(Employee employee) {
			this.employee = employee;
		}
	    
	    
	    
}
