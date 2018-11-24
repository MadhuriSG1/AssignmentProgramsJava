package com.bridgeit.dataStructure;

import java.util.NoSuchElementException;

public class QueqeUsingLinkedLCalender<T> {

	public ListNodeForCalender<T> front;
	public ListNodeForCalender<T> rear;
	public int length;

//Create constructor 
	public QueqeUsingLinkedLCalender()
	{
		this.front = null;
		this.rear = null;
		this.length = 0;
	}
//check for  queqe is empty
	public boolean isEmpty()
	{
		return length == 0;
	}
//Add element in queqe
	public void enqueue(String string)
	{
		ListNodeForCalender<T> temp = new ListNodeForCalender(string); //create object of list node class
		if(isEmpty())
		{
			front = temp;
		}
		else
		{
			rear.next =temp;
		}
		rear = temp;
		length++;
	}
//Remove element from queqe	
	public String dequeue()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException();
		}	
		String result = (String) front.data;
		front = front.next;
		if(front == null)
		{
			rear = null;
		}
		length--;
		return result;
	}
//Display all elements of queqe
	public void display(){
		if(isEmpty()){
			return;
		}
		ListNodeForCalender<T> current = front;
		while(current!= null){
			System.out.print(current.data);
			current = current.next;
		}
		
	}

}
