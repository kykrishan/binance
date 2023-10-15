package com.alphas.binance.controllers;

import com.alphas.binance.MultiThreadDemo;
import com.alphas.binance.types.Time;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Calendar;

@RestController
@RequestMapping(value = "/api",produces="application/json")
public class Mappings {
    @GetMapping(value = "/ping", produces="application/json")
    public Time test() throws IOException {
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create("https://fapi.binance.com/fapi/v1/time")).headers("Content-Type","application/json","Content-Type","application/json",
        "User-Agent", "PostmanRuntime/7.32.3",
        "Accept", "*/*",
"Postman-Token","819e547d-65c8-486d-8c73-c8240f62f7de",
"Accept-Encoding", "gzip, deflate, br").method("GET", HttpRequest.BodyPublishers.noBody()).build();
        HttpResponse<String> response = null;
        Time time = null;
        try{
            response = HttpClient.newHttpClient().send(httpRequest,HttpResponse.BodyHandlers.ofString());
            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson gson = gsonBuilder.create();
             time = gson.fromJson(response.body(), Time.class);
            Calendar calendar = Calendar.getInstance();
            System.out.println(calendar);
             for(int i=0; i<8 ;i++){
                 MultiThreadDemo demo = new MultiThreadDemo();
                 demo.start();
             }
        }catch (Exception e){
            e.printStackTrace();
        }
        return time;
    }


}
