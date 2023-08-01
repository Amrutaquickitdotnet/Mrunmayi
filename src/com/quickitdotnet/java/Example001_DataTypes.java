package com.quickitdotnet.java;

public class Example001_DataTypes {

	public static void main(String[] args) {

		// syso + ctrl+Spacebar = Allows me to print Something
		// println =>printing on the same line but immediately my cursor will move
		// toward next line
		// print => printing on same line
		System.out.println("hi");
		System.out.println("how are you");
		System.out.println("I am Fine");

		// how to find size of each and every Data Type
		System.out.println("Size of Integer Data Type:" + Integer.SIZE);
		// 1 byte = 8 bits
		// 32 bits = 4 byte
		// . => Access Specifier
		System.out.println("The minimum value of Integer is " + Integer.MIN_VALUE);
		System.out.println("The maximum value of Integer is " + Integer.MAX_VALUE);

		System.out.println("*********************************");
		System.out.println("Size of Float Data Type:" + Float.SIZE);
		System.out.println("The minimum value of Float is " + Float.MIN_VALUE);
		System.out.println("The maximum value of Float is " + Float.MAX_VALUE);

		System.out.println("*********************************");
		System.out.println("Size of Long Data Type:" + Long.SIZE);
		System.out.println("The minimum value of Long is " + Long.MIN_VALUE);
		System.out.println("The maximum value of Long is " + Long.MAX_VALUE);

		System.out.println("*********************************");

		System.out.println("Size of Double Data Type:" + Double.SIZE);
		System.out.println("The minimum value of Double is " + Double.MIN_VALUE);
		System.out.println("The maximum value of Double is " + Double.MAX_VALUE);

		System.out.println("*********************************");

		System.out.println("Size of Byte Data Type:" + Byte.SIZE);
		System.out.println("The minimum value of Byte is " + Byte.MIN_VALUE);
		System.out.println("The maximum value of Byte is " + Byte.MAX_VALUE);
     
		System.out.println("*********************************");
		
		System.out.println("Size of Short Data Type:" + Short.SIZE);
		System.out.println("The minimum value of Short is " + Short.MIN_VALUE);
		System.out.println("The maximum value of Short is " + Short.MAX_VALUE);
		
		System.out.println("*********************************");
		//ASCII (
		System.out.println("Size of Character Data Type:" + Character.SIZE);

	}

}
