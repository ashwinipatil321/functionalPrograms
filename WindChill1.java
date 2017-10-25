package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class WindChill1
{
	public static void main(String[] args)
    {	
		Utility utility = new Utility();
    	double temperature,speed;
    	System.out.println("Enterthe temperature t (in Fahrenheit) :");
    	temperature = utility.inputDouble();
        System.out.println("Enter  speed v (in miles per hour):");
        speed = utility.inputDouble();
        utility.calculate(temperature,speed);  
    }
   
}


