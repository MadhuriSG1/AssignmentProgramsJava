package com.bridgeit.dataStructure;


import com.bridgeit.utility.Utility1;

public class PrimeAnagram2DArray {

	public static void main(String[] args) {
		
		System.out.println("Anagram number in 2D array: ");
		System.out.println();
		primeAnagram2D(1000);
		
	}
	public static void primeAnagram2D(int size) {
		
		int number = size;
		boolean status2, status, status1;
		int pause =100;//taking for partition purpose
		for (int i = 11; i < size; i++)
		{
			for (int j = i + 1; j < number - 1; j++)
			{
				status1 = Utility1.primeNum(i);
				status = Utility1.primeNum(j);
				status2 = Utility1.anagramNum(i, j);
				if(i>pause)
				{
					pause=pause+100;
					System.out.println();
				}
				
				
				if (status2 && status && status1) 
				{
					System.out.print(" " + i +"="+ j +" ");
				    
				}
				
			    }
	}
	}
	
	

}
