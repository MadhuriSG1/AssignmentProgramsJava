package com.bridgeit.algorithm;
import com.bridgeit.utility.Utility1;

public class DayOfWeekForDate {

	public static void main(String[] args) {
		
		
		Utility1 utility=new Utility1();
		  System.out.println("Enter date:");
		  int date=Utility1.ipnumber();
		  System.out.println("Enter month:");
		  int month=Utility1.ipnumber();
		  
		  System.out.println("Enter year:");
		  int year=Utility1.ipnumber();
		  int result=utility.dayOfWeekUti(date,month,year);
		  //result having value in between 0 to 6
		  switch(result)
		  {
		  case 0 : 
			  
			  System.out.print("SUNDAY");
			  break;
			  
		  case 1 : 
			  
				  System.out.print("MONDAY");
				  break;
			  
		  case 2 :
			  
				  System.out.print("TUESDAY");
				  break;
			  
		  case 3 : 
			  
				  System.out.print("WEDNESDAY");
				  break;
			  
		  case 4 : 
			  
				  System.out.print("THURSDAY");
				  break;
			  
		  case 5 : 
			  
				  System.out.print("FRIDAY");
				  break;
			  
		  case 6 : 
			  
				  System.out.print("SATURDAY");
				  break;
			  
		  }

	}

}
