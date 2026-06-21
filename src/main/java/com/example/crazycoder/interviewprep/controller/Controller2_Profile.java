package com.example.crazycoder.interviewprep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2_Profile {

    @Autowired
    TwoFAProperties twoFAProperties;

    //@Value("${feature.2fa.enabled}")
    private Boolean is2fa;

    //@Value("${feature.2fa.provider}")
    private String provider;

    @GetMapping("/2fa")
    public Boolean is2faEnable() {
        return twoFAProperties.getEnabled();
    }

    @GetMapping("/2fa/provider")
    public String get2faProvider() {
        return twoFAProperties.getProvider();
    }


}
