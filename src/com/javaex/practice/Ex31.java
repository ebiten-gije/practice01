package com.javaex.practice;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("상품의 가격은? ");
		
		double price = scanner.nextDouble();
		
		System.out.print("받은 돈은? ");
		
		double mon = scanner.nextDouble();
		
		System.out.println("---------------------------------");
		
		System.out.println("상품 가격: " + price + "\n받은 돈: " + mon + "\n부가세: " + (price / 10)
				 + "\n잔액: " + (mon - price));
		
		scanner.close();
	}

}
