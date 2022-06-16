package com.jdnc.jdnc.discount;
import com.jdnc.jdnc.user.User;

public interface DiscountInfo {
    int discount(User user, int price);
}
