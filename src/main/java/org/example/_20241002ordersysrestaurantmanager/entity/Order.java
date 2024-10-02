//package org.example._20241002ordersysrestaurantmanager.entity;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//import java.math.BigDecimal;
//import java.time.LocalDate;
//
//@Data
//@Entity
//@Table(name = "orders")
//public class Order {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "customer_id")
//    private Customer customer;
//
//    @ManyToOne
//    @JoinColumn(name = "restaurant_id")
//    private Restaurant restaurant;
//
//    @Column(name = "order_date")
//    private LocalDate orderDate;
//
//    @Column(name = "order_price")
//    private BigDecimal orderPrice;
//
//    @Column(name = "order_status")
//    private String status;
//}