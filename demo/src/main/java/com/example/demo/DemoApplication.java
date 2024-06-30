package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		System.out.println("hello");
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			System.out.println(sc.nextInt());
		}
	}

}
