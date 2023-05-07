package hello.hellospring.service;

import hello.hellospring.domain.Member;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MemberServiceTest {

    MemberService memberService = new MemberService();

    @Test
    void 회원가입() {
        //given
        Member member = new Member();
        member.setName("hello");

        //when
        Long saveId = memberService.join(member);

        //then
        Member findMember = memberService.findOne(saveId).get();    //컨트롤 alt v -> 형태 자동완성
        assertThat(member.getName()).isEqualTo(findMember.getName());


    }

    @Test
    void findMember() {
    }

    @Test
    void findOne() {
    }
}