package com.jdnc.jdnc.order;
import com.jdnc.jdnc.AppConfig;
import com.jdnc.jdnc.user.User;
import com.jdnc.jdnc.user.UserGrade;
import com.jdnc.jdnc.discount.CurrentDiscountInfo;
import com.jdnc.jdnc.discount.RateDiscountInfo;
import com.jdnc.jdnc.user.UserService;

public class OrderApp {
    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();
        UserService userService = appConfig.userService();
        OrderService orderService = appConfig.orderService();

        Long userId = 0L;
        User user = new User(userId, "kimlucky", UserGrade.GRADE_1);
        userService.signup(user);

        Order order = orderService.createOrder(userId, "coffee", 5000);

        System.out.println("order = " + order);
        /*RateDiscountInfo discountInfo = new RateDiscountInfo();

        User user = new User(0L, "kimcoding", UserGrade.GRADE_1);
        int discountedPrice = discountInfo.discount(user, 5000);

        if (discountedPrice == 250) {
            System.out.println("Discounted");
            System.out.println("5000 ->" + discountedPrice);
        }

        user = new User(0L, "leejava", UserGrade.GRADE_2);
        discountedPrice = discountInfo.discount(user, 5000);

        if (discountedPrice == 500) {
            System.out.println("Discounted");
            System.out.println("5000 ->" + discountedPrice);
        }*/
    }
}
