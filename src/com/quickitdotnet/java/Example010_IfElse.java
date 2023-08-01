package com.quickitdotnet.java;

public class Example010_IfElse {

	public static void main(String[] args) {
		
		int number = 13;
		if(number%2 == 0) {
			
			System.out.println("even number");
		}else {
			System.out.println("Odd number");
		}
		
		System.out.println("****************");
		
		int year = 1975;
		if(((year%4==0)&& (year%100!=0))||(year%400==0)) {
			System.out.println("Leap Year");
		}else {
			System.out.println("common year");
		}
	}

}
