package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, num;
		int x = 1;
		
		System.out.println("숫자를 입력하세요.");
		System.out.print("합계: ");
		num = sc.nextInt();
		sc.close();	
		
		
		for(a = num; a >1; a--) {
			x = x + a;		
		}
			System.out.println(x);
		

	}
}
