package com.demo.testapplication.AOP02;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    EmployeeUtil employeeUtil;
    @Autowired
    public EmployeeController(EmployeeUtil employeeUtil){
        this.employeeUtil = employeeUtil;
    }
    public EmployeeController(){

    }
    @GetMapping("/fetch-employee")
    public ResponseEntity<String> getEmployeeDetails(){
        employeeUtil.fetchEmployee();
        return ResponseEntity.ok("Employee Fetched");

    }

}
