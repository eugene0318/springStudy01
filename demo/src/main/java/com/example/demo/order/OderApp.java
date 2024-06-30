package com.example.demo.order;

import com.example.demo.AppConfig;
import com.example.demo.member.Grade;
import com.example.demo.member.Member;
import com.example.demo.member.MemberService;
import com.example.demo.member.MemberServiceIImpl;

public class OderApp {
	
	public static void main(String[] args) {
//		MemberService memberService = new MemberServiceIImpl();
//		OrderService orderService = new OrderServiceImpl();
		AppConfig appConfig = new AppConfig();
		MemberService memberService = appConfig.memberService();
		OrderService orderService = appConfig.orderService();
		
		Long memberId = 1L;
		Member member = new Member(memberId, "memberA", Grade.VIP);
		
		memberService.join(member);
		
		Order order = orderService.createOrder(memberId, "itemA", 10000);
		System.out.println(order);
	}

}
