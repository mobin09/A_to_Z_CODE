package com.learning.microservice.currency_conversion_service.service;

import com.learning.microservice.currency_conversion_service.config.CurrencyExchangeProxy;
import com.learning.microservice.currency_conversion_service.model.CurrencyConversionModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;

@Service
public class CurrencyConversionService {

    @Autowired
    CurrencyExchangeProxy currencyExchangeProxy;

     public CurrencyConversionModel getCurrency(String from, String to, Integer q){

         // Using by RestTemplate
         HashMap<String, String> uriVariable = new HashMap<>();
         uriVariable.put("from", from);
         uriVariable.put("to", to);

         ResponseEntity<CurrencyConversionModel> responseEntity  = new RestTemplate().getForEntity("http://127.0.0.1:8000/currency-exchange/from/{from}/to/{to}",
                    CurrencyConversionModel.class, uriVariable);

         CurrencyConversionModel responseBody  =  responseEntity.getBody();
         responseBody.setQuantity(q);

         BigDecimal total = responseBody.getConversionMultiple().multiply(BigDecimal.valueOf(q));

         responseBody.setTotalCalculatedAmount(Double.valueOf(String.valueOf(total)));

         return responseBody;
     }

    public CurrencyConversionModel getCurrencyUsingFeign(String from, String to, Integer q){
        // Using by Feign
        CurrencyConversionModel response = currencyExchangeProxy.retireveExchange(from, to);
        response.setQuantity(q);
        BigDecimal total = response.getConversionMultiple().multiply(BigDecimal.valueOf(q));
        response.setTotalCalculatedAmount(Double.valueOf(String.valueOf(total)));
        return response;
    }





}
