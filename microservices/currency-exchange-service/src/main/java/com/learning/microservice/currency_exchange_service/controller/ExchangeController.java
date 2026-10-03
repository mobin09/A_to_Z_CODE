package com.learning.microservice.currency_exchange_service.controller;


import com.learning.microservice.currency_exchange_service.model.ExchangeModel;
import com.learning.microservice.currency_exchange_service.repository.CurrencyExchangeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExchangeController {

    @Autowired
    private Environment environment;

    @Autowired
    private CurrencyExchangeRepo currencyExchangeRepo;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ResponseEntity<ExchangeModel> retireveExchange(@PathVariable String from, @PathVariable String to){
        ExchangeModel currency =   currencyExchangeRepo.findByFromAndTo(from, to);

        if(currency == null) throw new RuntimeException("Data Not found:: for " + from + " to " + to);
        String port = environment.getProperty("local.server.port");
        currency.setEnvironment(port);
        return ResponseEntity.status(HttpStatus.OK).body(currency);
    }
}
