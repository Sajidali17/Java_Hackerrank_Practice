package com.misc_practice;

public class PrintfExample {

	public static void main(String[] args) {
		String name = "Sajid Ali";
		int age = 24;
		double salary = 40000.00;
		
//		System.out.printf("Name: %s, Age : %d , Salary: %.3f", name, age, salary);
//		
//		System.out.printf("Char: %c%n", 'A');
//		System.out.printf("Boolean: %b%n", true);
//		System.out.printf("Hexadecimal: %x%n", 200);
//		System.out.printf("Octal: %o%n", 255);
		System.out.println("Padding Demo..");
		
		//System.out.printf("%010s%n","Sajid");
		System.out.printf("%-15s %04d","Sajid ALi",101);
		
	}

}
