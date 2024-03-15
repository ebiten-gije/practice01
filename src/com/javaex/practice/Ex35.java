package com.javaex.practice;

public class Ex35 {

	public static void main(String[] args) {
	
		//1년 동안 빛이 진행한 거리
		//빛의 속도는 300_000km/s로 계산
		
		long hikari = 300000;
		
		long sec = 60, min = 60, h = 24, hi = 365;
		
		System.out.print(hikari * sec * min * h * hi + "km"); 
		
	}

}
