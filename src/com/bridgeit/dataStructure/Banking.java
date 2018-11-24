package com.bridgeit.dataStructure;

import com.bridgeit.utility.Utility1;

public class Banking {

	public static void main(String[] args) {
		
		Utility1 input=new Utility1();
		System.out.println("Enter No Of Person");
		int n=input.ipnumber();
		int amountleft=Utility1.Banking(n);
		System.out.println("AmountLeft = "+amountleft);
	}

}
