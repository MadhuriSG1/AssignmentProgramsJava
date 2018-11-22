package com.bridgeit.dataStructure;


import com.bridgeit.utility.Utility1;

public class BankingCashCounter {
	
	public static int balance=500;

	public static void main(String[] args) {
	
		System.out.println("Enter number of Persons");
		int person=Utility1.ipnumber();
		
		System.out.println("Enter size of Queue");
		int size=Utility1.ipnumber();
		
		QueqeClass queue=new QueqeClass(size,person);//Create QueqeClass object queqe
		Utility1.bankingCashCounterUti(queue,balance,person);
		
	}

}
