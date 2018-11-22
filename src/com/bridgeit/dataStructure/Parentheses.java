package com.bridgeit.dataStructure;

import com.bridgeit.utility.Utility1;

public class Parentheses {

	public static void main(String[] args) {
	
	
		System.out.println("Enter max size: ");
		int size=Utility1.ipnumber();

		/* Creating Stack */     
		StackClass stack = new StackClass (size); 
		System.out.println("Enter expression: ");
		String expression = Utility1.ipstring();  //take input string    
		System.out.println("Expression is= " +expression);
		
		int length = expression.length();//Calculate length of string  
		System.out.println("Result : ");

		for (int i = 0; i < length; i++)
		{    
		char ch = expression.charAt(i);

			if (ch == '(')
			{
			stack.push(i); //found '(' then push into stack 
			}
			else if (ch == ')')
			{
			stack.pop(i) ;//found ')' then pop from stack 
			} 
		}
		if (!stack.isEmpty() ) //if stack is empty it means expression is balanced
		{
		System.out.println("Unbalenced expression");
		}
		else
		{
			System.out.println("Balenced expression");
		}	
		
	}

}
