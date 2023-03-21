package com.eks.WeatherApp.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.eks.WeatherApp.pojo.Forecasts;
import com.eks.WeatherApp.service.WeatherService;
import com.eks.WeatherApp.utils.AvrgCalculator;

import jakarta.xml.bind.JAXBException;

@Controller
public class WeatherController {
  @Autowired
  private WeatherService weatherService;
  @Autowired
  private AvrgCalculator avrgCalculator;

  @GetMapping("/home")
  public String getForecasts(Model model) throws IOException, javax.xml.bind.JAXBException, JAXBException {
    // Map a GET request to the "/home" URL to this method.
    // This method retrieves forecast data and adds it to the model for use in the
    // view.
    // It also throws exceptions if there are any issues with retrieving the data.

    Forecasts forecasts = weatherService.getData();
    // Retrieve forecast data using the weatherService.getData() method and store it
    // in the Forecasts object.

    model.addAttribute("Forecasts", forecasts);
    // Add the Forecasts object to the model with the key "Forecasts".
    // This makes it available for use in the view.
    avrgCalculator.printAvrgTemp(forecasts);
    // Calculate and print the average temperature of the forecast data using the
    // avrgCalculator.printAvrgTemp() method.
    return "home";
  }
}
