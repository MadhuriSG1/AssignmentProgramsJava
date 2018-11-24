package com.bridgeit.dataStructure;

import java.util.NoSuchElementException;

public class QueueUsingLinkedListPrime<T> {
	
	
	public ListNodeForPrime<T> front;
	public ListNodeForPrime<T> rear;
	public int length;

//create constructor
	public QueueUsingLinkedListPrime()
	{
		this.front = null;
		this.rear = null;
		this.length = 0;
	}
	public boolean isEmpty()
	{
		return length == 0;
	}
	/*Push(enque) data into queqe*/
	public void enqueue(T data)
	{
		ListNodeForPrime<T> temp = new ListNodeForPrime(data); //create object of list node class
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
	/*Pop(deque)  data from queqe*/
	public int dequeue()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException();
		}	
		int result = (int) front.data;
		front = front.next;
		if(front == null)
		{
			rear = null;
		}
		length--;
		return result;
	}

	/*Print data from queqe starts from front*/
	public void print(){
		if(isEmpty()){
			return;
		}
		ListNodeForPrime<T> current = front;
		while(current!= null){
			System.out.print(current.data + "--> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
}
