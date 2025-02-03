package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.demo.student.Student;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private List<Student> students = new ArrayList<>(); // In-memory storage

    @PostMapping
    public String saveStudent(@RequestBody Student student) {
        students.add(student); // Add student to list
        return "Student is saved!";
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Integer id) {
        return students.stream()
                       .filter(student -> student.getId().equals(id))
                       .findFirst()
                       .orElse(null);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return students;
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Integer id) {
        boolean removed = students.removeIf(student -> student.getId().equals(id));
        if (removed) {
            return "Student with ID " + id + " is deleted!";
        } else {
            return "Student with ID " + id + " not found!";
        }
    }
}
