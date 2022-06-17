package Inflearn.core.discount;

import Inflearn.core.member.Member;

public interface DiscountPolicy {

    // return은 할인 대상금액
    int discount(Member member, int price);
}
