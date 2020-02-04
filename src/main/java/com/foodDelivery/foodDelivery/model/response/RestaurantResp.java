package com.foodDelivery.foodDelivery.model.response;

import com.foodDelivery.foodDelivery.entiry.Restaurant;

import java.util.List;

public class RestaurantResp {

    private List<RestaurantDto> restaurantDtoList;
    private String status;
    private String message;

    public List<RestaurantDto> getRestaurantDtoList() {
        return restaurantDtoList;
    }

    public void setRestaurantDtoList(List<RestaurantDto> restaurantDtoList) {
        this.restaurantDtoList = restaurantDtoList;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
