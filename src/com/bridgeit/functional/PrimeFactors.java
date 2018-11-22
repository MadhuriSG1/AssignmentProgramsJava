package com.bridgeit.functional;

import com.bridgeit.utility.Utility1;

public class PrimeFactors {

	public static void main(String[] args) {

		System.out.println("Enter number to find Prime Factors");
		int number=Utility1.ipnumber();
		Utility1.primeFact(number);
		}
}
