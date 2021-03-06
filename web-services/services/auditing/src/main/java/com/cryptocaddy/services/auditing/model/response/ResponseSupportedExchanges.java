package com.cryptocaddy.services.auditing.model.response;

import com.cryptocaddy.xchange.data.model.ParameterList;

import java.util.*;

public class ResponseSupportedExchanges {

    private Map<String, ParameterList> exchangeToParameterMap;

    public ResponseSupportedExchanges() {
        exchangeToParameterMap = new HashMap<>();
    }

    public Map<String, ParameterList> getExchangeToParameterMap() {
        return exchangeToParameterMap;
    }

    public void addSupportedExchange(String exchangeName, ParameterList requiredParameters){
        exchangeToParameterMap.put(exchangeName, requiredParameters);
    }

}
