package com.bridgeit.dataStructure;

public class MyLinkedList<T> {
	
	Node<T> head;
	Node<T> ptr;
	
	void add(String names)
	{
		String data = null;
		Node<T> next = null;
		Node<T> n = new Node(data,next);
		T string = (T) names;
		n.data =  string;
		n.next = null;
		if(head ==null)
		{
			head = n;
			ptr = n;
		}
		else
		{
			ptr.next = n;
			ptr = n;
		}
	}

	//*************************************************************************************************
	
	void display()
	{
		Node<T> n = head;
		while(n.next!=null)
		{
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}

	//*************************************************************************************************
	
	public boolean search(Node<T> head,T str) 
    { 
        Node<T> current = head;    //Initialize current 
        while (current != null) 
        { 
            if ((current.data).equals(str))                 
                return true;    //data found 
                current = current.next;        //Traversing node from head to last node
        } 
       
        return false;    //data not found 
    }

	//*************************************************************************************************
	
	public Object Delete(Node<T> head, int position) 
	{
		
	    if (head == null)
	    {
	        return null;
	    } 
	    else if (position == 0) 
	    {
	        return head.next;
	    } 
	    else 
	    {
	        Node<T> n = head;
	        for (int i = 0; i < position - 1; i++)
	        {
	            n = n.next;
	        }
	        n.next = n.next.next;
	        return head;
	    }
	}

	//*************************************************************************************************
	
	public int size() 
	{
		 Node<T> n = head;
		 int count=0;
		 while(n!=null)
		 {
			 count++;  //here count incremented by one till n.next=null
			 n = n.next;
		 }
		 return count;
	}
	
	//*************************************************************************************************
	
	public boolean isEmpty()
	{
	    if (head == null) 
	    {
	    	System.out.println("List is Empty");
	    	return true;	     
	    }
	    else
	      return false;
	  }
	
	//*************************************************************************************************
	
	public int indexOf(T str)
	{
	     int size = 1;
	    Node<T> current = head.next;
	    while (current != null) {
	        if (current.data.equals(str)) {
	            return size;
	        }
	        size++;
	        current = current.next;
	    }
	        return size;
	    
	}

	//*************************************************************************************************
	
	
	public void insert(String data, int index) 
	{
		
        if(checkIndex(index)) 
        { // Otherwise insert at correct index
            Node<T> newNode = new Node<T>((T) data,null);
         
            // Insert at front
            if (index == 0)
            {
                newNode.next = head;
                head = newNode;
   
            }
            else 
            { // Traverse the list to find insertion point
                int count = 1;
                
                // Create a reference to the node just before the insertion point
                Node<T> tmp = head;
                while(tmp.next != null && count < index) 
                {
                    tmp = tmp.next;
                    count++;
                }
                
                // Insert the node
                newNode.next = tmp.next;
                tmp.next = newNode;
            }
        }
    }

	private boolean checkIndex(int index) {
		// TODO Auto-generated method stub
		return true;
	}

	//*************************************************************************************************

	public void deleteLast()
	{
		 Node<T> start = head;
	        Node<T> prev = null;

	        if(start == null || start.next == null)
	        {
	            head = null;
	            return;
	        }
	        while (start.next != null)
	        {
	            prev = start;
	            start = start.next;
	        }
	        prev.next = null;
	}

	//*************************************************************************************************

	public void addInt(int numbers[])
	{
		
	}


}
