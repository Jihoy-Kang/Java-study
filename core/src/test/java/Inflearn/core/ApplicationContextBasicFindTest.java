package Inflearn.core;

import Inflearn.core.member.MemberService;
import Inflearn.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class ApplicationContextBasicFindTest {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("빈 이름으로 조회")
    void findBeanByName(){
        MemberService memberService = ac.getBean("memberService", MemberService.class);
        assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
        /*System.out.println("memberService = " + memberService);
        System.out.println("memberService.getClass() = " + memberService.getClass());*/
    }

    @Test
    @DisplayName("이름없이 타입으로 조회")
    void findBeanByType(){
        MemberService memberService = ac.getBean(MemberService.class);
        assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
        /*System.out.println("memberService = " + memberService);
        System.out.println("memberService.getClass() = " + memberService.getClass());*/
    }

    //조회가 안될때  NoSuchBeanDefinitionExcetion 발생
    @Test
    @DisplayName("조회가 안될때")
    void findBeanByNameX(){
        assertThrows(NoSuchBeanDefinitionException.class,
                () -> ac.getBean("xxx",MemberService.class));
    }

    /*@Test
    @DisplayName("구현체 타입 조회")
    void findBeanByName2(){
        MemberService memberService = ac.getBean("memberService", MemberServiceImpl.class);
        assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
        *//*System.out.println("memberService = " + memberService);
        System.out.println("memberService.getClass() = " + memberService.getClass());*//*
    }*/ //구현체 타입 조회는 가능하나 사용하지 않음

}
