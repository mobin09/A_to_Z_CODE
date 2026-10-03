package com.learning.microservice.currency_exchange_service.repository;

import com.learning.microservice.currency_exchange_service.model.ExchangeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepo extends JpaRepository<ExchangeModel, Long> {
    public ExchangeModel findByFromAndTo(String from, String to);
}
