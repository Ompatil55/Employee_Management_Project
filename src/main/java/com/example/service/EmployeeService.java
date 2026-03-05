import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repo.EmployeeRepository;

gitpackage com.example.service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepo;

}
