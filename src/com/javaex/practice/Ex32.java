package com.javaex.practice;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("가로: ");
		
		double a = scanner.nextDouble();
		
		System.out.print("세로: ");
		
		double b = scanner.nextDouble();
		
		System.out.println("삼각형의 넗ㅂ이는 " + a * b / 2 + "입니다.");
		
		scanner.close();
		
		
	}

}
