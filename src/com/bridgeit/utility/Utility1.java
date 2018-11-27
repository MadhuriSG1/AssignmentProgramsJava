package com.bridgeit.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;

import com.bridgeit.dataStructure.OrderedLinkedList;

/*import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;*/

import com.bridgeit.dataStructure.QueqeClass;
import com.bridgeit.dataStructure.QueqeUsingLinkedLCalender;
import com.bridgeit.dataStructure.QueueUsingLinkedListPrime;
import com.bridgeit.oops.QueueLinkedList;

public class Utility1 {
	
	static Scanner scanner=new Scanner(System.in);
	private static int i;
    private static int totalnotes=0;
	
	
	public static int ipnumber()
	{
		//scanner.close();
		return scanner.nextInt();
		
		}
	
	public static String ipstring()
	{
		return scanner.next();
		
	}
	
	public static String inputStringLine() 
	 {
		 try 
		 {
			 return scanner.nextLine();
		 }
		 catch(Exception e) 
		 {
			 System.out.println(e.toString());
		 }
		 return null;
	 }
	
	public float floatInput() 
	{
		try 
		{
			return scanner.nextFloat();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		return 0.0f;
	}
	
	public static long iplongnumber()
	{
		return scanner.nextLong();
	}
	
	public static double ipdoublenumber()
	{
		return scanner.nextDouble();
	}
	
	public static boolean ipBoolean()
	{
		return scanner.nextBoolean();
	}
	
	
	public static int[] ipArray(int n) 
	{
		int Array[] = new int[n];
		System.out.println("Enter your array");
		for (int i = 0; i < n; i++) {

			Array[i] = ipnumber();
		}
		return Array;
	}

	
//(1)String Replace
 
	/**
	 * @author MadhuriG
	 * newname is user entered string to replace
	 * logic is replace <username> with newname
	 */
	public static void replaceString() {
		
		String username = "<user name>";
        System.out.println("Enter username to replace");
		String newname = ipstring();
		
		username =username.replaceAll(username, newname);//replace username with newname
		try 
		{
		    Integer.parseInt(username);		//taking string into integer
			System.out.println("inValid input use only string");
		} 
		catch (NumberFormatException e) 
		{
			if(newname.length()>=3)//for validation and display string
			{
			System.out.println("\"hello " + username + " , How are you?\"");
		    }
	
		else
		{
			System.out.println("Username has minimun 3 characters");
		}
	   }
	}
	
	//(2) Flip Coin Function
	/**
	 * Function Prints the percentage of Heads and Tails
	 * @param times enter by user to how many times he wants to flip coin
	 * @param noofHeads to count the number of Heads
     * @param percentageofHeads to store the percentage of Heads
	 * @param percentageofTails to store the percentage of Tails 
	 */
	public static void flipCoin(int times) 
	{
		double noofHeads = 0;
		double noofTails = 0;
		if(times>0)
		{
		for(int i=0;i<times;i++) 
		{
			if(Math.random()<0.5) // random function generate value 0.0 to 0.9
				//if condition is true no. of heads increament by 1
			{
				noofHeads++;
			}
			else
			{
				noofTails++;
			}
			
		}
		System.out.println("Total numbers of Heads = "+noofHeads);
		System.out.println("Total numbers of Tails = "+noofTails);
		//calculating % of heads and tails
		double percentageofHeads=((noofHeads/times)*100);
		double percentageofTails=(100-percentageofHeads);
		//printing the percentage of heads and tails
		System.out.println("The percentage of heads : "+percentageofHeads);
		System.out.println("The percentage of Tails : "+percentageofTails);
		}
		else
		{
			System.out.println("Please Enter Positive number");
		}
		
		
		
		
		
	}
	
	
//(3)LeapYear
	/**
	 * @author MadhuriG
	 * function Determine year is a Leap Year or Not.
	 * @param year entered by user to check its leap year not
	 */
	public static void leapYear(int year)
	{

          boolean leap = false;
          if(year>999&&year<9999) //for validation
          {
        	  if(year % 4 == 0)   //if year divided by 4 and not divided by 100 then its leap year
        	  {
        		  if( year % 100 == 0)  //if its divided by 100 then it divided by 400 then only its leap year
        		  {
        			  if ( year % 400 == 0)
        			  {
        				  leap = true;
        			  }
        			  else
        			  {
        				  leap = false;
                      }
        		  }
        	    else
        		  {
        			  leap = true;
        		  }
              }
           else
        	  {
        		  leap = false;
        	  }

        if(leap)
        {
            System.out.println(year + " is a leap year.");
        }
        else
        {
            System.out.println(year + " is not a leap year.");
        }
}
		 
else
		 {
			 System.out.println("Enter 4 digit number");
		 }

}

//(4)Power Of Number
	/**
	 * @function to find power of given number
	 * @param number enter from user to find power 
	 */
	public static void powerOfNumber(int number)
	{
		if(number>=0 && number<31)
		{
		int power = 1;
		for (int i = 1; i <= number; i++)//
		{
			power = power * 2;				
			System.out.println("2^" + i + "=" + power);
		}
	    }
		
		else
		{
			System.out.println("Please Enter number less than 31 greater than or equal to zero");
		}
     }

	
// [5] Harmonic
		/**
		 * @function is to find harmonic number of given number
		 * @param number enter by user to find harmonic number
		 */
			 
			 
		public static int harmonicValue(int number) {
			double num = 0.0;
			if(number>0)
			{
				
			for (int i = 1; i <= number; i++)
			{
				num = num + (1.0 / i);
			}
			System.out.println("harmonic value is:" + num);
			}
			else
			{
				System.out.println("Ensure number greater than zero");
			}
			return number;
		}

		
// [6] PrimeFactor
		
		/**
		 * @author MadhuriG
		 * @function Number to find the prime factors
		 * @param number enter by user to find prime factors
		 */
		public static void primeFact(int number) {
			
			if(number>1)
			{
			System.out.println("Prime factors are=");
			for(int i=2;number>1;i++)
			{
	//if remainder 0 then print i and divide no. by i then increament i
				while(number%i==0)
				{
					System.out.println(i);
					number=number/i;
				}
				
			}
			}
			else
			{
				System.out.println("Please enter number greater than 1");
			}
		

		}
		
//(7)Gambler 		
		/**
		 * @auther MadhuriG
		 * @function Play gambler and Print Number of Wins and Percentage of Win and Loss.
		 * @param stake is balance before play game
		 * @param goal is balance we wants to achieve
		 * @param noofTimes 
		 */
		public static void gamblerOutcome(int stake,int goal,int noofTimes) 
		{
			float win = 0;
			int broke = 0;
			for(int i=0;i<noofTimes;i++)
			{
				//int Stake=stake;
				boolean flag = true;
				while(flag) 
				{
					double no = Math.random();
					if(no<0.5) 
					{
						stake++;
						if(stake==goal) 
						{
							win++;
							System.out.println("Congratulations..! You won the game.");
							System.out.println("You reached your goal of "+goal+"\n");
							flag=false;
						}
					}
					else 
					{
						stake--;
						if(stake==broke) 
						{
							System.out.println("Unfortunalitly you lost the game.");
							System.out.println("your stake is "+stake+"\n");
							flag = false;
						}
					}
				}
				System.out.println("stake : "+stake);
				System.out.println("goal : "+goal);
			}
			
			System.out.println("Total wins "+win);
			
			//calculating winnig and losing percentage
			float winningPercentage = (win/noofTimes)*100;
			float lossingPercentage = 100-winningPercentage;
			
			//printing the winning and lossing percentage
			System.out.println("Winning percentage : "+winningPercentage);
			System.out.println("Losing percentage : "+lossingPercentage);
			
		}
		
		
//(8) Coupon Generation
		
		/**
		 * @function how many random numbers do you
                     need to generate distinct coupon number
		 * @param num is distinct coupon number
		 * @return count is number of times you need random function
		 */
		public static int generationOfCoupon(int num) {
						
			boolean[] b = new boolean[num];       //Taking array of boolean type
			int f = 0;
			int count = 0;
			while (f < num) {
				int value = (int) (Math.random() * num); //here we get coupon number
				//System.out.println("value "+value);

				count++;
				if (!b[value])//if condition is true b[value]=true and print value
				{             
					f++;
					b[value] = true;   
					System.out.println(value); //
				}
			}
			return count;
			
		}
		
		
//(9)Array2Diamensional
		
		/**
		 * @author MadhuriG
		 * @function Print 2D array
		 * @param row is numbers of rows
		 * @param column is numbers of columns
		 */
		public static void array2DUT(int row,int column)
		{
			int x[][] = new int[row][column];
			System.out.println("enter the value of 2D array");
			for (int i = 0; i < row; i++) 
			{			//loop for row
				for (int j = 0; j < column; j++) 
				{	//loop for column
					x[i][j] = ipnumber();//taking input numbers from user
				}
			}
			System.out.println("2D array in matrix are");
			for (int i = 0; i < row; i++)
			{
				for (int j = 0; j < column; j++) 
				{
					System.out.print(x[i][j] + " "); //print array elements

				}
				System.out.println();//
			}
			
		}
		
		
//(10)Triplets
	
		/**
		 * 
		 * @param array input array entered by user 
		 * @param n length of array
		 */
		public static void numSumToZero(int[] array, int n) {
			int f = 0;
			for (int i = 0; i < n - 2; i++) {				//checking till n-2
				for (int j = i + 1; j < n - 1; j++) {		//till n-1
					for (int k = j + 1; k < n; k++) {		//till n
						if (array[i] + array[j] + array[k] == 0)//if true then triplets
						{
							System.out.println("Triplet is " + array[i] + " " + array[j] + " " + array[k]);
							f++;
						}
					}
				}
			}
			if (f == 0) {
				System.out.println("There are no Triplets in this");
			}
		}
		
//(11)Distance
		
		/**
		 * function prints the eculidean distance from (x,y) to (0,0)
		 * 
		 * @param xRaiseToX to store the x raise to x value
		 * @param yRaiseToY to store the y raise to y value
		 * @param sum to store the sum of x^x and y^y
		 */
		 
		public static void euclideanDistance(int x,int y)
		{
			//finding the power of x and y
			double xRaiseToX = Math.pow(x,x);
			double yRaiseToY = Math.pow(y,y);
			double sum = xRaiseToX + yRaiseToY;
			
			//finding the euclidean distance
			double euclideanDistance = Math.sqrt(sum);//By using formula
			
			//printing the distance 
			System.out.print("The euclidean distance from the point ("+x+","+y+") to the origin (0, 0) : "+euclideanDistance);

			
		}
		
		
//(12) Permutation of String
		
		/**
		 * @function is used for permutation of given string
		 * @param str enter by the user to do permutation
		 * @param l left (0) index of the string
		 * @param r right (length-1) index of string
		 */
		public static void permutationOfString(String str, int l, int r)
		{
			if (l == r) 
			{				//left and right of string equal then print
				System.out.println(str);

			} else 
			{
				for (int i = l; i <= r; i++)                                                                 
				{
					str = swap1(str, l, i);
					permutationOfString(str, l + 1, r);//increament left by 1 and call method again
					str = swap1(str, l, i);//backtracking
				}
			}
		}
		

		public static String swap1(String a, int i, int j)//swap and return swap string
		{           
			char temp;
			String str11 = "";
			char[] charArray = a.toCharArray();
			temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
			for (int k = 0; k < charArray.length; k++)
				str11 = str11 + charArray[k];
			return str11;
		}
		
//(13) StopWatch
		
		/**
		 * function acts as a stop watch when user press 1 the stop watch starts 
		 * and when user press 2 the stop watch stops.
		 * at the end the elapsed time is calculated and printed to the console.
		 */
		
		public static void stopWatch() 
		{
			long startTime=0;
			long stopTime=0;
			boolean flag = true;
			//Scanner scanner = new Scanner(System.in);
			
			while(true)
			{
				System.out.print("Press 1 to start the stop watch :");
				int start = Utility1.ipnumber();
				if(start==1) 
				{
					startTime = System.currentTimeMillis();
					System.out.println("start time : "+startTime);
					System.out.println("stop watch started :  ");
					boolean flag2 = true;
					while(flag2) 
					{
						System.out.print("Press 2 To stop the watch : ");
						int stop=Utility1.ipnumber();
						
						
						if(stop==2) 
						{
							stopTime = System.currentTimeMillis();
							System.out.println("stop time : "+stopTime);
							flag2=false;
						}
						
					}
					System.out.println("Elapsed time : "+(stopTime-startTime)+" ms");
					flag=false;
				}
				
			}
		}
		

//(15)QuadraticEqu
		/**
		 * @author MadhuriG
		 * @function find the roots of equation
		 * @param a,b,c are input numbers
		 */
		public static void quadraticRoot(int a, int b, int c) {
			
            double delta=(b*b)-(4*a*c);
			int FirstRoot=(int) ((-b+Math.sqrt(delta))/2*a);
			int SecondRoot=(int) ((-b-Math.sqrt(delta))/2*a);
			System.out.println("First square root is=  " +FirstRoot );
			System.out.println("Second square root is=  " +SecondRoot);
		}

//(16)WindChill
		/**
		 * @function is to calculate effective windchill temperature
		 * @param t is temperature entered by user
		 * @param v is wind speed entered by user
		 */
		public static void windchillMethod(int t, int v) {
			
			double power=Math.pow(v,0.18 );
			double wc = 35.74 + (0.6215 * t) + ((0.4275 * t) - 35.75) * power;
			System.out.println("WInd speed is= " + wc);
		}

//----------------------------------------Algorithm---------------------------------------
		
//(1)Anagram		
		
		/**
		 * @author MadhuriG
		 * @function The Two Strings are Anagram or not....
		 * @param str1 enter by user 
		 * @param str2 enter by user only
		 */
		public static void isAnagram(String string1, String string2) {
			
			string1=string1.toUpperCase();
			string2=string2.toUpperCase();
			char[] stringarray1=string1.toCharArray();
			char[] stringarray2=string2.toCharArray();
			Arrays.sort(stringarray1);    //Sort is method of util.Arrays Class
			Arrays.sort(stringarray2);
		/*Return true if both character array equals*/
			if(Arrays.equals(stringarray1, stringarray2))
			{
				System.out.println(string1 +" "+string2+" is anagram");
			}
			else
			{
				System.out.println(string1 +" "+string2+" is not anagram");
			}
		}


//(2)PrimeNumber
		
		/**
		 * @author MadhuriG
		 * @function Find the Prime numbers in 1 to 1000 range.
		 * @return
		 */
		public static int primeNumbers() 
		{
			int x, i, f;
			System.out.println("Prime Number List = ");
			for (x = 1; x <= 1000; x++)
			{		//x will rotate for 1000 times because we have to find prime Numbers 1 to 1000
				f = 0;

				for (i = 2; i < x; i++)
				{		//i will rotate for x times
					if (x % i == 0) 
					{

						f = 1;
						break;
					}
				}
				if (x == i) {
					System.out.print(x + "\t");
					int[] newArray = new int[x];
				}

			}
			return 0;
		}

		/**
		 * @author MadhuriG
		 * @function find prime number from given range
		 * @param l minimum range to find prime number
		 * @param r maximum range to find prime number
		 * @param k length of array
		 */
		public static  void genPrime(int l,int r)
		 {
		   int flag=0,i=0,j=0,k=0;

		   System.out.print("Prime Numbers Between "+l+" and "+r+":\n");
		   int array[] = new int[r-l];


		   for(i=2;i<=r;i++)
		   {
		     for(j=2;j < i; j++)
		     {
		       flag=0;
		       if( i % j == 0 )
		         {
		           flag=1;
		           break;
		         }
		     }
		     if(flag ==0 )
		       {
		         if(i!=0 || i!=1)
		         {
		           System.out.print(i+" ");//print prime numbers
		           array[k] = i;//Prime numbers stored in array
		           checkPalindrome(i); //call checkPalindrome method 
		           System.out.println("");
		           k++;
		         }
		       }

		   }
		 
		 checkAnagram(array,k);

		 }

		/**
		 * @function check anagram from given prime numbers of array
		 * @param arr input array 
		 * @param len is length of array
		 */
		public static void checkAnagram(int arr[],int len)
		{
		 String str,str1;
		 String brr[] = new String[len]; int flag = 0;
		 for(int i=0;i<len;i++)
		   {
		 
		     str=Integer.toString(arr[i]);
		     char c[] = str.toCharArray();
		     Arrays.sort(c);
		     str1 = String.valueOf(c); //Character array converted into string and stored in brr
		     brr[i] = str1;    //brr is sorted array            

		   }
		   System.out.println("\nThe Anagrams are");
		   
		 for(int i=0;i<len;i++)
		 {
		   for(int j=i+1;j<len;j++)
		   {
			  
		     if(brr[i].equals(brr[j]))  //here brr array is sorted thats why we cant print
		     {
		       System.out.println(arr[i]+"---"+arr[j]);//Printing i & j that is anagram
		      flag = 1;
		     }
		   }
		 }
		 if(flag==0)
		 {
		   System.out.println(" None");
		 }
		}


		/**
		 
		     str=Integer.toString(arr[i]);
		     char c[] = str.toCharArray();
		     Arrays.sort(c);
		     str1 = String.valueOf(c); //Character array converted into string and stored in brr
		     brr[i] = str1;                

		   
		 * @function check input number is prime or not 
		 * @param num is prime number to check palindrome or not
		 */
		static void checkPalindrome(int num)
		{

		 int rev=0,temp,rem=0;
		 temp=num;

		 
		 if(num>9);
		 {
		   while(temp>0)
		   {
		     rem=temp%10;//Getting reverse of number
		     rev = rev*10+rem;//Shifting digits 
		     temp=temp/10;//Dividing number by 10 to calculate reverse
		   }
		 
		   if(rev == num)//Compare original number with reverse number
		   {
		     System.out.print(" is a palindrome");
		   }
		 }
		 

		 }
		
// Binary Search the Word from Word List
		/**
		 * 
		 * @author MadhuriG
		 * @param filepath is path where string stored
		 * @return
		 */
		public static String[] stringFileBinary(String filepath)
		{
			String word[]= {};
			ArrayList<String> list=new ArrayList<String>();
			String line, temp[]= {};
			BufferedReader br;
			FileReader fr;
		
			try
			{
				fr=new FileReader(filepath);
				br=new BufferedReader(fr);
		//Read file and split by space and stored in temp String array			
				while((line=br.readLine())!=null)
				{
					temp=line.split(" ");
				}
		//temp String array	stored in ArrayList			
				for(int i=0;i<temp.length;i++)
				{
					list.add(temp[i]);
				}
			//Arraylist converted into String array word and return 
			word=list.toArray(new String[list.size()]);
			br.close();
			}
			catch(Exception e) {}
			return word;
		}

//4 (Static Methods)		
//*******************Static Methods*****************

/**
 * @author MadhuriG
 * @function InsertionSort method for String
 * @param input is String array to do insertion sort
 * @param data is length
 * @return
 */
public static String[] insertionsort(String[] input, int length) {
int i, j;
String key;
System.out.println(Arrays.toString(input));
for (j = 1; j < length; j++) 
{
	key = input[j];
	i = j - 1; //i=0 and j=1
	while (i >= 0) 
	{
		//if key is greater then break otherwise swap till i=0
		if (key.compareTo(input[i]) > 0) 
		{
			break;
		}
		input[i + 1] = input[i];
		i--;
	}
	input[i + 1] = key;
	System.out.println(Arrays.toString(input));
}
return input;
}

	

/**
 * @author MadhuriG
 * @function InsertionSort method for integer
 * @param input is array entered by user to sort
 * @param len is array length
 * @return
 */
public static int[] insertionsort(int[] input, int len) {
int i, j;
int key;
System.out.println(Arrays.toString(input));
for (j = 1; j < len; j++)
{
	key = input[j];
	i = j - 1;//i=0 and j=1
	while (i >= 0)
	{
		//if key is greater then break otherwise swap till i=0
		if (key > input[i]) 
		{
			break;
		}
		input[i + 1] = input[i];
		i--;
	}
	input[i + 1] = key;
	System.out.println(Arrays.toString(input));
}
return input;
}


/**
 * @author MadhuriG
 * @function BinarySearch method for Integer
 * @param array is stored integer array
 * @param number is integer you wants to search
 * @return
 */
public static boolean binarysearchInt(int[] array, int number) {
	Arrays.sort(array);
int upper = array.length;
int lower = 0;
int middle = (lower + upper) / 2;
for (int i = 0; i < array.length; i++)
{
	//searching number is greater than middle word
	if (number > array[middle]) 
	{
		lower = middle;//Updating index for calculating middlle
	}
	//searching number is less than middle word
	else if (number < array[middle]) 
	{
		upper = middle;
	}
	//if both equal number found
	else if (number == array[middle])
	{
		return true;
	} 
	//calculate middle after updating index 
	middle = (lower + upper) / 2;

	
	
}
return false;

}


/**
 * @author MadhuriG
 * @function
 * @param words Array of Stored words
 * @param search word we have to found
 * @return boolean value of word found or not
 */
public static boolean binarysearchStr(String[] words, String search)
{
	Arrays.sort(words);//sort words string array
int upper = words.length; 								
int lower = 0;
int middle = (upper + lower) / 2;

for (int i = 0; i < words.length; i++) 
{

	//searching word is greater than middle word
	if ((search.compareTo(words[middle])) > 0 )
	{
		lower = middle;
	} 
	//searching word is less than middle word
	else if ((search.compareTo(words[middle])) < 0)
	{
		upper = middle;
	}
	//if both equal word found
	else if(search.equals(words[middle])) 
	{
		return true;
	} 
  //calculate middle after updating index 
		middle = (upper + lower) / 2;

}
return false;
}



//(8) BubbleSortOfInteger
		/**
		 * @author MadhuriG
		 * @function BubbleSort method for integer"
		 * @param len array length taken from user
		 * Last index is sorted each time so j execute till len-i-1
		 */
		public static void bubbleSortUti(int len)
		{
			int i,j;
			
			int array[]=new int[len];
			int temp=array[0];
			System.out.println("Enter Number In An Array");
			for(i=0;i<len;i++)
			{
				array[i]=Utility1.ipnumber();
			}
			
			for(i=0;i<len;i++)
			{
				for(j=0;j<len-i-1;j++)        
				{
		//if number at j index grater than j+1 index then swap numbers
					if(array[j]>array[j+1]) 
					{
						temp=array[j];
						array[j]=array[j+1];
						array[j+1]=temp;
					}
				}
			}
			
			System.out.println("Sorted numbers of list by using bubble sort is=");
			for(i=0;i<len;i++)
			{
				System.out.println(array[i]); //Display sorted array
			}
			
		}


		/**
		 * @author MadhuriG
		 * @function BubbleSort method for String
		 * @param len is array length
		 */
		public static void bubbleSortStringUti(int len)
		{
			
			int i,j;
			String str[]=new String[len];
			String temp=str[0];
			System.out.println("Enter String ");
			for(i=0;i<len;i++)
			{
				str[i]=Utility1.ipstring();
			}
			
			for(i=0;i<len;i++)
			{
				for(j=0;j<len-i-1;j++)
				{
					if(str[j].compareTo(str[j+1])>0)
					{
						temp=str[j];
						str[j]=str[j+1];
						str[j+1]=temp;
					}
				}			
		    }
			
			System.out.println("Sorted String By Using Bubble Sort");
			for(i=0;i<len;i++)
			{
				System.out.println(str[i]);
			}
			
			
		}
		
//(5)Find Number
		 /**
		 * @author MadhuriG
		 * @function Find your number from list of given number
		 * @param lower 0th position of element of given numbers
		 * @param upper is last position of element position of element of given numbers
		 * @param mid is middle position element  of given numbers
		 * @param count is variable used to compare with number
		 * @param number entered by user which is power of 2 so it will print till that number
		 * @return
		 */
		public static int findNumber(int lower,int upper,int mid,int count,int number,int No)
         {
           
                 String value=null;
                 
                 System.out.println("Is your number:"+mid);
		         System.out.println();
                 System.out.println("Enter if your answer is yes or low or high ");
                 value=Utility1.ipstring(); 
               //take input from user yes, low or high and check
          
             do{
        	  
                    if (value.equals("high"))
                    {
                      lower= mid;//update index
		              count++; 
                    }
                   else if (value.equals("yes"))
                    {
		              System.out.println("The number you thought was: "+mid);
		              int no=count+1;
		              System.out.println("It takes "+no+" times to find your exact number");
		              break;
                    }
                   else if(value.equals("low"))
                    {
		              upper=mid; //update index
		              count++;
                    } 
                 
                    if(count<number)
                   {
                    //calculate mid after updating index	
				     mid=(lower+ upper)/2;
				     System.out.println("Is your number "+mid+":");
				     value=scanner.next();
			       }
                    
		      }while(lower<=upper);//Check till lower less than or equal to upper
                  
			if (count<=No)
			{
				System.out.println("Number not found");
			}
			else
			{
				System.exit(0);
			}
     return 0;
		
         }   
	
		

//(9)Merge Sort

				/**
				 * 
				 * @author MadhuriG
				 * @function Sorting array elements by using merge sort
				 * @param arr is array given by user
				 * @param l left most element of array
				 * @param r right most element of array
				 */
				public static void sortMerge(int[] arr, int l, int r) {
					if(l<r)
					{
						int m=l+r/2;  //Find the middle 
						// Sort first and second half
						sortMerge(arr, l, m);             
						sortMerge(arr , m+1, r);    //recursion till elements remains only one in array
				         
				     	merge(arr, l, m, r);        // Merge the sorted half

					}
					
				}

			public static void merge(int[] arr, int l, int m, int r) {
				
					 int n1 = m - l + 1;          //Find size of temp array to merge
				     int n2 = r - m;
				     
				     //Create temp arrays 
				        int L[] = new int [n1];
				        int R[] = new int [n2];
				        
				    //Copy data to temp arrays
				        for (int i=0; i<n1; ++i)//Preincrement
				            L[i] = arr[l + i];//arr[0+1]
				        for (int j=0; j<n2; ++j)
				            R[j] = arr[m + 1+ j];
				        

				    //Merge the temp arrays 
				 
				        int i = 0, j = 0;      //Initial indexes of first and second subarrays
				        int k = l;             // Initial index of merged subarry array
				        while (i < n1 && j < n2)
				        {
				            if (L[i] <= R[j])
				            {
				                arr[k] = L[i];
				                i++;
				            }
				            else
				            {
				                arr[k] = R[j];
				                j++;
				            }
				            k++;
				        }
				 
				         while (i < n1)//for remaining elements
				        {
				            arr[k] = L[i];
				            i++;
				            k++;
				        }
				 
				        while (j < n2)
				        {
				            arr[k] = R[j];
				            j++;
				            k++;
				        }
			}
//(10)	Vending Machine	
				/**
				 * @author MadhuriG
				 * @function Find the Fewest Notes to be returned for Vending Machine
				 * @param money entered by user to calculate minimum numbers of notes
				 * @param notes is array storing types of notes
				 * @return
				 */
				public static int calculateNotes(int money,int[] notes)
			  	{
					int rem;
			  	    if(money==0)  //To stop recursion
			 		{
			 			return -1 ;
			 		}
			 		else
			 		{
			 			if(money>=notes[i])
			 			{
			 				// logic for Calculating The notes
			 				int calNotes =money/notes[i];
			 				
			 				rem = money%notes[i];
			 				money =rem;
			 				System.out.println(notes[i]+   " Notes ---> " +calNotes );
			 			    totalnotes = totalnotes+calNotes;
			 			}
			 			i++;
			 			return calculateNotes(money, notes);
			 			
			 		}
			  	}
				
				/**
				 * This method shows total number of notes calculated
				 */
				public static void showTotalNotes(){
					System.out.println("Total number of notes= "+totalnotes);
				}
//(11)DayOfWeekForDate		
		

		/**
		 * @author MadhuriG
		 * @function find Day of week
		 * @param d date entered by user
		 * @param m month entered by user
		 * @param y year entered by user 
		 * @return d0 returns value between 0 to 6
		 */
		public int dayOfWeekUti(int d, int m, int y) {
			int y0 = y - (14 - m) / 12;
			int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
			int m0 = m + 12 * ((14 - m) / 12) - 2;
			int d0 = (d + x + 31 * m0 / 12) % 7;   
	// d0 returns value between 0 to 6
			return d0;                                    
		
		}

		
//(12)TemperatureConversion		

		
		/**
		 * @author MadhuriG
		 * @function Convert temperature Fahrenheit to Celsius and Celsius to Fahrenheit
		 */
		public static  void tempConversionUti() 
		{
			int choice;
			int F = 0;
			int C=0;
	
			do
			{
			
			System.out.println(" 1 to convert into Fahrenheit ");
			System.out.println(" 2 to convert into Celsius");
			System.out.println("Enter Choice");
			choice=Utility1.ipnumber();
			
			switch (choice) {
			case 1:
				System.out.println("Enter temperature in Celsius");
				//taking temperature in Celsius from user
				int tempcel=Utility1.ipnumber();
				F = (tempcel * 9 / 5) + 32;
				System.out.println("Celsius to Fahrenheit:= "+F);
				break;
				
			case 2:
				System.out.println("Enter temperature in Fahrenheit");
				//taking temperature in Fahrenheit from user
				int tempinfahren=Utility1.ipnumber();
				C= (tempinfahren - 32) * 5 / 9;
				System.out.println("Fahrenheit to Celsius:= "+C);
				break;


			default:
				System.out.println("Invalid choice");
				break;
			}
			
		
			}
			while(true);
			
		}

//(13)MonthlyPayment
		


		/**
		 * @author MadhuriG
		 * @function calculates the monthly payments you
                     would have to make over Y years to pay off a P principal loan amount at R per cent
                     interest compounded monthly.
		 * @param P  loan enter by user
		 * @param Y year enter by user 
		 * @param R rate of interest enter by user compounded monthly
		 * @param payment is final output that monthly should pay
		 */
		public static void monthlyPayment(double P, double Y, double R) {
			double n;
			double r;
			double payment;
			n = 12 * Y;
			r = R / (12 * 100);
			payment = (P * r) / (1 - (Math.pow((1 + r), (-n))));
			System.out.println("MOnthly payment you have =" + payment);
			
		}
		
		
//(14)SqrtOfNonNegative
				
				/**
				 * @param n is input given by user
				 * @return t  gives output that is Square Root of number 
				 */
	public static void squareRootOfNum(int n) {
		
				    if(n>0)
				    {
					double t = n;
					double epsilon = 1e-15;
					while (Math.abs(t - n / t) > epsilon * t) {
						t = (n / t + t) / 2.0;      //average of n/t and t
					}

					   System.out.println(t);
				    }
				    else
				    {
				    	System.out.println("Please Enter Positive Number");
				    }
					
					
				}

//(15)DecimalToBinary
		/**
		 * @author MadhuriG
		 * @function Decimal to Binary conversion
		 * @param num number entered by user to convert into binary
		 * @return binary value
		 */
		public static String binaryConversion(int num) {
			String string1="";//for storing remainder
			String string2="";//Reverse string1 and then stored in string2
			int remainder;
			while(num>0)
			{
				remainder=num%2;
	            string1=string1+""+remainder;
			    num=num/2;
			}	
			//Reverse string1 and then stored in string2
			for(int i=string1.length()-1;i>=0;i--)
			{
				string2=string2+string1.charAt(i);
			}
			//for adding zero before binary number
			for(int j=string2.length();j<8-string2.length();j++)
			{
				string2="0"+string2;
			}
			/*Print string and retuen string*/
			System.out.println(string2);
			
			return string2;
			
	}
		
//(16)Binary With Nibble Swap 	
		/**
		 * @function Swap nibbles and find the new number.
		 * @param number user input  for swapping nibbles
		 * @return integer number after swapping the nibbles
		 */
		public static int swapNibbles(int number)
		{
		    return ((number & 0x0F) << 4 | (number & 0xF0) >> 4);
		}

		/**
		 * @function- finds given number is power of 2 or not
		 * @param number is input here coming from swapnibbles function
		 * @return boolean value that input number is power of 2 or not
		 */
		public static boolean isPowerOfTwo(int number) {

		    if (number % 2 != 0) 
		    {
		      return false;
		    } 
		    else 
		    {
		    	for (int i = 0; i <= number; i++) 
		      {
		   //if condition true then it is power of 2
		        if (Math.pow(2, i) == number) 
		        	return true;
		        break;
		      }
		    }
		    return false;
		  }
		

		
//-----------------------------------------Data Structure-----------------------------------------
		
//[1]UnorderedList		
		
	 /**
	 * @author MadhuriG
	 * @function Read the Text from a file, split it into words and arrange it as Linked List.
	 *           If the Word is not found then add it to the list, and 
	 *           if it found then remove the word from the List.
	 */
	public static void unorderedListUti() {
		
			try
			{
				File f=new File("WordsList.txt");
				
				if(!f.exists())
				{
					System.out.println("WordsList.txt File is not found");
				}
				
				FileReader fr=new FileReader(f);//Creates File instance and passing file path
				BufferedReader br=new BufferedReader(fr);//Read input file and create character strea
				
				
				String str = "";
				String data = "";
				
				while((str=br.readLine())!=null)   //read from file and stored in string data
				{
					data=data+str;
				}
				String x[]=data.split(" ");   //By using split function split array and stored in string array
				
				UnorderedLinkedList<String> li=new UnorderedLinkedList<>();
				for(int i=0;i<x.length;i++)
				{
					li.add(x[i]);                //Stored string in linkedlist
					
				}
				
				/*Iterator<String> itr=li.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());  //iterate linkedlist for display
				}
				*/
				System.out.println("Enter word for searching in list");
				String S_word=ipstring();
				if(li.search(S_word))
				{
					li.remove(S_word);
				}
				else
				{
					li.add(S_word);
				}
				
				System.out.println("Data after operation");
				/*Iterator<String> itrator=li.iterator();
				while(itrator.hasNext())
				{
					System.out.println(itrator.next());
				}*/
				
				System.out.println("Size of List is= "+li.size());
			
				li.display();
				/*System.out.println("Enter List element to find index");
				String item=ipstring();
				int k=li.indexOf(item);
				System.out.println("Index of list element is=  "+k);
				*/
			}
			catch(Exception e)
			{
				System.out.println("error= "+e);
			}
		}
		
	////////////////////////////
	/*public void UnorderedListSearching(String search)
	{
		try {
		UnorderedLinkedList<String> list=new UnorderedLinkedList<String>();
		FileInputStream fis=new FileInputStream("/home/administrator/Desktop/SearchString.txt");
		Scanner sc=new Scanner(fis);
		while(sc.hasNext())
		{
		list.add(sc.next());
		}
		boolean b=list.search(search);
		if(!b)
		{
			list.add(search);
		}
		else
		{
			list.remove(search);
		}
		FileOutputStream fos=new FileOutputStream("/home/administrator/Desktop/SearchString.txt");
		while(!list.isEmpty())
		{
			fos.write((list.pop(0)+" ").getBytes());
		}
		sc.close();
		fis.close();
		fos.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
*/
	public static void orderedListSearching(int search)
	{
		try {
			OrderedLinkedList<Integer> list=new OrderedLinkedList<Integer>();
			FileInputStream fis=new FileInputStream("/home/bridgelabz/Desktop/Workspace/BasicPrograms/NoList.txt");
			Scanner sc=new Scanner(fis);
			while(sc.hasNext())
			{
			list.add(Integer.parseInt(sc.next()));
			}
			
			boolean b=list.search(search);

			if(!b)
			{
				list.add(search);
			}
			else
			{
				list.remove(search);
			}
			FileOutputStream fos=new FileOutputStream("/home/bridgelabz/Desktop/Workspace/BasicPrograms/NoList.txt");
			
			while(!list.isEmpty())
			{
				fos.write((list.pop(0)+" ").getBytes());
			}
			sc.close();
			fis.close();
			fos.close();
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
		
//(2)OrderedList
	 
		/**
		 * @author MadhuriG
		 * function Read a List of Numbers from a file and arrange it ascending Order in a Linked List
		 *  If the number is not found then add it to the list, and 
		 *  if it found then remove the word from the List.
		 */
		public static void orderedListUti() 
		{
			int x[] = new int[1000];
			int size, i;

			try {
				File f = new File("NoList.txt");//Creates File instance and passing file path

				if (!f.exists()) //Check file exists or not
				{
					System.out.println("NoList.txt file is unavailable.... ");
					return;
				}
				FileReader fr = new FileReader(f);// given file to read form
				BufferedReader br = new BufferedReader(fr);//Read input file and create character stream
				i = 0;
				String string = "";
				while ((string = br.readLine()) != null) // Read each line Store in string
				{
	//String convert into integer and stored in integer array				
					x[i] = Integer.parseInt(string);
					// System.out.println(x[i]);
					i++;
				}

				size = i;
				LinkedList<Integer> li = new LinkedList<Integer>();
				//Create linkedlist object and integer array stored in linkedlist 
				for (i = 0; i < size; i++) {
					li.add(x[i]);
					System.out.println(x[i]);
				}

				Collections.sort(li);//Sort list

				Iterator<Integer> itr = li.iterator();

				System.out.println("after sorting:");
				while (itr.hasNext()) {

					System.out.println(itr.next());//Print each element of list
				}

			

				System.out.println("Enter new number = ");
				int number = Utility1.ipnumber();
				int pos = li.indexOf(number); // return in  

				if (pos != -1) //indexOf returns -1 when list not contain element
				{
					li.remove(pos);//list contains number so remove
					System.out.println("number found in list, list after poping = ");
					itr = li.iterator();
					while (itr.hasNext()) {
						System.out.println(itr.next());
					}
				}
				else 
				{
					li.add(number);//list not contains number so add that number
					Collections.sort(li);//sort list
					System.out.println("number not found in lis, list after adding = ");
					itr = li.iterator();
					while (itr.hasNext())
					{
						System.out.println(itr.next());//Print all the list
					}
				}
              br.close();
			} catch (Exception e) {
				System.out.println("error = " + e);
			}
		
		}

//[4]BankingCashCounter
		
		/**
		 * @author MadhuriG
		 * @function creates Banking Cash Counter where people come in to deposit Cash 
		 * and withdraw Cash. QueueClass to enqueue and dequeue people 
		 * @param queue is object of QueueClass 
		 * @param balance is initial balance
		 * @param person is numbers of person in queue
		 */
		public static void bankingCashCounterUti(QueqeClass queue, int balance, int person) {
			
			int count = 0;
			while (count < person)
			{
				boolean flag;
				System.out.println("Bank Counter");
				do 
				{
					System.out.println();

					System.out.println("1.Deposit");
					System.out.println("2.Withdraw");
					System.out.println("3.Check Current Balance is ");
					System.out.println("4.Number of person in queue");
					System.out.println("5.Dequeue");
					System.out.println("6.Enqueue");
					System.out.println("Enter your choice");
					int choice = Utility1.ipnumber();
					switch (choice)
					{

					case 1:
						System.out.println("Enter the amount to deposit");
						int depositamount = Utility1.ipnumber();
						balance = balance + depositamount;
						System.out.println("Balance is = " + balance);
						break;

					case 2: 
						System.out.println("Enter the amt to withdraw");
						int withdrawalamount = Utility1.ipnumber();
						if (withdrawalamount < balance) //Withdraw amount should be less than balance
						{

							 balance = balance - withdrawalamount;
							if (balance < 500)
							{
								System.out.println("Insufficient balance");
							} 
							else
							{
							System.out.println("Balance after withdraw= "+balance);
							}
						}
						else 
							{
								System.out.println("Insufficient balance");
							}
						break;

					case 3:
						System.out.println("Current balance is= " + balance);
						break;

					case 4:
						int number =queue.sizeOfQue();//Calling Queqe Class method sizeOfQue
						System.out.println("Number of person in Queue" + " " + number);
						break;

					case 5:
						queue.deQue();//Object of queqe class is used to call deQue method
						number = queue.sizeOfQue();//Calling Queqe Class method
						System.out.println("Number of person in Queue" + " " + number);
						break;

					case 6:
						queue.enQue();
						number = queue.sizeOfQue();//Calling Queqe Class method
						System.out.println("Number of person in Queue" + " " + number);
						break;

					default:
						System.out.println("Invalid choice");
						break;

					}
					System.out.println("Do you want to continue the transaction");
					System.out.println("Press true or false");

					flag = Utility1.ipBoolean();
				} while (flag);
				if(flag==false)
				{
					System.out.println("Transaction stop, please start again");
				System.exit(0);
				}
			}
			
		}
		
		public static int Banking(int n) {
			int Amount = 5000;
			Queue<Integer> queqe = new Queue<>();
			for (int i = 0; i < n; i++) {   
				queqe.enqueue(i + 1);
			}
		
			while (queqe.size() > 0) {
				System.out.println("Enter 1 For Deposit amount");
				System.out.println("Enter 2 For Withdraw amount");
				int result = Utility1.ipnumber();
				switch (result) {
				case 1:
					System.out.println("Enter Amount To Deposit");
					int deposit = Utility1.ipnumber();
					Amount += deposit;
					System.out.println("Person " + queqe.dequeue() + " Done");
					break;
				case 2:
					System.out.println("Enter Amount To Withdraw");
					int withdraw = Utility1.ipnumber();
					if (withdraw > Amount) {
						System.out.println("Insufficient Amount");
						break;
					} else {
						Amount -= withdraw;
						// System.out.println("Person "+q.dequeue()+" Done");

						break;
					}
				}
			}
			return Amount;
		}

//[5]Palindrome		
		/**
		 * @author MadhuriG
		 * @function check whether String is a palindrome by using Deque1

		 * @param string is input string to check weither string is palindrome or not
		 */
		public static  void palindromeDequeUti(String string) 
		{
			Deque1<Character> dequelist = new Deque1<>();

			for (int i = 0; i < string.length(); i++) 
			{
				dequelist.addFront(string.charAt(i));//Convert String into character insert element in deque 
			}

			char front =  '0' , rear =  '0' ;
			int f = 0;

			do 
			{
				front = dequelist.removeFront();//remove first element of deque
				rear =  dequelist.removeRear();//remove last element of deque
				if (front != rear) // check first character with last  
				{
					f = 1;
					break;
				}

			} while ((dequelist.size()>1));//compare front and rear till size of list greater than 1

			
			if (f == 1)  //front and rear character not matched so f==1 & string not Palindrome
			{
				System.out.println("Strings is not palindrome");
			} 
			else 
			{
				System.out.println("Strings is palindrome");
			}

			
		}
		

		/**
		 * @author MadhuriG
		 * @function find given number is prime number or not 
		 * @param num is input number
		 * @return
		 */
		public static boolean primeNum(int num) {
			
			if (num < 2)//0 & 1 not prime numbers
			{
				return false;
			}
			else
			{
				int temp;
				for (int i = 2; i <= num / 2; i++) 
				{
					temp = num % i;
					if (temp == 0)//if remainder is zero it means not prime number
					{
						return false; 
					}
				}
				return true; 
			}

		}
		
		/**
		 * @function check 2 given numbers are anagram or not
		 * @param num 
		 * @param num1
		 * @return
		 */
		public static boolean anagramNum(int num, int num1) {
			String str1 = "";
			String str2 = "";
			str1 = Integer.toString(num);
			str2 = Integer.toString(num1);
			char[] charFromNum = str1.toCharArray();
			char[] charFromNum2 = str2.toCharArray();
			Arrays.sort(charFromNum);//for sort character array number convert into String
			Arrays.sort(charFromNum2);
			return Arrays.equals(charFromNum, charFromNum2);//Return true if 2 Strings are equal

			
		}
		
		
// [8]Display Calender
		/**@author MadhuriG
		 * @function to find year is leap year or not
		 * @param year is input entered by user 
		 * @return true if year is leap year otherwise it return false
		 */
		public static boolean isleapyear(int year) {
			if (year % 4 == 0) 
			{
				if (year % 100 == 0) 
				{
					if (year % 400 == 0) 
					{
						return true;
					}
					else
					{
						return false;
					}
				}
				else
				{
					return true;
				}
			} 
			else
			{
				return false;
			}
		}

		/**
		 * @author MadhuriG
		 * @function return integer value between 0 to 6 so we assign it to the sunday to saturday
		 * @param month is entered by user 
		 * @param day here day is constant 1 bcoz we have to find week day for date 1
		 * @param year entered by user
		 * @return integer value between 0 to 6
		 */
		public static int day(int month, int day, int year) {
			int y = year - (14 - month) / 12;
			int x = y + y / 4 - y / 100 + y / 400;
			int m = month + 12 * ((14 - month) / 12) - 2;
			int d = (day + x + (31 * m) / 12) % 7;
			return d;

		}
		
		
/**
 * @author MadhuriG
 * @function Display calender 
 * @param month entered by user 
 * @param year entered by user
 */
public static void Calender(int month,int year)
{
		/*Store all months in String Array*/
		String[] months={"","January","February","March","April","May","June","July",
				        "August","September","Octomber","November","December"};
		/*Store number of days acording to month in integer array */
		int[] days = {
		           0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		/*Check if the year is leap or not bcoz leap year having february month 29 days*/
		 if (month == 2 && Utility1.isleapyear(year)) 
			 days[month] = 29; //if year leap then assign 29 t0 no. of days
	     System.out.println("   " + months[month] + " " + year);
	     System.out.println("\tSun\tMon\tTue\tWed\tThu\tFri\tSat");
	     int d = Utility1.day(month, 1, year); //d having value between 0 to 6
	     for (int i = 0; i < d; i++)
	     System.out.print("\t"); //till d we add space
	     for (int i = 1; i <= days[month]; i++) 
	     {
	         System.out.printf("\t"+i);
	         if (((i + d) % 7 == 0)) //this condition satisfied terminates to next line
	         System.out.println();
	     }
}  

		 /**
		  * @author MadhuriG
		  * @function Display calender by using Queqe with LinkedList
		 * @param month entered by user 
		 * @param year entered by user
		 */
		public static void CalendarQueue(int month,int year)
		    {
			 QueqeUsingLinkedLCalender weekday=new QueqeUsingLinkedLCalender();
		        String[] months = {"January", "February", "March","April", "May", "June",
		                "July", "August", "September","October", "November", "December"};

		            int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		            if ((month == 2) && (isleapyear(year)))
		            {
		                days[month] = 29;
		            }
		            System.out.println("\t\t\t" + months[month-1] + " " + year);
		            System.out.println("\tSun\tMon\tTue\tWed\tThu\tFri\tSat");
		            int d = day(month, 1, year);
		            for(int i=0;i<d;i++)
		            {
		                weekday.enqueue("\t");  //enqueqe space till d 
		            }
		            for (int i = 1; i <= days[month-1]; i++)
		            {
		 
		                weekday.enqueue("\t"+i); //add dates with space tab
		                if (((i + d) % 7 == 0) || (i == days[month-1]))
		                weekday.enqueue("\n"); // for terminate line in queqe
		            }
		            weekday.display(); //Print Whole queqe
		    }

		
/*------	Object Oriented Programs-----------*/
		
public static FileReader fileRead1(String string2) {

			FileReader f = null;
			try {
				f = new FileReader(string2);
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}
			return f;

		}	

public static void RisePulseWheat(FileReader fileRead1)

		throws IOException, ParseException, org.json.simple.parser.ParseException 
{
	//JSON parser object to parse read file
		JSONParser parse=new JSONParser();
   //Read JSON file
	    JSONObject object=(JSONObject) parse.parse(fileRead1);
	    //System.out.println(object);
	    int total=0;
	    //iterate the object
	    Iterator<?> iterator=object.keySet().iterator();//Keys of Object(rice,wheat,pulses)
	    while(iterator.hasNext())
	    {
	        String topkey=(String)iterator.next();
	        JSONObject obj=(JSONObject) object.get(topkey);
	        Iterator<?> iterate = obj.keySet().iterator();//keys of each specific object
	        while(iterate.hasNext())
	        {
	            String key=(String) iterate.next();
	            System.out.println(key+":"+obj.get(key));
	        }
	        Integer amount=(Integer.parseInt(obj.get("Price").toString())) * (Integer.parseInt(obj.get("Weight").toString()));
	        System.out.println("The total cost of "+obj.get("Name")+" is: "+amount);
	        System.out.println();
	        total=total+amount;       
	}
	    System.out.println("The total Amount of inventory is:"+total);
		
}
//(3)StockReport

public static void stockReport(FileReader fileRead)
		throws IOException, ParseException, org.json.simple.parser.ParseException {
	JSONParser parse = new JSONParser();
	int total = 0;
	//JSON parser object to parse read file
	JSONObject object = (JSONObject) parse.parse(fileRead);
	// System.out.println(object);
	Iterator iterator = object.keySet().iterator();//keySet gives set of keys contain in map
	while (iterator.hasNext()) {
		String topkey = (String) iterator.next();//Here top is Company name
		JSONObject obj = (JSONObject) object.get(topkey);//obj store sub-obj contains in main key
		System.out.println("Company name:" + topkey);
		long price = (Long) obj.get("Price");//Returns value for given key
		long num = (Long) obj.get("NumOfShare");
		total += price * num;

		System.out.println("Price:" + price);
		System.out.println("Number Of Shares:" + num);
		System.out.println("Total Stock is:" + price * num);
		System.out.println();
	}
	System.out.println("Total amount of shares is:" + total);
}



public static void deckOfCardQueue() {
	String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
	String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	String array[][] = new String[4][9];
	Queue<String> q = new Queue();
	// initialize deck
	int n = suits.length * ranks.length;//n=52 
	String[] deck = new String[n];
	for (int i = 0; i < ranks.length; i++) {
		for (int j = 0; j < suits.length; j++) {
			deck[suits.length * i + j] = ranks[i] + "->" + suits[j];
		}
	}

	// shuffle
	for (int i = 0; i < n; i++) {
		int r = i + (int) (Math.random() * (n - i));
		String temp = deck[r];
		deck[r] = deck[i];
		deck[i] = temp;
	}

	// print shuffled deck

	for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 9; j++) {
			array[i][j] = deck[i + j * 4];
			q.enqueue(array[i][j] + "\t");

		}
		q.enqueue("\n");
	}
	 q.display();
	SortDeck(array, q);
	 
	
}

public static void SortDeck(String[][] array, Queue<String> q) {

	char[] rank = { 'A', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'J', 'Q', 'K' };
	String[] cards = new String[51];
	for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 9; j++) {
			cards[j] = array[i][j];
			 System.out.print(cards[j]);

		}
	}
	String card;
	for (int i = 0; i < rank.length; i++) {
		for (int j = 0; j < cards.length; j++) {
			card = cards[j];
			 System.out.print(card);
			char cardRank = card.charAt(card.lastIndexOf(card));
			if (cardRank == rank[i])
			{
				q.enqueue(card + "\t");
			}
		}
		q.enqueue("\n");
	}
	 q.display();
}
/*
public <T> void DeckOfCardsInQueue(String [] Rank,String [] suits)
{
Queue<T> deckofcard=new Queue<>();
String [] array=new String [52];
for(int i=0;i<array.length;i++)
{
	String quo=suits[i/13];
	
	String rem=Rank[i%13];
 array[i] = quo+rem;
//	System.out.print(array[i]+" ");
}	
System.out.println();
Random r=new Random();

int length=array.length;
//System.out.print(length + " length of ARRAY");
for(int i=0;i<array.length;i++)
{
	int index=r.nextInt(52);
	//System.out.print(index+ " ");
	
	String temp=array[i];
	array[i]=array[index];
	array[index]=temp;
}
for(String u : array)
{
	System.out.println(u);
	//System.out.println("\n");
}
System.out.println();


String [] []str=new String [suits.length][9];
for (int i = 0; i < 4; i++) 
{
	System.out.print("Player"+(i+1)+ "\t");
	//System.out.println();
	
	for (int j = 0; j <9 ; j++) 
	{
		
		str[i][j]=array[i+j*4];
		deckofcard.enqueue((T) str[i][j]);
		//System.out.print("       " +str[i][j]+ "        ");
		
	}
	
	System.out.println();
}
}
*/
	

public static void StockAccount() throws IOException, ParseException, org.json.simple.parser.ParseException {
	System.out.println("Enter Your Chocie");
	System.out.println("1.Create a new Account");
	System.out.println("2.Buy Shares");
	System.out.println("3.Sell Shares");
	System.out.println("4.Print Report");
	System.out.println("5.Exit");

	int choice = Utility1.ipnumber();
	switch (choice) {
	case 1:
		System.out.println("Creating Account");
		createAcc();
		break;
	case 2:
		System.out.println("You are buying Shares");
		buyShare();
		break;
	case 3:
		System.out.println("You are selling shares");
		sellShare();
		break;
	case 4:
		System.out.println("Print Report");
		printReport();
		break;
	case 5:
		System.out.println("Exit");
		break;
	default:
		break;
	}
}

public static void createAcc() throws IOException, ParseException, org.json.simple.parser.ParseException {
	File file = new File("customerShare.json");
	if (file.exists()) {

		boolean check = true;
		while (check == true) {
			System.out.println("Want to add user: yes or no");
			String ch = ipstring();
			if (ch.equals("yes")) {

				FileReader fr = new FileReader(file);
				JSONParser parser = new JSONParser();//parse json file into java objects
				JSONArray arr1 = (JSONArray) parser.parse(fr);//JSONArray is order sequence of values
				JSONObject json = new JSONObject();//creates json object
				System.out.println("Enter name");
				String name = ipstring();
				System.out.println("Enter balance");
				int bal = ipnumber();
				json.put("Name", name);//here passing objects
				json.put("Balance", bal);
				json.put("ShareCount", 100);

				arr1.add(json);//here we pass all objects in array
				FileWriter fw = new FileWriter(file);
				fw.write(JSONArray.toJSONString(arr1));
				fw.flush();
				fw.close();

			} else {
				check = false;
			}
		}

	} else {
		System.out.println("File does not exits");
	}
	StockAccount();
}

//here user bying share so balance reduce n number of share increses
public static void buyShare() throws IOException, ParseException, org.json.simple.parser.ParseException {
	File file = new File("customerShare.json");
	File file1 = new File("companyStock.json");
	if (file.exists() && file1.exists())

	{

		// reading stock file
		FileReader fr = new FileReader(file);//give file to read
		JSONParser parser = new JSONParser();//parse json file into java objects
		JSONArray stock = (JSONArray) parser.parse(fr);

		// reading share file
		FileReader sf = new FileReader(file1);
		JSONParser parser1 = new JSONParser();
		JSONArray share = (JSONArray) parser1.parse(sf);

		System.out.println("Enter the user");
		String name = ipstring();
		Iterator<?> itr = stock.iterator();//iterator for customer json
		Iterator<?> itr1 = share.iterator();//iterator for company json
		boolean flag = false;
		while (itr.hasNext()) { //For comparing user name with stored we have to use the iterate customer.json
			JSONObject obj = (JSONObject) itr.next();//
			if (obj.get("Name").equals(name)) {
				System.out.println("Enter the share sysmbol to buy share:[@,!,#]");
				String sym = ipstring();
				/*
				 * obj.put("Share symbol", sym);
				 * if(obj.get("Share Symbol").equals(sym)) {
				 */
				while (itr1.hasNext()) { //symbol in company json so iterate that
					JSONObject obj1 = (JSONObject) itr1.next();
					if (obj1.get("Symbol").equals(sym)) {
						System.out.println("Enter the amount to Buy share");
						int amt = ipnumber();
						int bal = Integer.parseInt(obj.get("Balance").toString());//taken from customerShare
						
						int noShare = Integer.parseInt(obj.get("ShareCount").toString());//taken from customerShare

						int price = Integer.parseInt(obj1.get("Price").toString());//taken from companyStock

						int stockShare = Integer.parseInt(obj1.get("Count").toString());//taken from companyStock
						
						int numofshare = amt / price;//amount is divided by Price we get from companyShare

						int newbal = bal - amt;//buying share so new balance reduce n number 
						int sharecountcus = noShare + numofshare;//sharecount increases of user
						int sharecountstock = stockShare - numofshare;//n company share count reduced

						obj.remove("Balance");
						obj.remove("ShareCount");
						obj1.remove("Count");

						obj.put("Balance", newbal);
						obj.put("ShareCount", sharecountcus);
						obj1.put("Count", sharecountstock);
						Date d = new Date();
						String date = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a").format(d);
						System.out.println("Date " + date);
						flag = true;
						break;
					}
				}
			}
			FileWriter fs = new FileWriter(file);
			fs.write(JSONValue.toJSONString(stock));
			fs.flush();
			fs.close();
		}
		if (flag == false) {
			System.out.println("User name not exits");
		}
		FileWriter fw = new FileWriter(file1);
		fw.write(JSONValue.toJSONString(share));
		fw.flush();
		fw.close();
	} else {
		System.out.println("File does not exits");
	}
	StockAccount();
}

//here we selling shares so balance increses and number of shares of user decreses and companys count share increses 
public static void sellShare() throws IOException, ParseException, org.json.simple.parser.ParseException {
	File file = new File("customerShare.json");
	File file1 = new File("companyStock.json");
	if (file.exists() && file1.exists()) {
		// Scanner scan = new Scanner(System.in);
		// reading stock file
		FileReader fr = new FileReader(file);
		JSONParser parser = new JSONParser();
		JSONArray stock = (JSONArray) parser.parse(fr);
		// reading share file

		FileReader sf = new FileReader(file1);
		JSONParser parser1 = new JSONParser();
		JSONArray share = (JSONArray) parser1.parse(sf);

		System.out.println("Enter the user");
		String name = ipstring();
		Iterator<?> itr = stock.iterator();//iterate customerShare.json
		Iterator<?> itr1 = share.iterator();//iterate companyShare.json
		boolean flag = false;
		while (itr.hasNext()) {
			JSONObject obj = (JSONObject) itr.next();
			if (obj.get("Name").equals(name)) {
				System.out.println("Enter the share sysmbol to sale share:[@,!,#]");
				String sym = ipstring();
				System.out.println("Enter the number of share to sale");
				int count = ipnumber();
				// obj.put("Share Symbol", sym);
				while (itr1.hasNext()) {
					JSONObject obj1 = (JSONObject) itr1.next();
					if (obj1.get("Symbol").equals(sym)) {//here we chaecking entered symbol is available or not in CompanyShare
						int bal = Integer.parseInt(obj.get("Balance").toString());//CustomerShare.json balance taken
						int price = Integer.parseInt(obj1.get("Price").toString());//Taken from CompanyStock.json
						int noShare = Integer.parseInt(obj.get("ShareCount").toString());//taken from CustomerShare.json
						int stockShare = Integer.parseInt(obj1.get("Count").toString());//Taken from CompanyStock.json
						int saleprize = count * price;//calculating for newbalance
						int newbal = bal + saleprize;
						int sharecountscustomer = noShare - count;//after sell sharecount reduced 

						int sharecountstockcompany = stockShare + count;
						if (sharecountscustomer > 0 && noShare > 0) {
							obj.remove("Balance"); //remove old values
							obj.remove("ShareCount");
							obj1.remove("Count");
							obj.put("Balance", newbal);//store updated values
							obj.put("ShareCount", sharecountscustomer);
							obj1.put("Count", sharecountstockcompany);
						} else {
							System.out.println("No Shares Available");
						}
						Date d = new Date();
						String date = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a").format(d);
						System.out.println("Date " + date);
						flag = true;
						break;
					}

				}
			}

			FileWriter fs = new FileWriter(file);
			fs.write(JSONValue.toJSONString(stock));
			fs.flush();
			fs.close();
		}
		if (flag == false) {
			System.out.println("User name not exits");
		}
		FileWriter fw = new FileWriter(file1);
		fw.write(JSONValue.toJSONString(share));
		fw.flush();
		fw.close();
	} else {
		System.out.println("File Does not exits");
	}
	StockAccount();
}

public static void printReport() throws IOException, ParseException, org.json.simple.parser.ParseException {

	File file = new File("customerShare.json");

	if (!file.exists()) {//if file not exists n file having 
		System.out.println("NO customer is there.");
	} else {
		FileReader file1 = fileRead1("customerShare.json");
		JSONParser parser = new JSONParser();
		JSONArray shareArray = (JSONArray) parser.parse(file1);
		Iterator<?> iterator = shareArray.iterator();
		while (iterator.hasNext()) {
			JSONObject shareobj = (JSONObject) iterator.next();
			System.out.println(shareobj);
		}

	}
	System.out.println();
	StockAccount();
}


}

