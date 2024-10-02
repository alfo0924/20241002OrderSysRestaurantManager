package org.example._20241002ordersysrestaurantmanager.repository;

import org.example._20241002ordersysrestaurantmanager.entity.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {
}