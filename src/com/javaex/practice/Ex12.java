package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		sc.close();
		
		int st = 1;
		
		for(int a=1; a<=num; a++) {
			st = st * a;
		}
		
		System.out.print("결과값: " + st);
	}

}
