package com.example.crazycoder.interviewprep.services.jdbc;

import com.example.crazycoder.interviewprep.entity.Employee;
import com.example.crazycoder.interviewprep.repository.jdbc.JdbcEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JdbcEmployeeService {

    @Autowired
    private JdbcEmployeeRepository repository;

    public Employee findByNameAndDepartment(String name, String department) {
        return repository.findByNameAndDepartment(name, department);
    }
}
