package jdnc.jdbcPractice.service;

import jdnc.jdbcPractice.domain.Member;
import jdnc.jdbcPractice.repository.MemberRepository;
import jdnc.jdbcPractice.repository.MemberRepositoryV3;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
/*
예외누수 문제 해결
SQLException 제거
MemberRepository 인터페이스 의존
*/


@Slf4j
public class MemberServiceV4 {



    private final MemberRepository memberRepository;

    public MemberServiceV4(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Transactional
    public void accountTransfer(String fromId, String toId, int money) {
                //비지니스 로직 실행
            bizLogic(fromId, toId, money);
    }

    private void bizLogic(String fromId, String toId, int money){
        Member fromMember = memberRepository.findById(fromId);
        Member toMember = memberRepository.findById(toId);

        memberRepository.update(fromId, fromMember.getMoney() - money);
        validation(toMember);
        memberRepository.update(toId, toMember.getMoney() + money);
    }

    private void validation(Member toMember) {
        if(toMember.getMemberId().equals("ex")){
            throw new IllegalStateException("이제중 예외발생");
        }
    }

}
