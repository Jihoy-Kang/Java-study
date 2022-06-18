package Inflearn.core;

import Inflearn.core.member.Grade;
import Inflearn.core.member.Member;
import Inflearn.core.member.MemberService;
import Inflearn.core.member.MemberServiceImpl;
import Inflearn.core.order.Order;
import Inflearn.core.order.OrderService;
import Inflearn.core.order.OrderServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {
    public static void main(String[] args) {
        //AppConfig appConfig = new AppConfig();
        //MemberService memberService = appConfig.memberService();
        //OrderService orderService = appConfig.orderService();
        //MemberService memberService = new MemberServiceImpl();
        //OrderService orderService = new OrderServiceImpl();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);

        Long memberId = 1L;
        Member member = new Member(memberId,"memberA", Grade.VIP); // 멤버 생성
        memberService.join(member); //멤버 저장

        Order order = orderService.createOrder(memberId, "itemA", 20000); // 아이템 주문
        System.out.println("order = " + order);
        System.out.println("order.calculatePrice() = " + order.calculatePrice());

    }
}
