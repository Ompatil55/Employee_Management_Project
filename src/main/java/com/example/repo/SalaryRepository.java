package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.EmployeeSalary;

@Repository
public interface SalaryRepository extends JpaRepository<EmployeeSalary, Long>{

}
