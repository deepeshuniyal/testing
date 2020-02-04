package com.foodDelivery.foodDelivery.controller;

import com.foodDelivery.foodDelivery.entiry.Restaurant;
import com.foodDelivery.foodDelivery.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {


    @Autowired
    RestaurantService restaurantService;

    @GetMapping(value = "/all")
    @ResponseBody
    public ResponseEntity getRestaurantAll() {

        return ResponseEntity.ok(restaurantService.getAll());
    }

    @GetMapping(value = "/{id}")
    @ResponseBody
    public ResponseEntity getRestaurant() {
        return ResponseEntity.ok("hi");
    }
}
