package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {
	
	public static void main(String[] args) {
		
		System.out.print("숫자를 입력하세요: ");
	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int s = 1;
		
		System.out.print("1");
		for(int a = 2; a<=num; a++) {
			s = a + s;
			System.out.print("+" + a);
		}
		System.out.println("");
		System.out.print("합계 : " + s);
		sc.close();
	}

}
