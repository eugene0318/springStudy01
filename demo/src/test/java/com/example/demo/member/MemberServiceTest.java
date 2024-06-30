package com.example.demo.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.demo.AppConfig;

public class MemberServiceTest {
	
	
	MemberService memberService;
	
	@BeforeEach
	public void beforeEach() {
		AppConfig appConfig = new AppConfig();
		memberService = appConfig.memberService();
	}
	
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
