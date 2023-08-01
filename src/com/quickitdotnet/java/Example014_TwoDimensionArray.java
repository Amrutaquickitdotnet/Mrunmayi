package com.quickitdotnet.java;

import java.lang.reflect.Type;
import java.util.Scanner;

public class Example014_TwoDimensionArray {

	public static void main(String[] args) {
     
		
		int arr[][]= {{2,5,6},{3,4,5},{3,8,5}};
		// To iterate Row Element
		for(int i =0; i<3; i++) {
			// To iterate column Element 
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j]+ "   ");
			}
			System.out.println(" ");
			
		}
	}

}
