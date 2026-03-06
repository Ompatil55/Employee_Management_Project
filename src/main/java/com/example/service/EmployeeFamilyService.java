package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.EmployeeFamilyDetails;
import com.example.repo.FamilyRepository;

@Service
public class EmployeeFamilyService {

	    @Autowired
	    private FamilyRepository familyRepository;

	    // Save family member
	    public EmployeeFamilyDetails saveFamily(EmployeeFamilyDetails family) {
	        return familyRepository.save(family);
	    }

	    
	    // Get all family members
	    public List<EmployeeFamilyDetails> getAllFamilyMembers() {
	        return familyRepository.findAll();
	    }

	    
	    // Get family member by id
	    public EmployeeFamilyDetails getFamilyById(Long id) {
	        return familyRepository.findById(id).orElse(null);
	    }

	    
	    // Update family member
	    public EmployeeFamilyDetails updateFamily(Long id, EmployeeFamilyDetails family) {

	        EmployeeFamilyDetails e = familyRepository.findById(id).orElse(null);

	        if (e != null) {
	            e.setMemberName(family.getMemberName());
	            e.setRelation(family.getRelation());
	            return familyRepository.save(e);
	        }

	        return null;
	    }

	    
	    
	    // Delete family member
	    public void deleteFamily(Long id) {
	        familyRepository.deleteById(id);
	    }
}
