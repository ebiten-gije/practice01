package com.javaex.practice;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("반지름을 입력하세요: ");
		
		double r = scanner.nextDouble();
		
		double PI = 3.14;
		
		System.out.println("원의 넓이은 " + r * r * PI + "일껄요?");
		
		scanner.close();
		
		
	}

}
