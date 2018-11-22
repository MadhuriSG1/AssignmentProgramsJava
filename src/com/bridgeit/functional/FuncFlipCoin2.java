package com.bridgeit.functional;


import com.bridgeit.utility.Utility1;

public class FuncFlipCoin2 {

	public static void main(String[] args) {
		

	System.out.println("Enter the number of time you want to flip coin:\n"); 
	int nooftimeflipcoin=Utility1.ipnumber();

	Utility1.flipCoin(nooftimeflipcoin);//calling utility method

}
}
