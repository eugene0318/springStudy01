package com.example.demo.singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

class StateFulServiceTest {

	@Test
	void statefulServiceSingleton() {
		ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
		StateFulService stateFulService1 = ac.getBean(StateFulService.class);
		StateFulService stateFulService2 = ac.getBean(StateFulService.class);

		int userAPrice = stateFulService1.order("userA", 10000);
		int userBPrice = stateFulService2.order("userB", 20000);
		System.out.println(userAPrice);

		Assertions.assertThat(userAPrice).isEqualTo(20000);
	}

	static class TestConfig {
		@Bean
		public StateFulService stateFulService() {
			return new StateFulService();
		}
	}

}
