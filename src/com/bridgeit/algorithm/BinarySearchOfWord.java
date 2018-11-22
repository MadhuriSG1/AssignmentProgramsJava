package com.bridgeit.algorithm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


import com.bridgeit.utility.Utility1;

public class BinarySearchOfWord {

	public static void main(String[] args) throws IOException {
		
			String search;
			String filepath="/home/bridgelabz/Work-space/BasicPrograms3/StringFile";
		    FileReader fr=new FileReader(filepath);
			BufferedReader br=new BufferedReader(fr);
			String line=" ";
			while((line=br.readLine())!=null)
			{
				System.out.println(line/*.split(",").toString()*/);
			}
			System.out.println("Enter word to search");
			search=Utility1.ipstring();
			/*this method reurn string array words*/
			String [] words =Utility1.stringFileBinary(filepath);
			for(int i=0;i<words.length;i++)
			{
				System.out.println(words[i]);
			}
			/*here we call binary search method and store result*/
			boolean result=Utility1.binarysearchStr(words,search);
			
			//if condition true then Word is found
			if(result)
			{
				System.out.println("Word is found");
			}
			else
			{
				System.out.println("Word not found");
			}
			br.close();
		}


}
