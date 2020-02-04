package com.foodDelivery.foodDelivery.repository;

import com.foodDelivery.foodDelivery.entiry.Food;
import com.foodDelivery.foodDelivery.entiry.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MenuRepository extends JpaRepository<Menu, Long> {

    Optional<Menu> findById(Long menuId);
}
