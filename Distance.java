package com.bridgelabz.functionalprograms;
import java.util.Scanner;
import com.bridgelabz.utility.Utility;
public class Distance 
{
	static int number1;
	static int number2;
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number:");
		number1 = scanner.nextInt();
		System.out.println("Enter the second number:");
		number2 = scanner.nextInt();
		Utility.findDistance(number1,number2);
		scanner.close();
	}

}


