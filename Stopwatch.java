package com.bridgelabz.functionalprograms;
import java.util.*;

import com.bridgelabz.utility.Utility;
public class Stopwatch 
{
	Scanner scanner=new Scanner(System.in);
	Utility utility = new Utility();
	char choice;
	public static void main(String[] args) 
	{  
		Stopwatch sw = new Stopwatch();
		sw.calStopWatch();
	}
	public void calStopWatch()
	{
		do
		{
			System.out.println("1. START TIME:");
			System.out.println("2. STOP  TIME:");
			System.out.println("3. TIME  ELAPASED:");
			System.out.println("Enter your choice:");
			int ch = utility.inputInteger();
			switch(ch)
			{
			case 1:
				utility.start();
				break;
			case 2:
				utility.stop();
				break;
			case 3:
				utility.timeelapsed();
				break;
			default:
				System.out.println("There is no Timer");
			}
			System.out.println("\nDo you want to continue (Type y or n) \n");
			choice = scanner.next().charAt(0);  
		}
		while (choice == 'Y'||choice == 'y'); 
	}

}
