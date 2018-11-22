package com.bridgeit.algorithm;


import java.util.Arrays;

import com.bridgeit.utility.Utility1;


public class StaticMethodsSortSearch {

	public static void main(String[] args) {
		do{
	        int choice;
	        long startTime;
            long endTime;
            long difference;
    
   
	   System.out.println("Enter your choice");
	   System.out.println("1.BinarySearch method for Integer");
	   System.out.println("2.BinarySearch method for String");
	   System.out.println("3.InsertionSort method for integer");
	   System.out.println("4.InsertionSort method for String");
	   System.out.println("5.BubbleSort method for integer");
	   System.out.println("6.BubbleSort method for String");
	   
	   choice=Utility1.ipnumber();
	   
	   switch(choice)
	   {
	   case 1:
	   {
		  int i;
		  System.out.println("Enter length of integer array");
		  int length=Utility1.ipnumber();
		  System.out.println("Please enter integer numbers");
		
		  int[] array=new int[100];
		  for(i=0;i<length;i++)
		  {
			  array[i]=Utility1.ipnumber();
		  }
		  startTime = System.currentTimeMillis();
		  Arrays.sort(array, 0, length);
		  System.out.println("Sorted array ");
	      System.out.println("please enter the integer numbers you wants to search");
		  int number=Utility1.ipnumber();
	
		  boolean result=Utility1.binarysearchInt(array,number);
		  endTime = System.currentTimeMillis();
		   if(result==true)
		   {
			   System.out.println("The integer is found");
		   }
		   else
		   {
			   System.out.println("The integer is not found");
		   }
		   
		 
           difference = (endTime - startTime)/1000;
           System.out.println("\nElapsed Time " + difference + " NanoSeconds");
       
           break;
	   }
		   
	   case 2:
	   {
		   
		   System.out.println("Enter length of String array");
			  int length=Utility1.ipnumber();
			  System.out.println("Please enter Strings");
			
			  String[] stringarray=new String[length];
			  for(int i=0;i<length;i++)
			  {
				  stringarray[i]=Utility1.ipstring();
				  			 
			  }
			  startTime = System.currentTimeMillis();
			  Arrays.sort(stringarray, 0, length);
			
			System.out.println("Enter the string you want to search");
			String string1=Utility1.ipstring();
			boolean res=Utility1.binarysearchStr(stringarray,string1);
			endTime = System.currentTimeMillis();
			System.out.println(res);
			if(res==true)
			{
				System.out.println("The string is found");
			}else
			{
				System.out.println("The string is not found...");
		    }
			   
			   difference = (endTime - startTime)/1000;
	           System.out.println("\nElapsed Time " + difference + " NanoSeconds");
	      
	           
		   break;
		   }
	   
	   case 3:
	   {
		   int len;
		    startTime = System.currentTimeMillis();
		    System.out.println("Enter Array size");
		    len=Utility1.ipnumber();
		    int input[] =new int[len];
		    System.out.println("Enter element of an array");
		    for(int i=0;i<len;i++)
		    {
		      input[i]=Utility1.ipnumber();
		    }
		    Utility1.insertionsort(input,len);
		    endTime = System.currentTimeMillis();
            difference = (endTime = startTime)/1000;
		    System.out.println("Elapsed Time " + difference + "  NanoSeconds");

 
           

		   break;
	   }
		   
	   
	   case 4:
	   {
		   int length;

            startTime = System.currentTimeMillis();
		    System.out.println("Enter Array size");
		    length=Utility1.ipnumber();
		    String input[] =new String[length];
		    System.out.println("Enter element of an array");
		    for(int i=0;i<length;i++)
		    {
		      input[i]=Utility1.ipstring();
		    }
		    Utility1.insertionsort(input,length);
		    endTime = System.currentTimeMillis();
            difference = (endTime = startTime)/1000;
            System.out.println("Elapsed Time " + difference + " NanoSeconds");
		    break;
	   }
	   
	   case 5:
	   {
		 
		    startTime = System.currentTimeMillis();
			System.out.println("Enter size of your array");
			int a=Utility1.ipnumber();
		   
			Utility1.bubbleSortUti(a);
			endTime = System.currentTimeMillis();
            difference = (endTime - startTime)/1000;
            System.out.println("\nElapsed Time " + difference + " NanoSeconds");
            break;
	   }
	   case 6:
	   {
		    startTime = System.currentTimeMillis();
			System.out.println("Enter size of your array");
			int a=Utility1.ipnumber();
		   
			Utility1.bubbleSortStringUti(a);
			endTime = System.currentTimeMillis();
            difference =(endTime = startTime)/1000;
            System.out.println("Elapsed Time " + difference + " NanoSeconds");
            break;
	   }

	 }
}while(true);
	
	}

}
