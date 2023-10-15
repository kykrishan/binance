package com.alphas.binance.utils;

import java.util.HashMap;
import java.util.Map;

public class Connector {
    private Map<String,String> header = new HashMap<>();

    public void addedHeaders(){
        header.put("X-MBX-APIKEY","");
    }
}
