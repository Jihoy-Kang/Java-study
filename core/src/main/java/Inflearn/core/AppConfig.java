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

public class AppConfig {

    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository()); // 생성자 주입
    }

    private MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());// 생성자 주입
    }

    private DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }
}
