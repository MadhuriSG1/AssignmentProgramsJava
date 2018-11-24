package com.bridgeit.dataStructure;

import java.util.Comparator;

public class Stack <E extends Comparable<E>> implements Comparator<E> {
		
		int size=0;
		public Node<E> start=null;
		private class Node <V>
		{
			public V element;
			public Node <V> next;
		}	
		
		public void push(E element)
		{
			if(start==null)
			{
				start=new Node<E>();
				start.element=element;
				size++;
				return;
			}
			Node<E> temp=new Node<E>();
			temp.element=element;
			temp.next=start;
			start=temp;
			size++;
		}
		
		public E pop()
		{
			if(start!=null)
			{
			E popelement=start.element;
			start=start.next;
			size--;
			return popelement;
			
			}
			else
			{
				return null;
			}
		}
		
		public E peek()
		{
			return start.element;
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


