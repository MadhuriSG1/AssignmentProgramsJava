package com.bridgeit.utility;

import java.util.Comparator;

public class Deque1 <E extends Comparable<E>> implements Comparator<E> {
		
		public Node<E> head=null;
		public Node<E> end=null;
		int size=0;
		
		private class Node <V>
		{
			private V element;
			private Node <V> next;
			private Node <V> prev;
		}	
		
		public void addFront(E element)
		{
			if(head==null)
			{
				Node<E> temp=new Node<E>();
				temp.element=element;
				head=temp;
				end=temp;
				size++;
			}
			else
			{
				Node<E> temp=new Node<E>();
				temp.element=element;
				head.prev=temp;
				temp.next=head;
				temp.prev=null;
				head=temp;
				size++;
			}
		}
		
		public void addRear(E element)
		{
			if(end==null)
			{
				Node<E> temp=new Node<E>();
				temp.element=element;
				temp.next=null;
				temp.prev=null;
				head=temp;
				end=temp;
				size++;
			}
			else
			{
				Node<E> temp=new Node<E>();
				temp.element=element;
				end.next=temp;
				temp.prev=end;
				temp.next=null;
				end=temp;
				size++;
			}
		}
		
		public E removeRear()
		{
			if(size>0) {
			Node<E> temp=end;
			end=end.prev;
			size--;
			return temp.element;
			}
			return null;
			
		}
		public E removeFront()
		{
			if(size>0) {
			Node<E> temp=head;
			head=head.next;
			size--;
			return temp.element;
			}
			return null;
			
		}
		
		public boolean isEmpty()
		{
			return size==0?true:false;
		}
		public int size()
		{
			return size;
		}

		@Override
		public int compare(E o1, E o2) {
			// TODO Auto-generated method stub
			return o1.compareTo(o2);
		}
		
	}



