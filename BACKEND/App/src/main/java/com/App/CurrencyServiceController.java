package com.App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyServiceController {
    @Autowired
	private CurrencyServiceConfiguration config;
   
   @RequestMapping("/currency-service") 
   public CurrencyServiceConfiguration getConfig() {
	   return config;
   }
}
