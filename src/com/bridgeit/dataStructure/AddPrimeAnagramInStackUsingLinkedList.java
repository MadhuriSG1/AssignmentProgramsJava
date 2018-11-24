package com.bridgeit.dataStructure;


import com.bridgeit.utility.Utility1;

public class AddPrimeAnagramInStackUsingLinkedList {

	public static void main(String[] args) {
		
		System.out.println("Prime Anagram number in stack using LinkedList  : ");
		System.out.println();
		twoDAnagramReverse(1000); //Checking anagram upto 1000
		
	}
	public static void twoDAnagramReverse(int size) {
		StackUsingLinkedList<Integer> stack = new StackUsingLinkedList<>();
		int number = size;
		boolean status2, status, status1;
		
		for (int i = 11; i < size; i++) // here i is 11 bcoz anagram is 2 digit no.
		{
			for (int j = i + 1; j < number - 1; j++)
			{
				
				status1 = Utility1.primeNum(i);  
				status = Utility1.primeNum(j);//check first i and j prime  
				status2 = Utility1.anagramNum(i, j); //if both are prime then check for anagram
				
				if (status2 && status && status1) //if condition true push i and j in stack
				{
					stack.push(i);
					stack.push(j);
				
				}

			}
		}
		stack.print(); //Print all the numbers in stack
		
	}

}
