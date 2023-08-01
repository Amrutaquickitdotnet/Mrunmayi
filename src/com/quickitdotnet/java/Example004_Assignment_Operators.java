package com.quickitdotnet.java;

public class Example004_Assignment_Operators {
	
	static int speed =80;
	static int distance = 20;
	static int time = 10;
	static String name ="Mrunmayi";
	static boolean isGood = true;

	public static void main(String[] args) {

	// unary => takes One argument Appears before its argument(Prefix) or (Postfix)
		// Binary=> takes 2 arguments 
		// Ternary : three arguments.
		
	//=
		System.out.println("Value stored in the speed variable: "+ speed);
		System.out.println("Value stored in the distance variable: "+ distance);
		System.out.println("Value stored in the time variable: "+ time);
		System.out.println("Value stored in the name variable: "+ name);
		System.out.println("Value stored in the boolean variable: "+ isGood);
		
		speed = 100;
		time = distance;
		name ="test";
		isGood = false;
		System.out.println("***************************");
		System.out.println("Value stored in the speed variable: "+ speed);
		System.out.println("Value stored in the distance variable: "+ distance);
		System.out.println("Value stored in the time variable: "+ time);
		System.out.println("Value stored in the name variable: "+ name);
		System.out.println("Value stored in the boolean variable: "+ isGood);
		
		//Multiple assignment
		
		speed = distance = 0;// 100(20=0)
		System.out.println(speed);
		
		/* illegal Assignment
		 * speed= "yes"; name = 10; isGood = "testng";
		 */
		
	}

}
