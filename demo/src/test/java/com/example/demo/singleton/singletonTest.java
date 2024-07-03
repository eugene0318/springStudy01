package com.example.demo.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.demo.AppConfig;
import com.example.demo.member.MemberService;

public class singletonTest {

	@Test
	@DisplayName("스프링 없는 순수한 DI 컨테이너")
	void pureContainer() {
		AppConfig appConfig = new AppConfig();
		MemberService memberService1 = appConfig.memberService();
		MemberService memberService2 =appConfig.memberService();
		
		System.out.println(memberService1);
		System.out.println(memberService2);
		
		Assertions.assertThat(memberService1).isNotSameAs(memberService2);
	}
}
