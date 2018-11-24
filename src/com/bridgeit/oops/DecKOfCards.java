package com.bridgeit.oops;

public class DecKOfCards {
	public static void main(String[] args) 
	  {
	    String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
	    String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};
	    int n = SUITS.length * RANKS.length;//n=52
	    String[] deck = new String[n];
	    for(int i = 0; i < RANKS.length; i++) //13
	     {
	        for (int j = 0; j < SUITS.length; j++) //4
	         {
	           deck[SUITS.length*i + j] = RANKS[i] + " of " + SUITS[j];//13*4=52 cards generated
	         }
	     }
	    //Suffle cards
	    for (int i = 0; i < n; i++) 
	     {
	        int r = i + (int) (Math.random() * (n-i));
	        String temp = deck[r];
	        deck[r] = deck[i];
	        deck[i] = temp;
	     }
	    
	    //Distributes 36 cards between 4 person 
	    for(int i = 1; i <= 4; i++) //4 player
	     {
	        System.out.println("---------- PLAYER NUMBER: " + (i) + " HAVE CARDS ARE BELOW ----------");
	        for (int j = 0; j < 9; j++) //9 player
	         {
	           System.out.println(deck[i+j*4] + " (Card " + (i+j*4)+")");//here 36 cards generated
	         }
	     }
	  }

}
