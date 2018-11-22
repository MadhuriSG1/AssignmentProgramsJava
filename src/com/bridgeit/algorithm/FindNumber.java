package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility1;

public class FindNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter the number which is in power of 2");
        int number=Utility1.ipnumber();//take input number
       int Number=(int) Math.pow(2, number);//found power of 2 of input number and print
        for(int i=0;i<Number;i++)
        {
           System.out.print(i+ " ");
        }
        
            int count=0;//for counting number of times you required to find exact number
            int lower=0;
            int upper=Number-1;
            int mid=lower+upper/2;
        
        Utility1.findNumber(lower, upper, mid, count, Number,number);//call utility method
        
	}

}
