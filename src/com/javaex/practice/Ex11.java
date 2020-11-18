package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("숫자를 입력하세요");
		num = sc.nextInt();
		
	
			if(num % 2 == 0){
				int result = (num + 2) * num / 4;
				System.out.print("결과값: " + result);
				}else {int result2 = (num + 1) * (num+1) / 4;
				System.out.print("결과값: " + result2);
			}
		
		
		sc.close();
	}

}
