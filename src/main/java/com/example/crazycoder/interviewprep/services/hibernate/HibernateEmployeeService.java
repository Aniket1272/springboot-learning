package com.example.crazycoder.interviewprep.services.hibernate;

import com.example.crazycoder.interviewprep.entity.Employee;
import com.example.crazycoder.interviewprep.repository.hibernate.HibernateEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HibernateEmployeeService {

    @Autowired
    private HibernateEmployeeRepository repository;

    public Employee findByNameAndDepartment(String name, String department) {
        return repository.findByNameAndDepartment(name, department);
    }
}
