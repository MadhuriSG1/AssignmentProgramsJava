package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility1;


public class MonthlyPayment {

	public static void main(String[] args) {
		double loan,year,rate;
		/*calculates the monthly payments you
        would have to make over Y years to pay off a P principal loan amount at R per cent
        interest compounded monthly.*/
		System.out.println("Enter the Loan:");
		loan=Utility1.ipdoublenumber();
		System.out.println("Enter the Years:");
		year=Utility1.ipdoublenumber();
		System.out.println("Enter the Intrest:");
		rate=Utility1.ipdoublenumber();
		Utility1.monthlyPayment(loan,year,rate); 
	
	}

}
