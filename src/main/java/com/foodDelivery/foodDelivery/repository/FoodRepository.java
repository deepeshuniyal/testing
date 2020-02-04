package com.foodDelivery.foodDelivery.repository;

import com.foodDelivery.foodDelivery.entiry.Food;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FoodRepository extends JpaRepository<Food, Long> {
    Optional<Food> findById(Long foodId);
}
