package com.javaex.practice;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = 500, b = 100, c = 50, d = 10;
		
		int q, w, e, r;
		
		String ramen = "원 개수: ";
		
		System.out.print(a + ramen);
		
		q = scanner.nextInt();
		
		System.out.print(b + ramen);
		
		w = scanner.nextInt();
		
		System.out.print(c + ramen);
		
		e = scanner.nextInt();
		
		System.out.print(d + ramen);

		r = scanner.nextInt();
		
		System.out.print("동전의 총합은 " + (q * 500 + w * 100 + e * 50 + r * 10) + "원 입니다.");
		
		scanner.close();
	}

}
