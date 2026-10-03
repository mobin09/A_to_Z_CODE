package com.learning.microservice.currency_exchange_service.controller;

import io.github.resilience4j.retry.RetryRegistry;
import io.github.resilience4j.retry.annotation.Retry;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class CircuitBreakerController {
    // Always check the documentation for this
    private final Logger logger = LoggerFactory.getLogger(CircuitBreakerController.class);

    @GetMapping("sample-api")
    @Retry(name="sample-api", fallbackMethod = "fallBackResponse")
    public ResponseEntity<String> sampleAPi(){
        // making failure logic, http:localhost:8080/some-dummy-url  this is dummy URL not exists
        logger.info("This is hit by default times");
       ResponseEntity<String> response= new RestTemplate().getForEntity("http:localhost:8080/some-dummy-url", String.class);
        return ResponseEntity.status(HttpStatus.OK).body(response.getBody());
    }

    public ResponseEntity<String> fallBackResponse(Exception e){
        logger.info("FallBack Executed");
        return ResponseEntity.ok("Fallback Response");
    }

}
