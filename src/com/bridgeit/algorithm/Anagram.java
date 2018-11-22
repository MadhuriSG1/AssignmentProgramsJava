package com.bridgeit.algorithm;


import com.bridgeit.utility.Utility1;

public class Anagram {

	public static void main(String[] args) {
		
	
		System.out.println("Enter First String");
		String string1=Utility1.inputStringLine();
	    String string2=string1.replaceAll("\\s","");
	    System.out.println("Enter Second String");
	    String string3=Utility1.inputStringLine();
	    String string4=string3.replaceAll("\\s","");//replace space with no space
	    Utility1.isAnagram(string2,string4);//call utility method
	    

	}

}
