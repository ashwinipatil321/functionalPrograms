package com.bridgelabz.functionalprograms;
import java.util.*;
import com.bridgelabz.utility.Utility;
public class Gambler
{
	static int stake;
	static int goal;
	static int number;
	public static void main(String[] args)
	{
		Scanner scaner =new Scanner(System.in);
		System.out.println("Enter initial stake amount :");
		stake=scaner.nextInt();
		System.out.println("set the goal amount :");
		goal=scaner.nextInt();
		System.out.println("Enter number of times u want to play :");
		number=scaner.nextInt();
		Utility.game(stake,goal,number);
		scaner.close();
	}

}

