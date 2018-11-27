package com.bridgeit.dataStructure;

public class QueqeClass {
	

	int front, rear, size, person;
	int[] arr;
/* Create Constructor of queqe class*/
	public QueqeClass(int size, int person) 
	{
	this.size = size;
	this.person = person;
	front = 0;
	arr = new int[size];
	System.out.println("Queue is ready");
	}
//Enque element in Queqe
	public void enQue() 
	{
	if(isFull()) 
	{
	System.out.println("Queue is full");
	} else 
	{
	rear = rear + 1;
	}
	}
//Deque1 element from queqe
	public void deQue() 
	{
	if (isEmpty()) 
	{
	System.out.println("Queue is empty");
	} 
	else 
	{
	front++;//Deque1 element from queqe then front incremented
	}
	}
//check for  queqe is empty
	private boolean isEmpty() {
	return front == rear;
	}
//check for  queqe is full
	private boolean isFull() {
	return rear == size;
	}
//it return size of queqe
	public int sizeOfQue() {
	return rear - front;
	}

}
