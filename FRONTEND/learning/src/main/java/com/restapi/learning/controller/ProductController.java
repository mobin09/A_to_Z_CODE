package com.restapi.learning.controller;

import com.restapi.learning.model.Product;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/get-product")
    public ResponseEntity<Product> getProductDetails(){
       Product product = new Product("Pen", "This pen is blue in color", "Education");
        HttpHeaders headers = new HttpHeaders();
        headers.add("Product", "Education");
       return ResponseEntity.status(HttpStatus.OK).headers(headers).body(product);
   }

}
