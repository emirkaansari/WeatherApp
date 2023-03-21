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
    // This method retrieves weather forecast data from an external API every hour
    @Scheduled(fixedRate = 3600000)
    public Forecasts getData () throws JAXBException, IOException {
        // Construct URL for weather forecast data
        URL url = new URL("https://www.ilmateenistus.ee/ilma_andmed/xml/forecast.php?lang=eng");

        // Initialize JAXB unmarshaller for XML parsing
        JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        // Parse XML response from API and return forecast data object
        return (Forecasts) jaxbUnmarshaller.unmarshal(url);
    }
    
}