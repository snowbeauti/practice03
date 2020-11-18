package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int n = num/5;
		int s = 0;
		sc.close();
		
		for(int a=1; a <= num/5; a++) {
			s = s + (a * 5);
		}
		
		System.out.println("5의 배수의 개수 " + n);
		System.out.println("5의 배수의 합 " + s);
	}
	
}
