package org.example._20241002ordersysrestaurantmanager.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "menus")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String menuName;

    @Column
    private String menuDescribe;

    @Column
    private String menuStatus;

    @Column
    private String menuImage;

    // 其他字段和關係映射
}