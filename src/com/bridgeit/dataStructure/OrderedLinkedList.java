package com.bridgeit.dataStructure;

import java.util.Comparator;


public class OrderedLinkedList<E extends Comparable<E>> implements Comparator<E> {

		public int counter = 0;
		public Node<E> head = null;

		private class Node<V> {
			public V element;
			public Node<V> next;
		}

		public void add(E element1) {
			if (head == null) {
				head = new Node<E>();
				head.element = element1;
				head.next = null;
				counter++;
				
			} else {
				Node<E> ptr = head;
				Node<E> ptr2 = ptr;
				while (ptr != null && compare(ptr.element, element1) < 0) {
					ptr2 = ptr;
					ptr = ptr.next;
					
				}

				if (ptr == ptr2) {
					
					Node<E> temp = new Node<E>();
					temp.element = element1;
					temp.next = head;
					head = temp;
				} else if (ptr == null) {
					
					ptr2.next = new Node<E>();
					ptr2 = ptr2.next;
					ptr2.element = element1;
				} else {
					
					Node<E> temp = new Node<E>();
					temp.element = element1;
					ptr2.next = temp;
					temp.next = ptr;
				}
				counter++;
			}
		}

		@Override
		public int compare(E o1, E o2) {
			
			return o1.compareTo(o2);
		}
		
		public void display()
		{
			Node<E> n = head;
			while(n.next!=null)
			{
				System.out.println(n.element);
				n = n.next;
			}
			System.out.println(n.element);
		}


		public void printList() {
			Node<E> ptr = head;
			while (ptr != null) {
				System.out.println(ptr.element);
				ptr = ptr.next;

			}
		}

		public void remove(E item) {
			Node<E> ptr = head;
			Node<E> ptr2 = ptr;
			while (ptr != null && compare(ptr.element, item) != 0) {
				ptr2 = ptr;
				ptr = ptr.next;
			}
			if (ptr == null) {

				return;
			} else if (ptr == ptr2) {
				head = head.next;
			} else if (ptr.next == null) {
				ptr2.next = null;

			} else {
				ptr2.next = ptr.next;
			}
			this.counter--;
		}

		public boolean search(E element) {
			Node<E> ptr = head;
			while (ptr != null) {
				if (compare(ptr.element, element) == 0) {
					return true;
				}
				ptr = ptr.next;
			}
			return false;
		}

		public boolean isEmpty() {
			return counter == 0 ? true : false;
		}

		public int size() {
			return counter;
		}

		public int index(E item) {
			Node<E> ptr = head;
			int count = 0;
			while (ptr != null && compare(ptr.element, item) != 0) {
				ptr = ptr.next;
				count++;
			}
			if (ptr == null)
				return -1;
			return count;

		}

		public E pop() {
			Node<E> ptr = head;
			Node<E> ptr2 = ptr;
			while (ptr.next != null) {
				ptr2=ptr;
				ptr = ptr.next;
			}
			ptr2.next=null;
			Node<E> temp=ptr;
			if(ptr==head)
			{
				head=null;
			}
			counter--;
			return temp.element;
		}

		public E pop(int pos) {
			int count = 0;
			Node<E> ptr = head;
			Node<E> ptr2 = ptr;
			while (ptr != null && count < pos) {
				ptr2=ptr;
				ptr = ptr.next;
				count++;
			}
			Node<E> temp=ptr;
			
			if(count==0)
			{
				head=head.next;
				counter--;
			}
			else
			{
				ptr.next=ptr.next;
				counter--;
			}
			return temp.element;
		}
		
		

	}


