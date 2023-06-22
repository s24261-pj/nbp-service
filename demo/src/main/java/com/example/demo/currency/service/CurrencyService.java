package com.example.demo.currency.service;

import com.example.demo.currency.model.CurrencyTable;
import com.example.demo.currency.model.Rate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.OptionalDouble;

@Service
public class CurrencyService {

    String apiUrl = "http://api.nbp.pl/api/";

    private final RestTemplate restTemplate;

    public CurrencyService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public OptionalDouble getCurrencyRatesAverage(String currency, Integer numberOfDays) {
        LocalDate endDate = LocalDate.now();
        LocalDate startDate = endDate.minusDays(numberOfDays);

        CurrencyTable currencyTable = restTemplate
                .getForEntity(this.apiUrl + "exchangerates/rates/A/" + currency + "/" + startDate + "/" + endDate + "/", CurrencyTable.class)
                .getBody();

        return currencyTable.getRates().stream().mapToDouble(Rate::getMid).average();
    }
}
