package com.sgundla;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import com.sgundla.repository.EmployeeRepository;
import com.sgundla.model.Employee;

import java.util.List;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "*")
public class EmployeeServiceApplication {

    @Autowired
    private EmployeeRepository repository;

    @PostMapping("/addEmployee")
    public String register(@RequestBody Employee employee) {
        repository.save(employee);
        return employee.getName() + " was successfully added";
    }
    
    @GetMapping("/getAllEmployees")
    public List<Employee> findAllEmployees() {
        return repository.findAll();
    }

    @GetMapping("/findEmployee/{email}")
    public List<Employee> findEmployee(@PathVariable String email) {
        return repository.findByEmail(email);
    }

    @DeleteMapping("/delete/{id}")
    public List<Employee> deleteEmployee(@PathVariable int id) {
        repository.deleteById(id);
        return repository.findAll();
    }

    public static void main(String[] args) {
        SpringApplication.run(EmployeeServiceApplication.class, args);
    }
}


