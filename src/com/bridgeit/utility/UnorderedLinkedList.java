package com.bridgeit.utility;

import java.util.Comparator;

import com.bridgeit.dataStructure.Node;

public class UnorderedLinkedList<E extends Comparable<E>> implements Comparator<E> {

	public int value = 0;
	public Node<E> start = null;
	public Node<E> end = null;

	private class Node<V> {
		public V element;
		public Node<V> next;
	}

	public UnorderedLinkedList() {

	}

	public void add(E element) {
		if (start == null) {//here we check start is null bcoz if start is null then 
			                       //element assign to start n start becomes end newly added element node becomes start 
			start = new Node<E>();
			start.element = element;
			start.next = null;
			end = start;
			value++;
			return;
		}
		Node<E> temp = new Node<E>();
		temp.element = element;
		temp.next = start;//
		start = temp;
		value++;
	}

	public boolean remove(E item) {
		Node<E> ptr = start;
		Node<E> ptr2 = ptr;
		while (ptr != null && compare(ptr.element, item) != 0) {//compare when both are not equal
			ptr2 = ptr;
			ptr = ptr.next;
		}
		if (ptr == null) {
			return false;
		} else {
			if (ptr.next == null) {
				end = ptr2;
			}
			ptr2.next = ptr.next;
			value--;
			return true;
		}
	}

	public boolean search(E item) {
		Node<E> ptr = start;
		Node<E> ptr2 = ptr;
		while (ptr != null && compare(ptr.element, item) != 0)
		{
			ptr2 = ptr;
			ptr = ptr.next;
		}

		if (ptr == null) {
			return false;
		} else {
			return true;
		}
	}

	public boolean isEmpty() {
		return value == 0 ? true : false;
	}

	public int size() {
		return value;
	}

	public void append(E item) {
		end.next = new Node<E>();
		end.next.element = item;
		end = end.next;
	}

	public int index(E item) {
		Node<E> ptr = start;
		Node<E> ptr2 = ptr;
		int index = 0;
		while (ptr != null && compare(ptr.element, item) != 0) {
			ptr2 = ptr;
			ptr = ptr.next;
			index++;
		}

		if (ptr == null) {
			return -1;
		} else {
			return index;
		}
	}

	public void insert(int index, E item) {
		int count = 0;
		Node<E> ptr = start;
		Node<E> ptr2 = start;
		while (count != index && ptr != null) {
			ptr2 = ptr;
			ptr = ptr.next;
		}
		if (ptr == null) {
			return;
		}
		Node<E> temp = new Node<E>();
		temp.element = item;
		ptr2.next = temp;
		temp.next = ptr;
	}

	public E pop() {
		Node<E> ptr = start;
		while (ptr.next.next != null) {
			ptr = ptr.next;
		}
		Node<E> temp = end;
		end = ptr;
		return temp.element;

	}

	public E pop(int index) {
		int count = 0;
		Node<E> ptr = start;
		Node<E> ptr2 = ptr;
		while (ptr != null && count < index) {
			ptr2 = ptr;
			ptr = ptr.next;
			count++;
		}
		
		if(count==0)
		{
			start=start.next;
			value--;
		}
		
		else if (ptr == null) {
			return null;
		}
		else
		{
			ptr.next=ptr.next;
			value--;
		}
		return ptr.element;
	}
	
	void display()
	{
		Node<E> n = start;
		while(n.next!=null)
		{
			System.out.println(n.element);
			n = n.next;
		}
		System.out.println(n.element);
	}

	@Override
	public int compare(E o1, E o2) {
				return o1.compareTo(o2);
	}

}
