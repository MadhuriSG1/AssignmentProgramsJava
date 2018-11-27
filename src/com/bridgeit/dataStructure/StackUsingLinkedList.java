package com.bridgeit.dataStructure;

import java.util.EmptyStackException;

public class StackUsingLinkedList<T> {

	
	public ListNodeForPrime<T> top;
	int length;
	
	public int length(){
		return length;
	}
	public boolean isEmpty(){
		return length == 0;	
	}
	/*Push data into stack*/
	public void push(T data)
	{
		ListNodeForPrime<T> temp = new ListNodeForPrime(data); //Creates temp object of node
		temp.next = top;//
		top = temp;
		length++;
	}
	/*Pop  data from stack*/
	public int pop(){
		if(isEmpty()) 
		{
			throw new EmptyStackException();
		}
		int result = (int) top.data;
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
		return (int) top.data;		
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

		ListNodeForPrime<T> current = top; //For getting reverse we take current=top 
		while(current!= null)
		{
			System.out.print(current.data + "--> ");
			current = current.next;
		}
	}

}
