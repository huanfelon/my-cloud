package com.example.cloud.seataorderservice.service;


import com.example.cloud.seataorderservice.domain.Order;

public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);
}
