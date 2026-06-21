package com.example.crazycoder.interviewprep.controller;

import com.example.crazycoder.interviewprep.entity.Student;
import com.example.crazycoder.interviewprep.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    public StudentController() {
        System.out.println("StudentController object created at address:" + this.hashCode());
    }

    @GetMapping("/student")
    public int getStudentAddress() {
        Student s1 = studentService.getStudent();
        return s1.hashCode();
    }
}
