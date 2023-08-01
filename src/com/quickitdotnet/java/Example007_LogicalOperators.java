package com.quickitdotnet.java;

public class Example007_LogicalOperators{
	
	

	public static void main(String[] args) {
		
		
		
		/*
		 * T && T = T T && F = F F && T = F F && F = T
		 */
		
		boolean output1 = true;
		boolean output2 = false;
		
		System.out.println(output1&& output2);// true && false = false
		
		System.out.println(output1 ||output2);// true or false = true
		
		System.out.println(!output1);// false
	}

}
