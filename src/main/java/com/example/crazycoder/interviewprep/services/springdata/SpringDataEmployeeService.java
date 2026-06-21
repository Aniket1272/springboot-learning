package com.example.crazycoder.interviewprep.services.springdata;

import com.example.crazycoder.interviewprep.entity.Employee;
import com.example.crazycoder.interviewprep.repository.springdata.SpringDataEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpringDataEmployeeService {
    @Autowired
    private SpringDataEmployeeRepository repository;

    public Employee findByNameAndDepartment(String name, String department) {
        return repository.findByNameAndDepartment(name, department);
    }
}
