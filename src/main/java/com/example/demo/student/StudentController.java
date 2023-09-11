package com.example.demo.student;

import com.example.demo.utils.AppConfig;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "student")
public class StudentController {
    Logger logger = LoggerFactory.getLogger(StudentController.class);
    private AppConfig appConfig;
    private final StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService, AppConfig appConfig) {
        this.studentService = studentService;
        this.appConfig = appConfig;
    }
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("/get-student")
    public List<String> getStudents() {
        logger.error(appConfig.getA());
        logger.error("Dcm");
        return List.of("one", "two");
    }

    @PostMapping("/post")
    public ResponseEntity<Student> post(@RequestBody @Valid Student student) {
        return ResponseEntity.ok(student);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<Object> create(@RequestBody @Valid CreateStudentDto student) {
        return studentService.createStudent(student);
    }

}

