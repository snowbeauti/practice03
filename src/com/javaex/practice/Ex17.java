package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		sc.close();
		
		for(int x = 0; x<=num; x++) {
			for(int y=num-x; y>=1; y-- ) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
