package com.bridgeit.algorithm;


import com.bridgeit.utility.Utility1;

public class VendingMachine {
	
	public static void main(String[] args) {

	  	//Initialization of New Array
	  	int[] notes = { 1000,500,100,50,10,5,2,1};
		System.out.println("Enter amount to calculate notes");
		int money=Utility1.ipnumber();
	    Utility1.calculateNotes(money,notes);
	    Utility1.showTotalNotes();
	  	 
	  	}

}
