package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.discount.DiscountPolicy;
import com.example.demo.discount.FixDiscountPolicy;
import com.example.demo.discount.RateDiscountPolicy;
import com.example.demo.member.MemberRepository;
import com.example.demo.member.MemberService;
import com.example.demo.member.MemberServiceIImpl;
import com.example.demo.member.MemoryMemberRepository;
import com.example.demo.order.OrderService;
import com.example.demo.order.OrderServiceImpl;

@Configuration
public class AppConfig {
	
	@Bean
	public MemberService memberService() {
		return new MemberServiceIImpl(memberRepository());

	}
	@Bean
	public MemberRepository memberRepository() {
		return new MemoryMemberRepository();
	}
	@Bean
	public OrderService orderService() {
		return new OrderServiceImpl(memberRepository(), new FixDiscountPolicy());
	}
	@Bean
	public DiscountPolicy discountPolicy() {
		//return new FixDiscountPolicy();
		return new RateDiscountPolicy();
	}
}
