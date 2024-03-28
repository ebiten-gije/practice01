package com.javaex.practice;

import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("전체 금액을 입력해주세요: ");
		
		int a = scanner.nextInt();
		
		System.out.println(a / 1000 * 1000);
		
		scanner.close();

	}

}
