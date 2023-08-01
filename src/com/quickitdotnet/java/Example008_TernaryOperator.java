package com.quickitdotnet.java;

public class Example008_TernaryOperator{
	
	

	public static void main(String[] args) {
		
		
		//<,>,>=,<=, ==, !=
		
		int Ten = 10;
		int Twenty = 20;
		int Thirty = 30;
		
		boolean bvalue;
		int ivalue;
		
		bvalue = (Thirty == Twenty+Ten)? true : false;
		System.out.println(bvalue);
		
		ivalue = (Thirty == Twenty+Ten)? 50 : 100;
		System.out.println(ivalue);
		
		//(!(Thirty == Twenty+Ten))(!True)=False
		ivalue = (!(Thirty == Twenty+Ten))? 50 : 100;
		System.out.println(ivalue);
	}

}
