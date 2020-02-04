package com.foodDelivery.foodDelivery.repository;

import com.foodDelivery.foodDelivery.entiry.Restaurant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.Optional;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    Optional<Restaurant> findById(Long restaurantId);

    @Query(value = "from Restaurant r left join fetch r.menu m left join fetch m.food",countQuery ="select count(r) from Restaurant r" )
    Page<Restaurant> findAllWithFood(Pageable pageable);
}
