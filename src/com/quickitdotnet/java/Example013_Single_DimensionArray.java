package com.quickitdotnet.java;

import java.lang.reflect.Type;
import java.util.Scanner;

public class Example013_Single_DimensionArray {

	public static void main(String[] args) {

		// Data Type variablename[] = new int [Size]
		Double d[]= new Double[1];
		System.out.println(d);
		
		
		int data[] = new int[4]; // initialization of array 
		System.out.println(data);
	   data[0]= 12;
	   data[1]= 13;
	   data[2]= 14;
	   data[13] = 12;
		for(int i =0; i<data.length; i++) {
			System.out.println(data[i]);
		}
		
		int[] data1 = {34,35,45};
		System.out.println(data1);
		// Access Index position of Element 
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println("The Second index position of data1 Array is :"+ data1[2]);
		for(int numbers:data1) {
			
			System.out.println(numbers);
		}
		
		System.out.println("Using Advanced for Each loop ");
		String name[] = {"Mrunmayi", "Amruta", "Abhay"};
		System.out.println(name);
		for(String namedata:name) {
			
			System.out.println(namedata);
		}
		
		System.out.println("Using Simple for  loop ");
		
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
		
	}

}
