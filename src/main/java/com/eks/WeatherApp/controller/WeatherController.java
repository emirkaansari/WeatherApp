package com.eks.WeatherApp.controller;

import java.io.IOException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.eks.WeatherApp.pojo.Forecasts;
import com.eks.WeatherApp.service.WeatherService;

import jakarta.xml.bind.JAXBException;
@Controller
public class WeatherController {
    @Autowired
  private WeatherService weatherService;
   @GetMapping("/home")
    public String getForecasts(Model model) throws IOException, javax.xml.bind.JAXBException, JAXBException {
      Forecasts forecasts = weatherService.getData();
      model.addAttribute("Forecasts", forecasts);
      return "home";
   }
}
