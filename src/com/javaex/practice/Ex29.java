package com.javaex.practice;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("너비를 입력하세요: ");
		
		double a = scanner.nextDouble();
		
		System.out.print("높이를 입력하세요: ");
		
		double b = scanner.nextDouble();
		
		System.out.println("사각형의 둘레는 " + (2 * a + 2 * b));

		System.out.println("사각형의 넓이는 " + (a * b));
		
		scanner.close();
		
	}

}
