package com.eks.WeatherApp.utils;

import java.io.FileWriter;
import java.io.IOException;

import org.springframework.stereotype.Component;

import com.opencsv.CSVWriter;

import com.eks.WeatherApp.pojo.Forecasts;

@Component
public class AvrgCalculator {

    // This method calculates and prints the average maximum and minimum
    // temperatures for a given forecast
    public void printAvrgTemp(Forecasts forecasts) {

        // Initialize variables for calculating average temperatures
        double maxAvrg = 0, minAvrg = 0;
        int maxSum = 0, minSum = 0;

        // Calculate sum of maximum and minimum temperatures for all places in the
        // forecast
        for (int i = 0; i < forecasts.getForecast().get(0).getDay().getPlace().size(); i++) {
            maxSum += forecasts.getForecast().get(0).getDay().getPlace().get(i).getTempmax();
            minSum += forecasts.getForecast().get(0).getNight().getPlace().get(i).getTempmin();
        }

        // Calculate average maximum and minimum temperatures
        maxAvrg = maxSum / forecasts.getForecast().get(0).getDay().getPlace().size();
        minAvrg = minSum / forecasts.getForecast().get(0).getDay().getPlace().size();
        try {
            CSVWriter writer = new CSVWriter(new FileWriter("temperatures.csv"));

            // Write the header row
            writer.writeNext(new String[] { "Maximum Temperature Average", "Minimum Temperature Average" });

            // Write the data row
            writer.writeNext(new String[] { String.valueOf(maxAvrg), String.valueOf(minAvrg) });

            writer.close();
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public AvrgCalculator() {
    }
}
