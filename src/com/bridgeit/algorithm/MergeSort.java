package com.bridgeit.algorithm;
import com.bridgeit.utility.Utility1;

public class MergeSort {

	public static void main(String[] args) {
	
		System.out.println("Enter size of an array");
		int x=Utility1.ipnumber();
		int arr[]=new int[x];
		System.out.println("Enter elements of array");
		for(int i=0;i<x;i++)
		{
			arr[i]=Utility1.ipnumber();
		}
		
		System.out.println("Given array is");
		for(int i=0;i<x;i++)
		{
			System.out.println(arr[i]);
		}
		
		Utility1.sortMerge(arr,0,arr.length-1);//Call Utility method
		System.out.println("Sorted array is");
		for(int i=0;i<x;i++)
		{
			System.out.println(arr[i]);
		}
	}
}


