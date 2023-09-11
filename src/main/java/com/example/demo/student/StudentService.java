package com.example.demo.student;

import com.example.demo.utils.ResponseHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Objects;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
            this.studentRepository = studentRepository;
    }
    public List<Student> getStudents() {
            return studentRepository.findAll();
    }
    
    public ResponseEntity<Object> createStudent(CreateStudentDto student) {
        return ResponseHandler.generateResponse("Create student success", HttpStatus.CREATED, student);
    }
}
