package com.eks.WeatherApp.service;


import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.eks.WeatherApp.pojo.Forecasts;
import com.eks.WeatherApp.pojo.ObjectFactory;

import java.io.IOException;
import java.net.URL;
@Service
public class WeatherService {
    @Scheduled(fixedRate = 3600000)
    public Forecasts getData () throws JAXBException, IOException {
        System.out.println("Scheduled task running...");
        URL url = new URL("https://www.ilmateenistus.ee/ilma_andmed/xml/forecast.php?lang=eng");

        JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        return (Forecasts) jaxbUnmarshaller.unmarshal(url);
    }
    
}