package org.example._20241002ordersysrestaurantmanager.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "food_items")
public class FoodItem {
    @Id
    @Column(name = "items_id")
    private String itemsId;

    @Column(name = "menu_id")
    private String menuId;  // 保持為 String 類型

    @Column(name = "food_name")
    private String foodName;

    @Column(name = "food_price")
    private BigDecimal foodPrice;

    @Column(name = "food_status")
    private String foodStatus;

    @Column(name = "food_image")
    private String foodImage;

    @Column(name = "food_category")
    private String foodCategory;

    // 其他字段、getter 和 setter
}