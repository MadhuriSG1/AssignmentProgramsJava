package com.bridgeit.functional;

import com.bridgeit.utility.Utility1;

public class TwoDiamensionalArray {

	public static void main(String[] args) {
		
		int rows,columns,total;
		System.out.println("Enter number of rows");
		rows=Utility1.ipnumber();
		System.out.println("Enter number of columns");
		columns=Utility1.ipnumber();
		total=rows*columns;
		System.out.println("Enter values= "+total);
		Utility1.array2DUT(rows, columns);

	}

}
