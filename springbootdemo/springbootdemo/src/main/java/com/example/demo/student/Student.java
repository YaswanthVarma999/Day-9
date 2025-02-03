package com.example.demo.student;

public class Student {

    private Integer id;
    private String name;
    private String course;
    private Integer age;
    private String email;

    public Student(Integer id, String name, String course, Integer age, String email) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.age = age;
        this.email = email;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
