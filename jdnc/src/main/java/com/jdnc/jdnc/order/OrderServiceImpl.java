package com.jdnc.jdnc.order;


import com.jdnc.jdnc.discount.CurrentDiscountInfo;
import com.jdnc.jdnc.discount.DiscountInfo;
import com.jdnc.jdnc.user.User;
import com.jdnc.jdnc.user.UserRepository;
import com.jdnc.jdnc.user.UserRepositoryImpl;

public class OrderServiceImpl implements OrderService {

    //private final UserRepository userRepository = new UserRepositoryImpl();
    //private final DiscountInfo discountInfo = new CurrentDiscountInfo();

    private final UserRepository userRepository;
    private final DiscountInfo discountInfo;

    public OrderServiceImpl(UserRepository userRepository, DiscountInfo discountInfo){
        this.userRepository = userRepository;
        this.discountInfo = discountInfo;
    }

    public Order createOrder(Long userId, String itemName, int itemPrice){
        User user = userRepository.findByUserId(userId);
        int discountPrice = discountInfo.discount(user, itemPrice);

        return new Order(userId, itemName, itemPrice, discountPrice);
    }
}
