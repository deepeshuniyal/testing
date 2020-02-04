package com.foodDelivery.foodDelivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EntityScan("com.foodDelivery.foodDelivery.entiry")
@EnableJpaRepositories("com.foodDelivery.foodDelivery.repository")
@ComponentScan({"com.foodDelivery.foodDelivery.controller","com.foodDelivery.foodDelivery.service","com.foodDelivery.foodDelivery.service.impl"})
public class FoodDeliveryApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(FoodDeliveryApplication.class, args);
	}

}
