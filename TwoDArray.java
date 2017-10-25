package com.bridgelabz.functionalprograms;
import java.util.*;
import com.bridgelabz.utility.Utility;
public class TwoDArray
{
	
	public static void main(String args[])
	{ 	
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		System.out.print("Enter Number of Row for Array : ");
		int row = scanner.nextInt();
		System.out.print("Enter Number of Column for Array : ");
		int column = scanner.nextInt();
		utility.twoDArray(row,column);
		scanner.close();
		
	}
}

