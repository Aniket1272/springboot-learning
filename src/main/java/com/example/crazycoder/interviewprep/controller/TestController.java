package com.example.crazycoder.interviewprep.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api1")
    public String method1() {
        int a = 1/0;
        return "API 1";
    }

    @GetMapping("/api2")
    public String method2() {
        String s1 = null;
        int a = s1.length();
        return "API 2";
    }

    @GetMapping("/api3")
    public String method3() throws TestException {
            throw new TestException("This is a custom exception");
    }
}
