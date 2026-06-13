package com.example.crazycoder.interviewprep.controller;

import com.example.crazycoder.interviewprep.model.Employee;
import com.example.crazycoder.interviewprep.UserEntity;
import com.example.crazycoder.interviewprep.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/insert")
    public void insert() {
        userRepository.save(new UserEntity(1l,"Aniket"));
    }

    @PostMapping("/insert")
    public UserEntity saveUser(@RequestBody UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    List<Employee> employees = new ArrayList<>();

    @GetMapping("/message")
    public String getMessage() {
        return "This is my first API";
    }

    @GetMapping("/employee")
    public List<Employee> getEmployee() {
        return employees;
    }

    @PostMapping("/employee")
    public void saveEmployee(@RequestBody Employee employee) {
        employees.add(employee);
    }

    @DeleteMapping("/employee")
    public void removeEmployee(@RequestParam int id) {
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).getId()==id) {
                employees.remove(i);
            }
        }
    }

    @PutMapping("/employee/{id}")
    public void updateEmployee(@PathVariable int id, @RequestBody Employee employee){
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).getId()==id) {
                employees.set(i, employee);
            }
        }
    }
}
