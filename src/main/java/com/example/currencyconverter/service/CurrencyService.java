package com.example.currencyconverter.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.currencyconverter.model.CurrencyResponse;

@Service
public class CurrencyService {

    private final String API_URL = "https://open.er-api.com/v6/latest/";

    public double convertCurrency(String from, String to, double amount) {

        RestTemplate restTemplate = new RestTemplate();
        String url = API_URL + from;

        CurrencyResponse response =
                restTemplate.getForObject(url, CurrencyResponse.class);

        if (response == null || response.rates == null) {
            throw new RuntimeException("Error fetching rates");
        }

        Double rate = response.rates.get(to);

        if (rate == null) {
            throw new RuntimeException("Invalid currency");
        }

        return amount * rate;
    }
}