package com.example.crazycoder.interviewprep.services;

import com.example.crazycoder.interviewprep.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private Student student;

    public StudentService() {
        System.out.println("StudentService object created at address:" + this.hashCode());
    }

    public Student getStudent() {
        return student;
    }
}
