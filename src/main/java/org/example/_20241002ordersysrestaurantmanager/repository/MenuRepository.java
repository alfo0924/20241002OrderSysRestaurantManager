package org.example._20241002ordersysrestaurantmanager.repository;

import org.example._20241002ordersysrestaurantmanager.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Long> {
}