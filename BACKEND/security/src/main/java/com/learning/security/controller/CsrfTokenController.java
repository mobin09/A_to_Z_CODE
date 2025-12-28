package com.learning.security.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CsrfTokenController {

    @GetMapping("csrf-token")
    public CsrfToken retirveCsrfToken(HttpServletRequest request){
       return (CsrfToken) request.getAttribute("_csrf");
    }
}
