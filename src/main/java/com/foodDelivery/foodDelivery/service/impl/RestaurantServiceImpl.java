package com.foodDelivery.foodDelivery.service.impl;

import com.foodDelivery.foodDelivery.entiry.Food;
import com.foodDelivery.foodDelivery.entiry.Menu;
import com.foodDelivery.foodDelivery.entiry.Restaurant;
import com.foodDelivery.foodDelivery.model.response.FoodDto;
import com.foodDelivery.foodDelivery.model.response.MenuDto;
import com.foodDelivery.foodDelivery.model.response.RestaurantDto;
import com.foodDelivery.foodDelivery.model.response.RestaurantResp;
import com.foodDelivery.foodDelivery.repository.RestaurantRepository;
import com.foodDelivery.foodDelivery.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    RestaurantRepository restaurantRepository;

    @Override
    public RestaurantResp getAll() {
        Pageable pageable =  PageRequest.of(0,10, Sort.by("name"));
        RestaurantResp restaurantResp = new RestaurantResp();
        Page<Restaurant> restaurantList = restaurantRepository.findAllWithFood(pageable);
        List<RestaurantDto> restaurantDtoList = new ArrayList<>();
        for(Restaurant restaurant : restaurantList) {
            RestaurantDto restaurantDto = new RestaurantDto();
            restaurantDto.setRestaurantId(restaurant.getId());
            restaurantDto.setRestaurantName(restaurant.getName());
            List<MenuDto> menuDtos = new ArrayList<>();
            for(Menu menu : restaurant.getMenu()) {
                MenuDto menuDto = new MenuDto();
                menuDto.setMenuId(menu.getId());
                menuDto.setMenuCategoryName(menu.getMenuCategoryName());
                List<FoodDto> foodDtos = new ArrayList<>();
                for(Food food : menu.getFood()) {
                    FoodDto foodDto = new FoodDto();
                    foodDto.setFoodId(food.getId());
                    foodDto.setFoodName(food.getName());
                    foodDto.setFoodPrice(food.getPrice());
                    foodDtos.add(foodDto);
                }
                menuDto.setFoodList(foodDtos);
                menuDtos.add(menuDto);
            }
            restaurantDto.setMenuDtoList(menuDtos);
            restaurantDtoList.add(restaurantDto);
        }
        restaurantResp.setRestaurantDtoList(restaurantDtoList);
        restaurantResp.setStatus("SUCCESS");
        return restaurantResp;
    }
}
