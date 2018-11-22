package com.bridgeit.functional;

import com.bridgeit.utility.Utility1;

public class CouponGeneration {

	public static void main(String[] args) {
		
		int number;
		System.out.println("Enter the number:");
		number=Utility1.ipnumber();//Taking user input that how many coupons u wants to generate
		int answer = Utility1.generationOfCoupon(number);
		System.out.println("The coupon numbers can generated are= "+answer);
		
	}

}
