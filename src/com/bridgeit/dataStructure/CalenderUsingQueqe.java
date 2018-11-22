package com.bridgeit.dataStructure;

import com.bridgeit.utility.Utility1;

public class CalenderUsingQueqe {

	public static void main(String[] args) {
		
		new Utility1();
		System.out.println("Enter the month:");
		int month=Utility1.ipnumber();
		System.out.println("Enter the year:");
		int year=Utility1.ipnumber();
        Utility1.CalendarQueue(month,year);//passing month and year in Calender method
    	
	}

}
