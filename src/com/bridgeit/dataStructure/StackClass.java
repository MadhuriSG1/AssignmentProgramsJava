package com.bridgeit.dataStructure;

public class StackClass {
	

		private int maxSize;
		private long[] stackArray;
		private int top;

		//for size  
		public StackClass (int size) // use constructor to initialize instance variable
		{
		maxSize = size;
		stackArray = new long[maxSize];
		top = -1;
		}
		
		//for push   
		public void push(long j)
		{
		stackArray[top=top+1] = j;
		}
		
		//for pop   
		public long pop(long i) 
		{
		return stackArray[top--];
		}
		
		//for peek   
		public long peek() 
		{
		return stackArray[top];
		}
		
		//to check whether stack is empty	   
		public boolean isEmpty()
		{
		return (top == -1);
		}
		
		//to check whether stack is full	   
		public boolean isFull()
		{
		return (top == maxSize - 1);
		
		}
	}


