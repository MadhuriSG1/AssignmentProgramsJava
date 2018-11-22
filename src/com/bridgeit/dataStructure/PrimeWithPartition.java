package com.bridgeit.dataStructure;

import com.bridgeit.utility.Utility1;

public class PrimeWithPartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pause =100; //here pause used for partition purpose
	
		for(int i=0;i<1000;i++)
		{
			if(i>pause)//if i>pause then increase pause by 100 and then terminate line 
			{
				pause=pause+100;
				System.out.println();
			}

				boolean status2=Utility1.primeNum(i);//status2 is true if condition No. is prime
				
				if (status2) 
				{
					System.out.print("  " + i);//Print prime number
				    
				}
			}
			}
		
	}


