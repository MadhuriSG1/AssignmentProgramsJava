package com.bridgeit.functional;


public class PowerOfNoCmdArgument {
	 

	//atic Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	
		int num= Integer.parseInt(args[0]);

		if(num<31)
		{
		
         double ans =Math.pow(2,num);
         System.out.println(ans);
			
		}
		else
		{
			System.out.println("Enter number between 1 and 31");
		}

	}

}
