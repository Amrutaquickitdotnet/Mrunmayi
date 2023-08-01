package com.quickitdotnet.java;

import java.lang.reflect.Type;
import java.util.Scanner;

public class Example015_CloningArray {

	public static void main(String[] args) {

		// When you clone a single Dimensional Array Such as Object[] a
		// deep copy is performed with the new array containing copies of original array
		// element
		// as opposed to reference
		int intarray[] = { 3, 4, 5, 6 };
		System.out.println(intarray);

		int cloneArray[] = intarray.clone();
		
		System.out.println(cloneArray);
		// Comparison Operator Strickly 
		System.out.println(intarray == cloneArray);
		for (int i = 0; i < cloneArray.length; i++) {
			System.out.println(cloneArray[i]);
		}
		
	}
}
