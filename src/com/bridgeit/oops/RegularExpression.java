package com.bridgeit.oops;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		Pattern pattern;
		Matcher matcher;
		String input="  Hello <<name>>, We have your full name as <<full name>> in our system"+" your contact number is 91-xxxxxxxxxx" + "Please,let us know in case of any clarification Thank you BridgeLabz 21/11/2018."; 
		
		System.out.println("Enter Name");
		String username=scanner.nextLine();
		
		
		System.out.println("Enter fullName");
		String surname=scanner.nextLine();
		String fullname=surname.substring(0, surname.length());
		
		
		System.out.println("Enter Contact Number  ");
		String contactNo=scanner.nextLine();
		
		 pattern=Pattern.compile("<<name>>"); //compiles the given regular expression into pattern
		 matcher=pattern.matcher(input);      //Return matcher for given input
		 input=matcher.replaceAll(username);  //Replace given string with new string
		 
		 pattern=Pattern.compile("<<full name>>"); 
		 matcher=pattern.matcher(input);
		 input=matcher.replaceAll(fullname);
		 
		 pattern=Pattern.compile("<<91-xxxxxxxxxx>>"); 
		 matcher=pattern.matcher(input);
		 input=matcher.replaceAll(contactNo);
		
		
		System.out.println(input);//Print Modified output
		
		
		
		

	}

}
