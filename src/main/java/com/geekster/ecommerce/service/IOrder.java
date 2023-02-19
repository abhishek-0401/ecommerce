package com.geekster.ecommerce.service;

import com.geekster.ecommerce.model.Order;

public interface IOrder {
    public Order getOrderByOrderId(Integer orderId);
}
