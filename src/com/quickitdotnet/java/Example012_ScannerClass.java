package com.quickitdotnet.java;

import java.util.Scanner;

public class Example012_ScannerClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);// Object instantiation process copy
		// String input
		/*
		 * sc.nextLine(); sc.nextInt(); sc.nextFloat(); sc.nextDouble()
		 */
		System.out.println("Please enter name");
		//Farenhite = (celsius*(9/5)+32)
		// Celsius = (F-32)*5/9
		String name = sc.nextLine();
		System.out.println("Please enter age");
		int age = sc.nextInt();
		System.out.println("Please enter mobileNumber");
		long mobileNumber = sc.nextLong();
		System.out.println("Please enter cgpa");
		double cgpa = sc.nextDouble();
		System.out.println("Please see result depending on your insert");
		System.out.println("Name: " + name);

		System.out.println("age: " + age);
		System.out.println("mobileNumber: " + mobileNumber);

		System.out.println("CGPA: " + cgpa);
		sc.close();
	}

}
