package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.EmployeeFamilyDetails;

public interface FamilyRepository extends JpaRepository<EmployeeFamilyDetails, Long>{

}
