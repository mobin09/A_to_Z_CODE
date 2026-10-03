package com.learning.microservice.currency_conversion_service.model;


import java.math.BigDecimal;

public class CurrencyConversionModel {
    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
    private Integer quantity;
    private Double totalCalculatedAmount;
    private String environment;

    public CurrencyConversionModel(Long id, String from, String to, BigDecimal conversionMultiple, Integer quantity, Double totalCalculatedAmount, String environment) {
        this.environment = environment;
        this.totalCalculatedAmount = totalCalculatedAmount;
        this.quantity = quantity;
        this.conversionMultiple = conversionMultiple;
        this.to = to;
        this.from = from;
        this.id = id;
    }

    public CurrencyConversionModel(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotalCalculatedAmount() {
        return totalCalculatedAmount;
    }

    public void setTotalCalculatedAmount(Double totalCalculatedAmount) {
        this.totalCalculatedAmount = totalCalculatedAmount;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
