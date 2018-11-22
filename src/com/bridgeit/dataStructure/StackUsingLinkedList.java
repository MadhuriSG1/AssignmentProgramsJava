package com.bridgeit.dataStructure;

import java.util.EmptyStackException;

public class StackUsingLinkedList {

	
	public ListNodeForPrime top;
	int length;
	
	public int length(){
		return length;
	}
	public boolean isEmpty(){
		return length == 0;	
	}
	/*Push data into stack*/
	public void push(int data)
	{
		ListNodeForPrime temp = new ListNodeForPrime(data); //Create ListNode object temp 
		temp.next = top;
		top = temp;
		length++;
	}
	/*Pop  data from stack*/
	public int pop(){
		if(isEmpty()) 
		{
			throw new EmptyStackException();
		}
		int result = top.data;
		top = top.next;
		length--;
		return result;	
	}
	/*Gets peek value from stack*/
	public int peek()
	{
		if(isEmpty())
		{
			throw new EmptyStackException();	
		}
		return top.data;		
	}

	public void reverse()
	{
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
	}
	/*Print all the data from stack in reverse order*/
	public void print()
	{
		if(isEmpty())
		{
			return;
		}

		ListNodeForPrime current = top; //For getting reverse we take current=top 
		while(current!= null)
		{
			System.out.print(current.data + "--> ");
			current = current.next;
		}
	}

}
