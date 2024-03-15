package com.javaex.practice;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("마일을 입력하세요:");

		double num = scanner.nextDouble();
		
		double num2 = (num * 1.609);
		
		System.out.println(num + "마일은" + num2 + "km입니다.");
		
		scanner.close();
		
	}

}
