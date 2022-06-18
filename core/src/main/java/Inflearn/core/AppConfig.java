package Inflearn.core;

import Inflearn.core.discount.DiscountPolicy;
import Inflearn.core.discount.FixDiscountPolicy;
import Inflearn.core.discount.RateDiscountPolicy;
import Inflearn.core.member.MemberRepository;
import Inflearn.core.member.MemberService;
import Inflearn.core.member.MemberServiceImpl;
import Inflearn.core.member.MemoryMemberRepository;
import Inflearn.core.order.OrderService;
import Inflearn.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MemberService memberService(){

        return new MemberServiceImpl(memberRepository()); // 생성자 주입
    }

    @Bean
    public MemberRepository memberRepository() {

        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService(){

        return new OrderServiceImpl(memberRepository(), discountPolicy());// 생성자 주입
    }

    @Bean
    public DiscountPolicy discountPolicy() {

        return new FixDiscountPolicy();
    }
}
