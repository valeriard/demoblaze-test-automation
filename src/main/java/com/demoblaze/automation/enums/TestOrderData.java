package com.demoblaze.automation.enums;

import com.demoblaze.automation.models.OrderData;

public enum TestOrderData {
    VALID_ORDER("John Doe", "New York", "USA", "1234567890", "12", "2025"),
    ANOTHER_USER("Jane Smith", "Los Angeles", "USA", "9876543210", "11", "2026");

    private final String name;
    private final String city;
    private final String country;
    private final String creditCard;
    private final String month;
    private final String year;

    TestOrderData(String name, String city, String country, String creditCard, String month, String year) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.creditCard = creditCard;
        this.month = month;
        this.year = year;
    }

    public OrderData toOrderData() {
        return OrderData.builder()
                .name(this.name)
                .country(this.country)
                .city(this.city)
                .creditCard(this.creditCard)
                .month(this.month)
                .year(this.year)
                .build();
    }
}