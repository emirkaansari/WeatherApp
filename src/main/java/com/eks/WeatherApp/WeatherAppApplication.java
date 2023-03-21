package com.eks.WeatherApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WeatherAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(WeatherAppApplication.class, args);
	}
}