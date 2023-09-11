package com.example.demo.student;

import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class CreateStudentDto {
    @NotNull(message = "ID here can not be null")
    private int id;
    
    @NotEmpty(message = "Name can not be empty")
    @NotNull(message = "Name can not be null")
    @Size(min = 2, max = 10, message = "Length must be between 2 and 10")
    private String name;
    
    @Email(message = "Email is not valid")
    private String email;
    
    private LocalDate dob;
    private Integer age;

    public CreateStudentDto() {
    }

    public CreateStudentDto(int id, String name, String email, LocalDate dob, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
