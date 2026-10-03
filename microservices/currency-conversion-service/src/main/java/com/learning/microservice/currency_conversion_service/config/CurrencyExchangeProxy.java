package com.learning.microservice.currency_conversion_service.config;

import com.learning.microservice.currency_conversion_service.model.CurrencyConversionModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "currency-exchange")
public interface CurrencyExchangeProxy {
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyConversionModel retireveExchange(@PathVariable String from, @PathVariable String to);
}
