package com.company.shopwithcuba.service;

import com.company.shopwithcuba.entity.OrderItem;

import java.util.Set;

public interface OrderItemService {
    String NAME = "shopwithcuba_OrderItemService";

    Set<OrderItem> loadOrderItemsByOrderNumber(Integer orderNumber);
}