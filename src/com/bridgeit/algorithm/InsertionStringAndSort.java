package com.bridgeit.algorithm;


import com.bridgeit.utility.Utility1;

public class InsertionStringAndSort {

	public static void main(String[] args) {
		
		   
			System.out.println("Enter numbers of strings u wants to store :");
			int  number=Utility1.ipnumber();
			String string[]=new String[number];
			System.out.println("Enter values :");
					for(int i=0;i<number;i++)       
					{
						string[i]=Utility1.ipstring();	//taking input from user
					}
					
					Utility1.insertionsort(string,number);
				
					for(int i=0;i<number;i++)       
					{
						System.out.println(string[i]);	//Display Sorted output
					}
			}
}


