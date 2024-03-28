package com.javaex.practice;

import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		int a, b;
		
		System.out.print("전체 연필 갯수를 입력해주세요: ");
		
		a = scanner.nextInt();
		
		System.out.print("전체 인원수를 입력해주세요: ");
		
		b = scanner.nextInt();

		System.out.print("1인당 연필의 갯수는 " + a / b + "개입니다. \n연필의 나머지 갯수는 " + a % b + "개입니다.");
		
		scanner.close();
	}

}
