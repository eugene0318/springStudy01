package com.example.demo.xml;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.example.demo.member.MemberService;

public class XmlAppContext {

	@Test
	void xmlAppContext() {
		ApplicationContext ac = new GenericXmlApplicationContext("appConfig.xml");
		MemberService memberService = ac.getBean("memberServive", MemberService.class);
		org.assertj.core.api.Assertions.assertThat(memberService).isInstanceOf(MemberService.class);
		
	}
}
