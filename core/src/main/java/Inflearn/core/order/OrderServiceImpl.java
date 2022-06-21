package Inflearn.core.order;

import Inflearn.core.discount.DiscountPolicy;
import Inflearn.core.discount.FixDiscountPolicy;
import Inflearn.core.discount.RateDiscountPolicy;
import Inflearn.core.member.Member;
import Inflearn.core.member.MemberRepository;
import Inflearn.core.member.MemoryMemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor //final로 잡힌 필드로 생성자 생성 ctrl+f12로 확인가능
public class OrderServiceImpl implements OrderService{


    //private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    //private final DiscountPolicy discountPolicy = new RateDiscountPolicy();
        // 추상클래스 의존 -> DiscountPolicy
        // 구체(구현) 클래스에 의존 -> FixDiscountPolicy && RateDiscountPolicy DIP 위반
        // 정책변경 시 클라이언트 코드 수정이 이루어진다. OCP 위반
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy; // 추상클래스에 만 의존 DIP 준수

      /* public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }*/ //@RequiredArgsConstructor로 생성자가 이미 만들어져있기때문에 이 생성자는 불필요하다.

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
