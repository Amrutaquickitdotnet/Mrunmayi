package com.quickitdotnet.java;

public class Example005_Arithmatic_Operator {
	
	

	public static void main(String[] args) {
		int a , b = 10, c=5;
		
		a = b+c;
		System.out.println("Value of a after addition is "+a);
		
		
		a = b-c;
		System.out.println("Value of a after substraction is "+a);
		
		
		a = b*c;
		System.out.println("Value of a after multiplication is "+a);
		
		
		a = b/c;
		System.out.println("Value of a after division is "+a);
		
		
		a = b%c;
		System.out.println("Value of a after Modulus is "+a);
		
		b++;// post increment // b = b+1 b =11   First Assign value then it will going to increment
		System.out.println("The value of b after postincrement is "+ b);
		
		
		++b;// preincrement// First increment value then assign incremented value to variable
		System.out.println("The value of b after postincrement is "+ b);
		
		--c;// predecrement// First decrement value then assign incremented value to variable
		System.out.println("The value of b after postincrement is "+ c);//4=c
		
		++c;// predecrement// First increment value then assign incremented value to variable
		System.out.println("The value of c after preincrement is "+ c);//c =5
		
		
		c--;// post increment // c =c-1  First Assign value then it will going to decrement
		System.out.println("The value of c after postdecrement is "+ c);//4
		
		
		--c;// predecrement// First decrement value then assign incremented value to variable
		System.out.println("The value of b after postincrement is "+ c);//3
		
		
		
	}

}
