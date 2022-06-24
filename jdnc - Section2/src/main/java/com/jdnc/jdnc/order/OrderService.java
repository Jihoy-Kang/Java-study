package com.jdnc.jdnc.order;

public interface OrderService {
    Order createOrder(Long userId, String itemName, int itemPrice);
}
