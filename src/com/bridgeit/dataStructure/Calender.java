package com.bridgeit.dataStructure;

import com.bridgeit.utility.Utility1;

public class Calender {

	public static void main(String[] args) {
    int month,year;
	System.out.println("Enter month");
	month=Utility1.ipnumber();
	System.out.println("Enter year");
	year=Utility1.ipnumber();
	
	Utility1.Calender(month,year);//passing month and year in Calender method
	
	}

}
