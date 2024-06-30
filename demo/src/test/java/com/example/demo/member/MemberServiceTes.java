package com.example.demo.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTes {
	
	MemberService memberService = new MemberServiceIImpl();
	@Test
	void join() {
		//giiven
		Member member = new Member(1L, "memberA", Grade.VIP);
		//when
		memberService.join(member);
		Member findmnMember = memberService.findMember(1L);
	
		//then
		Assertions.assertThat(member).isEqualTo(findmnMember);
	}
}
