package com.quickitdotnet.java;

import java.lang.reflect.Type;
import java.util.Scanner;

public class Example018_WhileLoop {

	public static void main(String[] args) {
		
		//2* 1 = 2
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		int num = s.nextInt();// Read number from Scanner 
		System.out.println("Enter Range");
		int range = s.nextInt();
		int i =1;
		
		
		while (i<=range) 
		{
			
			System.out.println(num+ "*"+i+" = "+num*i);
			i++;
		}
		
		
		
		
	}
}
