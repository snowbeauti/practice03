package com.javaex.practice;

public class Ex08 {
	
	public static void main(String[] args) {
		
		//a + "*" + b + "=" + a*b
		
		int a, b;
		
		for(b=1; b<=9; b++) {
			for(a=2; a<=9; a++) {
				System.out.print(a + "*" + b + "=" + a*b + "\t");
			}
				System.out.println("");
		}
	}

}
