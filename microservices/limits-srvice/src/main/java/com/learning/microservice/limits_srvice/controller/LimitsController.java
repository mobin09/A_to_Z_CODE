package com.learning.microservice.limits_srvice.controller;

import com.learning.microservice.limits_srvice.configuration.Configuration;
import com.learning.microservice.limits_srvice.model.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration  configuration;

    @GetMapping(path = "/limits")
    public ResponseEntity<Limits> retrieveLimits(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(new Limits(configuration.getMinimum(), configuration.getMaximum()));
    }
}
