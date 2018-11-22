package com.bridgeit.functional;


import com.bridgeit.utility.Utility1;

public class Triplets {

	public static void main(String[] args) {
	
		
		System.out.println("Enter length of array");
		int length=Utility1.ipnumber();
		int array[]=Utility1.ipArray(length);
		Utility1.numSumToZero(array,length);
	}

}
