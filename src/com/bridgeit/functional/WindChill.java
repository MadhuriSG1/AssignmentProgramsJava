package com.bridgeit.functional;

import com.bridgeit.utility.Utility1;

public class WindChill {

	public static void main(String[] args) 
	{
		
       System.out.println("Enter value of temperature");
       int temperature=Utility1.ipnumber();
       System.out.println("Enter value of wind speed");
       int windspeed=Utility1.ipnumber();
       if(temperature<50)
       {
    	   if(temperature>3 && temperature<120)
	
    	   {
		     Utility1.windchillMethod(temperature,windspeed);
		     
    	   }
	      else
	      {
		    System.out.println("Enter Valid value of wind speed which is between 3 & 20 ");
		  }
       }
       else
       {
	        System.out.println("Enter Valid value of temperature which less than 50");
	   }
}
}
