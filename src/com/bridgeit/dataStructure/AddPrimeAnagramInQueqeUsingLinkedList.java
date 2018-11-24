package com.bridgeit.dataStructure;

import com.bridgeit.utility.Utility1;

public class AddPrimeAnagramInQueqeUsingLinkedList {

	public static void main(String[] args) {
		System.out.println("Prime Anagram number in queue using LinkedList  : ");
		System.out.println();
		twoDAnagramQueue(1000);
		
	}

	private static void twoDAnagramQueue(int size) {
		QueueUsingLinkedListPrime<String> queqe=new QueueUsingLinkedListPrime<>();
	
		int number = size;
		boolean status2, status, status1;
		
		for (int i = 11; i < size; i++) // here i is 11 bcoz anagram is 2 digit no.
		{
			for (int j = i + 1; j < number - 1; j++)
			{
				status1 = Utility1.primeNum(i);      //check first i and j prime  
				status = Utility1.primeNum(j);       
				status2 = Utility1.anagramNum(i, j);//if both are prime then check for anagram
				
				if (status2 && status && status1) // if condition is true then enque
				{
					
					queqe.enqueue(i+""); //Add number i in queqe
					queqe.enqueue(j+""); //Add number j in queqe
				}

			}
		}
		queqe.print(); // Print all numbers in queqe
		
	}

}
