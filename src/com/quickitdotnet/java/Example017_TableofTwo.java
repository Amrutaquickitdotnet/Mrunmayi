package com.quickitdotnet.java;

import java.lang.reflect.Type;
import java.util.Scanner;

public class Example017_TableofTwo {

	public static void main(String[] args) {
		int i = 0;
		//2* 1 = 2
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		int num = s.nextInt();// Read number from Scanner 
		//int result = num*i;
		for(i=0; i<=10; i++) {
			System.out.println(num+ "*"+i+" = "+num*i);
		}
		s.close();
	}
}
