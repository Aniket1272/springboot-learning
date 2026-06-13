package com.example.crazycoder.interviewprep.model;

import org.springframework.stereotype.Component;

@Component
public class Student {
    public Student() {
        System.out.println("Student object created at address:" + this.hashCode());
    }
}
