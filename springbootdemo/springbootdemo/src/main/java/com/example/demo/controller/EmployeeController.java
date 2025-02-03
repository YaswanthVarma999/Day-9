package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.demo.employee.Employee;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private List<Employee> employees = new ArrayList<>(); // In-memory storage

    @PostMapping
    public String saveEmployee(@RequestBody Employee employee) {
        employees.add(employee); // Add employee to list
        return "Employee is saved!";
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Integer id) {
        return employees.stream()
                        .filter(employee -> employee.getId().equals(id))
                        .findFirst()
                        .orElse(null);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Integer id) {
        boolean removed = employees.removeIf(employee -> employee.getId().equals(id));
        if (removed) {
            return "Employee with ID " + id + " is deleted!";
        } else {
            return "Employee with ID " + id + " not found!";
        }
    }
}
