package com.example.demo.member;

public class MemberApp {

	public static void main(String[] args) {
		MemberService memberService=new MemberServiceIImpl();
		Member member = new Member(1L, "memberA", Grade.VIP);
		memberService.join(member);
		
		Member findMember= memberService.findMember(1L);
		System.out.println(findMember.getName());
	}
}
