package com.bridgeit.functional;


import com.bridgeit.utility.Utility1;

public class Permutation {

	public static void main(String[] args) {
		
		System.out.println("Enter String to do permutation");
		String string=Utility1.ipstring();
		int length=string.length();
		Utility1.permutationOfString(string,0,length-1);
		
		

	}

}
