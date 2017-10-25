package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;
public class PrimeFactor
{
	static Scanner scanner = new Scanner(System.in);
	static int number;
	public static void main(String args[])
	{ 
		System.out.println("Enter the number to find prime factor:");
		number = scanner.nextInt();
		Utility.prime(number);
	}
	
}
