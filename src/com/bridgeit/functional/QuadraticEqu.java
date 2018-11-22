package com.bridgeit.functional;

import com.bridgeit.utility.Utility1;

public class QuadraticEqu {

	public static void main(String[] args) {
		
		
		System.out.println("Enter value of a");
		int a=Utility1.ipnumber();
		System.out.println("Enter value of b");
		int b=Utility1.ipnumber();
		System.out.println("Enter value of c");
		int c=Utility1.ipnumber();
		Utility1.quadraticRoot(a,b,c);
		
		}

}
