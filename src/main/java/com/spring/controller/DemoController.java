package com.spring.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class DemoController {

    @GetMapping("/protected")
    @PreAuthorize("hasRole('ROLE_USER')") // Or any role you choose
    public String getProtectedMessage() {
        return "This is a protected message. Your JWT is working!";
    }
}
