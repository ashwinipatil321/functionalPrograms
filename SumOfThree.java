package com.bridgelabz.functionalprograms;
import java.util.*;
public class SumOfThree
{
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("Enter range of the array:");
		int range  = scanner.nextInt();
		System.out.println("Enter the array:");
		int []array =new int[range];
		for(int i=0;i<array.length;i++)
		{
			array[i]=scanner.nextInt();
		}
		checklogic(array.length,array,0);
	}
	public static void checklogic(int n,int arr[],int sum)
	{
		boolean found=false;
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(arr[i]+arr[j]+arr[k]==sum){	
					found=true;
						System.out.println(arr[i]+ " "+arr[j]+" "+arr[k]);	
						System.out.print("are triplets having sum equal to zero");
						System.out.println("");
						break;
					}
				}
			}
		}
		if(found==false)
		System.out.println("Triplets not exsist in the array.......");
	}
}

