package com.jdnc.jdnc;
import com.jdnc.jdnc.discount.DiscountInfo;
import com.jdnc.jdnc.discount.RateDiscountInfo;
import com.jdnc.jdnc.order.OrderService;
import com.jdnc.jdnc.order.OrderServiceImpl;
import com.jdnc.jdnc.discount.CurrentDiscountInfo;
import com.jdnc.jdnc.user.UserRepository;
import com.jdnc.jdnc.user.UserRepositoryImpl;
import com.jdnc.jdnc.user.UserService;
import com.jdnc.jdnc.user.UserServiceImpl;

public class AppConfig {
    public UserService userService(){
        return new UserServiceImpl(userRepository());
    }

    public UserRepository userRepository(){
        return new UserRepositoryImpl();
    }
    public OrderService orderService(){
        return new OrderServiceImpl(userRepository(), discountInfo());
    }
    public DiscountInfo discountInfo(){
        //return new CurrentDiscountInfo();
        return  new RateDiscountInfo();
    }
}
