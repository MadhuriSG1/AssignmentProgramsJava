package com.bridgeit.dataStructure;

import com.bridgeit.utility.Utility1;

public class Prime_2DArray {

	public static void main(String[] args) {
		
		primeCalculate p=new primeCalculate();
		System.out.println("Enter lowest range number");
	      int lowest_Range=Utility1.ipnumber();//take lowest range
	      System.out.println("Enter highest range number");
	      int highest_Range=Utility1.ipnumber();//take highest range
	     System.out.println("\nPrime numbers:\n");
		p.primeCalArray(lowest_Range,highest_Range);//
		p.print();

	}

}
class primeCalculate{

	int[][] printArray=new int[50][40];
	int[] arr=new int[1000];
	int row=0,column=0,m=0,i;
    int start;//to store single prime number while partitioning

	void primeCalArray(int lowestRange,int highestRange)
	{

		for(i=lowestRange;i<highestRange;i++)
		{
			int flag=0;

			for(int j=2;j<i;j++)// This array for divide 
			{
				if(i%j==0 || i==0 || i==1)//condition true then not prime flag set to 1
				{
					flag=1;
					break;
				}
			}

			if(flag==0)//number is prime
			{
				arr[m]=i;//store prime number in array
				m++;

			}


		int z=0;
		for(column=0;column<10;column++)
		{


			for(row=0;row<25;row++)//partition range 000,100 not taken bcoz in this range only 25 prime number 
				                   //-so it switch automatic to column 0 to 1 
				                   //and 100,200 not taken bcoz if number found greater than 200 
				                  //it increase column and row becomes 0 so all no.s in this range in column 1 only
			{
				if(arr[z]==partitionRange(200,300) || arr[z]==partitionRange(300,400) || arr[z]==partitionRange(400,500) || arr[z]==partitionRange(500,600) || arr[z]==partitionRange(600,700) || arr[z]==partitionRange(700,800) || arr[z]==partitionRange(800,900) || arr[z]==partitionRange(900,1000) )

				{
					row=0;
                    column++;
				}                          
                              
				
				printArray[row][column]=arr[z];// taking value from singleD array to 2D Array
				z++;

			}
			
		}

		}

	}
	int partitionRange(int lowestRange,int highestRange)//calculate prime numbers between given range and return
	{
		for(int i=lowestRange;i<highestRange;i++)
		{
			int flag=0;
			if(i==0 || i==1)
			{
				flag=1;
			}

			for(int j=2;j<i;j++)
			{
				if(i%j==0 || i==0 || i==1)
				{
					flag=1;
					break;
				}
			}

			if(flag==0)
			{

				start=i;
				break;

			}

		}
		return start;
	}

	//for printing 
	void print()
	{
	
		for(row=0;row<25;row++)

		{


			for(column=0;column<10;column++)
			{

				if(printArray[row][column]==0)
				{
				break;
				}
				System.out.print(printArray[row][column]+"\t");

			}
			System.out.println();
		}
	}
}
