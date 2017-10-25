package com.bridgelabz.functionalprograms;

import java.util.Scanner;

class CouponNumber
{
	static int count=0,distinct=0;
	public static void main(String[] args)
	{
		int number;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Coupon numbers.........");
		number=scanner.nextInt();
		System.out.println("Total Random number to have Distinct Number....."+PrintDistinctCoupon(number));
		scanner.close();
	}
	/**this method print distict random no
	 * @param n
	 * @return
	 */
	private static int PrintDistinctCoupon(int n)
	{
		boolean[] value=new boolean[n];
		while(distinct<n)
		{
			int val=getCoupon(n);
			count++;
			if(!value[val])
			{
				distinct++;
				value[val]=true;
			}
		}
		return count;
	}
	/**return coupon number
	 * @param n
	 * @return
	 */
	private static int getCoupon(int n)
	{
		return (int)(Math.random()*n);}
}
