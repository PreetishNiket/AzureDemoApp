package com.nagarro.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.demo.model.Employee;
import com.nagarro.demo.repo.EmployeeRepository;

@SpringBootApplication
@RestController
public class AzureDemoApplication {

	@Autowired
    private EmployeeRepository repository;

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return repository.save(employee);
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return repository.findAll();
    }
	public static void main(String[] args) {
		SpringApplication.run(AzureDemoApplication.class, args);
		System.out.println("Application Started");
	}

}
