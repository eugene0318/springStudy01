package com.example.demo.member;

import com.example.demo.AppConfig;

public class MemberApp {

	public static void main(String[] args) {
		
		AppConfig appConfig = new AppConfig();
		MemberService memberService = appConfig.memberService();
		//MemberService memberService=new MemberServiceIImpl();
		Member member = new Member(1L, "memberA", Grade.VIP);
		memberService.join(member);
		
		Member findMember= memberService.findMember(1L);
		System.out.println(findMember.getName());
	}
}
