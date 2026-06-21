package com.example.crazycoder.interviewprep.services.jpa;

import com.example.crazycoder.interviewprep.entity.Employee;
import com.example.crazycoder.interviewprep.repository.jpa.JpaEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JpaEmployeeService {
    @Autowired
    private JpaEmployeeRepository repository;

    public Employee findByNameAndDepartment(String name, String department) {
        return repository.findByNameAndDepartment(name, department);
    }
}
