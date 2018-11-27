package com.bridgeit.utility;


public class Queue <E> {
			
			private Node<E> head=null;
			private Node<E> end=null;
			private int size=0;
			//Create Node Class
			private class Node <N>
			{
				private N element;
				private Node <N> next;
			}	
			
			public Queue()
			{
				
			}
			
			public void enqueue(E data)
			{
				if(end==null)//when queqe is empty
				{
					Node<E> temp=new Node<E>();//Create temp node
					temp.element=data;//temp element =data
					head=end=temp;//for single element in queue head and end pointed temp
					size++;
					return;
				}
				end.next=new Node<E>();//creating new node
				end=end.next;//end shifted
				end.element=data;//data assign to end
				size++;//size increment by one after enqueqe
			}
			
			public E dequeue()
			{
				if(head==null)//Cant dequeqe if head is empty
				{
					return null;
				}
				Node<E> temp=head;//Now temp pointing head
				head=head.next;//head is moving next after dequeqe
				size--;
				return temp.element;
				
			}
			
			public boolean isEmpty()
			{
				if(size==0)
					return true;
				return false;
			}
			
			public int size()
			{
				return size;
			}
	
			void display()
			{
				Node<E> n = head;
				while(n.next!=null)
				{
					System.out.println(n.element);
					n = n.next;
				}
				System.out.println(n.element);
			}

	}


