package com.bridgeit.dataStructure;

public class ListNodeForCalender<T> {
	public T data;
	public ListNodeForCalender<T> next;

	public ListNodeForCalender(T data2)//constructor of list node call when we make object of Listnode
	{
		this.data=data2;
		this.next=null;
	}

}
