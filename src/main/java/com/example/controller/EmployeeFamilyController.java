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

import com.example.entity.EmployeeFamilyDetails;
import com.example.service.EmployeeFamilyService;

@RestController
@RequestMapping("/family")
public class EmployeeFamilyController {

	    @Autowired
	    private EmployeeFamilyService familyService;

	    // Add family member
	    @PostMapping
	    public EmployeeFamilyDetails createFamily(@RequestBody EmployeeFamilyDetails family) {
	        return familyService.saveFamily(family);
	    }

	    // Get all family members
	    @GetMapping
	    public List<EmployeeFamilyDetails> getAllFamily() {
	        return familyService.getAllFamilyMembers();
	    }

	    // Get family member by id
	    @GetMapping("/{id}")
	    public EmployeeFamilyDetails getFamily(@PathVariable Long id) {
	        return familyService.getFamilyById(id);
	    }

	    // Update family member
	    @PutMapping("/{id}")
	    public EmployeeFamilyDetails updateFamily(@PathVariable Long id, @RequestBody EmployeeFamilyDetails family) {
	        return familyService.updateFamily(id, family);
	    }

	    // Delete family member
	    @DeleteMapping("/{id}")
	    public String deleteFamily(@PathVariable Long id) {
	        familyService.deleteFamily(id);
	        return "Family Member Deleted Successfully";
	    }
}
