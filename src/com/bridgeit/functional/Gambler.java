package com.bridgeit.functional;

import com.bridgeit.utility.Utility1;


public class Gambler {

	public static void main(String[] args) {

		int trails;
		int stake;
		int goal;
	
		System.out.println("Enter the trails");
		trails=Utility1.ipnumber();//No. of times u wants to play game
		System.out.println("Enter the stake");
		stake=Utility1.ipnumber();//amount u available
		System.out.println("Enter the goals");
		goal=Utility1.ipnumber();//target amount
		Utility1.gamblerOutcome(stake,goal,trails);
		
	}

}
