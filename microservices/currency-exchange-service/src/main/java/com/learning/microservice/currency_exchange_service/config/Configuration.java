package com.learning.microservice.currency_exchange_service.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
//@ConfigurationProperties("currency-exchange")
public class Configuration {
    private int inr;
    private int usd;

    public int getInr(){
        return inr;
    }
    public void setInr(int inr){
        this.inr = inr;
    }
    public int getUsd(){
        return usd;
    }
    public void setUsd(int usd){
        this.usd = usd;
    }

}
