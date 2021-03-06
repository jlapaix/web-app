package com.cryptocaddy.fiat.client.entity;

public class FiatCoin {
    private String exchange;
    private String crypto_currency;
    private String fiat_currency;
    //TODO: change timestamp and value to more appropriate datatypes
    private String timestamp;
    private String value;

    public FiatCoin() {}

    //TODO: change timestamp and value to proper data types
    public FiatCoin(String exchange, String crypto_currency, String fiat_currency, String timestamp, String value) {
        this.exchange = exchange;
        this.crypto_currency = crypto_currency;
        this.fiat_currency = fiat_currency;
        this.timestamp = timestamp;
        this.value = value;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getCrypto_currency() {
        return crypto_currency;
    }

    public void setCrypto_currency(String crypto_currency) {
        this.crypto_currency = crypto_currency;
    }

    public String getFiat_currency() {
        return fiat_currency;
    }

    public void setFiat_currency(String fiat_currency) {
        this.fiat_currency = fiat_currency;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
