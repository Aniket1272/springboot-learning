package com.example.crazycoder.interviewprep.repository.springdata;

import com.example.crazycoder.interviewprep.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataEmployeeRepository extends JpaRepository<Employee, Integer> {
    Employee findByNameAndDepartment(String name, String department);
}
