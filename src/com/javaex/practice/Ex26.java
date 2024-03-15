package com.javaex.practice;

import java.util.Scanner;

public class Ex26 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("월급을 입력해봐.");
		
		int num = scanner.nextInt();
		
		System.out.println("10년동안의 수입은" + num * 120 + "(만)원이야.");
		
		scanner.close();
		
	}
	
	

}
