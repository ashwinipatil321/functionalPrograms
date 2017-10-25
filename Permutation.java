package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class  Permutation
{
	static String str;
	static int high;
	public static void main(String [] args)
	{
		Scanner scaner = new Scanner(System.in);
		System.out.println("Enter String to find Permutation");
		str=scaner.nextLine();
		high= str.length()-1;
		permutation(str,0,high);
		scaner.close();
	}
	private static void permutation(String str, int low, int high) {
		if(low==high)
		{
			System.out.print(str+" ");
		}
		else
		{
			for(int i=low;i<=high;i++)
			{
				str = swap(str,low,i);
				permutation(str,low+1,high);
				str = swap(str,low,i);
			}
		}
	}
	public static String swap(String str,int low,int i)
	{
		char temp;
		char charArray[]=str.toCharArray();
		temp = charArray[i];
		charArray[i]=charArray[low];
		charArray[low]=temp;
		return String.valueOf(charArray);
	}
	}
		// TODO Auto-generated method stub
		
	
	