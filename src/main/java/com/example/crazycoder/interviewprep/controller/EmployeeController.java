package com.example.crazycoder.interviewprep.controller;

import com.example.crazycoder.interviewprep.entity.Employee;
import com.example.crazycoder.interviewprep.services.hibernate.HibernateEmployeeService;
import com.example.crazycoder.interviewprep.services.jdbc.JdbcEmployeeService;
import com.example.crazycoder.interviewprep.services.jpa.JpaEmployeeService;
import com.example.crazycoder.interviewprep.services.springdata.SpringDataEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private JdbcEmployeeService jdbcService;

    @Autowired
    private HibernateEmployeeService hibernateService;

    @Autowired
    private JpaEmployeeService jpaService;

    @Autowired
    private SpringDataEmployeeService springDataService;

    @GetMapping("/jdbc")
    public Employee getEmployeeViaJdbc(@RequestParam String name, @RequestParam String department) {
        return jdbcService.findByNameAndDepartment(name, department);
    }

    @GetMapping("/hibernate")
    public Employee getEmployeeViaHibernate(@RequestParam String name, @RequestParam String department) {
        return hibernateService.findByNameAndDepartment(name, department);
    }

    @GetMapping("/jpa")
    public Employee getEmployeeViaJpa(@RequestParam String name, @RequestParam String department) {
        return jpaService.findByNameAndDepartment(name, department);
    }

    @GetMapping("/spring-data-jpa")
    public Employee getEmployeeViaSpringDataJpa(@RequestParam String name, @RequestParam String department) {
        return springDataService.findByNameAndDepartment(name, department);
    }


}
