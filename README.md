
# 餐廳管理系統數據庫結構分析

## 1. 核心業務表

### 1.1 客戶相關
- `customers`: 存儲客戶基本信息
- `reviews`: 客戶對訂單的評價
- `customer_complaints`: 客戶投訴記錄
- `feedback_responses`: 對客戶反饋的回應

### 1.2 餐廳相關
- `restaurants`: 餐廳基本信息
- `menus`: 餐廳菜單
- `food_items`: 具體菜品信息
- `food_categories`: 菜品類別

### 1.3 訂單相關
- `orders`: 訂單主表
- `order_items`: 訂單中的具體項目

### 1.4 外送相關
- `delivery_staff`: 外送員信息
- `delivery_zones`: 外送區域
- `delivery_fees`: 外送費用
- `delivery_status`: 外送訂單狀態追蹤
- `delivery_partners`: 外送合作夥伴
- `delivery_ratings`: 外送服務評價

## 2. 庫存管理

- `inventory_items`: 庫存項目
- `inventory_transactions`: 庫存交易記錄
- `suppliers`: 供應商信息
- `purchase_orders`: 採購訂單
- `purchase_order_items`: 採購訂單項目

## 3. 財務管理

- `income`: 收入記錄
- `expenses`: 支出記錄
- `financial_reports`: 財務報表
- `budgets`: 預算管理
- `tax_records`: 稅務記錄

## 4. 用戶和權限管理

- `users`: 用戶基本信息
- `roles`: 角色定義
- `user_roles`: 用戶-角色關聯
- `permissions`: 權限定義
- `role_permissions`: 角色-權限關聯

## 5. 員工管理

- `employee_schedules`: 員工排班
- `employee_performance`: 員工績效評估

## 6. 其他功能

- `reservations`: 預訂管理
- `tables`: 桌位管理
- `notifications`: 通知系統

## 主要特點

1. **完整的業務覆蓋**：從客戶管理到訂單處理，再到外送和庫存管理，涵蓋了餐廳運營的各個方面。

2. **詳細的財務跟踪**：包括收入、支出、財務報表和稅務記錄，有助於全面的財務管理。

3. **靈活的權限系統**：通過角色和權限的組合，可以精細控制不同用戶的系統訪問權限。

4. **外送系統的完整支持**：包括外送員管理、區域劃分、費用計算和狀態追踪。

5. **庫存和供應鏈管理**：支持庫存追踪、供應商管理和採購流程。

6. **客戶反饋機制**：包括評價、投訴和回應系統，有助於提高服務質量。

7. **員工管理功能**：支持排班和績效評估，有助於人力資源管理。

