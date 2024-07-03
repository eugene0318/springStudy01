package com.example.demo.singleton;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SingletonService {
	
	private static final SingletonService instance = new SingletonService();
	public static SingletonService getInstance() {
		return instance;
	}
	
	
	//생성자를 private로 선언하여 외부에서 new 키워드로 객체 생성을 못하게 막는다
	private SingletonService() {
		
	}
	
	public void logic() {
		System.out.println("singleton logic");
	}
	
	@Test
	@DisplayName("싱글톤 패턴을 적용한 객체 사용")
	void singletonServiceTest() {
		SingletonService singletoneService1 = SingletonService.getInstance();
		SingletonService singletoneService2 = SingletonService.getInstance();
		
		System.out.println(singletoneService1);
		System.out.println(singletoneService2);
		
		assertThat(singletoneService1).isSameAs(singletoneService2);
		
	}
}
