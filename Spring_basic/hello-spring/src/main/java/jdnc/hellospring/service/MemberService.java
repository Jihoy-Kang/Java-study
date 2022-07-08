package jdnc.hellospring.service;

import jdnc.hellospring.domain.Member;
import jdnc.hellospring.repository.MemberRepository;
import jdnc.hellospring.repository.MemoryMemberRepository;

import java.util.List;
import java.util.Optional;

public class MemberService {


    private final MemberRepository memberRepository;
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Long join(Member member){

        validateDuplicateMember(member);//이름중복확인
        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m->{
                    throw new IllegalStateException("이미 존재하는 회원");
                }); //Optional생략 가능능
    }

    public List<Member> findMembers(){ //전체회원 조회
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId){ //회원 조회
        return memberRepository.findById(memberId);
    }
}
