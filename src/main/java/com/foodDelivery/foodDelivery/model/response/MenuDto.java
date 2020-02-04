package com.foodDelivery.foodDelivery.model.response;

import com.foodDelivery.foodDelivery.entiry.Food;

import java.util.List;

public class MenuDto {

    private long menuId;
    private String menuCategoryName;
    List<FoodDto> foodList ;

    public long getMenuId() {
        return menuId;
    }

    public void setMenuId(long menuId) {
        this.menuId = menuId;
    }

    public String getMenuCategoryName() {
        return menuCategoryName;
    }

    public void setMenuCategoryName(String menuCategoryName) {
        this.menuCategoryName = menuCategoryName;
    }

    public List<FoodDto> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<FoodDto> foodList) {
        this.foodList = foodList;
    }
}
