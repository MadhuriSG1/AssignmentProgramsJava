package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility1;

public class BinaryWithNibbleSwap {

	public static void main(String[] args) {
		System.out.println("Enter the number\t ");
		int number=Utility1.ipnumber();//take input number 
		
	    Utility1.binaryConversion(number);//convert decimal number into binary
	    
	    System.out.println("After swapping two nibbles");
			int swap= Utility1.swapNibbles(number);//after swapping result store in swap
			System.out.println(swap);//print result after swap
			boolean poweroftwo= Utility1.isPowerOfTwo(swap);
			
		
			if(poweroftwo)	//to check whether swap contains a value which is power of 2 or not 
			{
				System.out.println("The resultant number  is a power of 2.");
			}
			else
			{
				System.out.println("The resultant number is not a power of 2.");
			}
	}

}
