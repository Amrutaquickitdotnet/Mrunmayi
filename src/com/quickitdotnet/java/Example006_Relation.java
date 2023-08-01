package com.quickitdotnet.java;

public class Example006_Relation{
	
	

	public static void main(String[] args) {
		
		
		//<,>,>=,<=, ==, !=
		
		int Ten = 10;
		int Twenty = 20;
		int Thirty = 30;
		System.out.println("**** Greater than Operator**********");
		System.out.println("Ten >Twenty====>"+ (Ten > Twenty));
		System.out.println("Twenty >Ten===>"+ (Twenty > Ten));
		System.out.println("Thirty >Twenty====>"+ (Thirty > Twenty));
		
		
		System.out.println("****************************");
		System.out.println("**** Greater than equal to Operator**********");
		System.out.println("Ten >=Twenty====>"+ (Ten >= Twenty));
		System.out.println("Twenty >=Ten===>"+ (Twenty >= Ten));
		System.out.println("Thirty >=Twenty====>"+ (Thirty >= Twenty));
		
		
		System.out.println("****************************");
		System.out.println("**** Less than **********");
		System.out.println("Ten <Twenty====>"+ (Ten < Twenty));
		System.out.println("Twenty <Ten===>"+ (Twenty < Ten));
		System.out.println("Thirty <Twenty====>"+ (Thirty < Twenty));
		
		
		
		System.out.println("****************************");
		System.out.println("**** Less than equal to Operator**********");
		System.out.println("Ten <=Twenty====>"+ (Ten <= Twenty));
		System.out.println("Twenty <=Ten===>"+ (Twenty <= Ten));
		System.out.println("Thirty <=Twenty====>"+ (Thirty <= Twenty));
		
		
		System.out.println("****************************");
		System.out.println("****  equal to Operator**********");
		System.out.println("Ten ==Twenty====>"+ (Ten == Twenty));
		System.out.println("Twenty ==Ten===>"+ (Twenty == Ten));
		System.out.println("Thirty ==Twenty+ Ten====>"+ (Thirty == Twenty+Ten));
		
		
		
		System.out.println("****************************");
		System.out.println("****  Not equal to Operator**********");
		System.out.println("Ten!=Twenty====>"+ (Ten !=Twenty));// true(10!= 20)

		System.out.println("Thirty !=Twenty+ Ten====>"+ (Thirty !=Twenty+Ten));// false(30!=30)
	}

}
