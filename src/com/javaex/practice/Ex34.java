package com.javaex.practice;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("화씨: ");
		
		double f = scanner.nextDouble();

		System.out.println("화씨 " + f + " 의 섭씨 온도는 " + 5 * (f - 32) / 9 + "입니다.");
		
		scanner.close();
		
	}

}
