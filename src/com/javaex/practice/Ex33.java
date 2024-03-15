package com.javaex.practice;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("반지름: ");
		
		double r = scanner.nextDouble();
		
		System.out.println("구의 부피는 " + (r * r * r * 4 / 3 * 3.141592) + "입니다." );
		
		scanner.close();
		

	}

}
