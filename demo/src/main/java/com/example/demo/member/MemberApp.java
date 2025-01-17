package com.example.demo.member;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.AppConfig;

public class MemberApp {

	public static void main(String[] args) {

//		AppConfig appConfig = new AppConfig();
//		MemberService memberService = appConfig.memberService();
		// MemberService memberService=new MemberServiceIImpl();

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
		Member member = new Member(1L, "memberA", Grade.VIP);
		memberService.join(member);

		Member findMember = memberService.findMember(1L);
		System.out.println(findMember.getName());
	}
}
