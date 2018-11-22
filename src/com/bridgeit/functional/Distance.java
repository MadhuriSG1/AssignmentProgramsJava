package com.bridgeit.functional;


import com.bridgeit.utility.Utility1;

public class Distance {

	public static void main(String[] args) {
		               
		System.out.println("Enter value of x");
		int x=Utility1.ipnumber();
		System.out.println("Enter value of y ");
		int y=Utility1.ipnumber();
		Utility1.euclideanDistance(x, y);     
				
	}

}
