package com.learning.microservice.currency_conversion_service.controller;

import com.learning.microservice.currency_conversion_service.model.CurrencyConversionModel;
import com.learning.microservice.currency_conversion_service.service.CurrencyConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {

    @Autowired
    CurrencyConversionService currencyConversionService;

    @GetMapping(path = "currency-conversion/from/{from}/to/{to}/quantity/{q}")
    public ResponseEntity<CurrencyConversionModel> getCurrencyConversion(
            @PathVariable String from, @PathVariable String to, @PathVariable Integer q)
    {

        //CurrencyConversionModel response =  currencyConversionService.getCurrency(from, to, q);
        CurrencyConversionModel response =  currencyConversionService.getCurrencyUsingFeign(from, to,q);
        return  ResponseEntity.status(HttpStatus.OK).body(response);
    }

}
