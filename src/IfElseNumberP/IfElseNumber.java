package IfElseNumberP;

import java.util.Scanner;

public class IfElseNumber {

	public static void main(String[] args) {
		
		//Open scanner.
		Scanner scnr = new Scanner(System.in);
		
		//Declare variables.
		int userInputNumber;
		String userName = "";
		char contin = 'y';
		
		//Asks and collects name.
		System.out.println("Enter your first name?");
		userName = scnr.next();
		
		//This while statement sets up the continue question at the end.
		while (contin == 'y') {
		
		//Asks for and collects the number.
		System.out.println("Enter a integer between 1 - 100 (No decimals, letters, symbols, or spaces):");
		userInputNumber = scnr.nextInt();
		
		//This while statement verifies the number is between 1 and 100.
		while (userInputNumber < 1 || userInputNumber > 100) {
		System.out.println("This number is not between 1 - 100.");
		System.out.println("Enter a integer between 1 - 100 (No decimals, letters, symbols, or spaces):");
		userInputNumber = scnr.nextInt();		
		}
		
		//These if and else if statements calculate outcomes.
		if (userInputNumber%2 == 1 && userInputNumber < 61) {
			System.out.println(userName + " this number is odd.");
		}
		else if (userInputNumber%2 == 1 && userInputNumber > 60) {
			System.out.println(userName + " this number is odd and over 60.");
		}
		else if (userInputNumber%2 == 0 && userInputNumber < 26) {
			System.out.println(userName + " this number is even and less than 25.");
		}
		else if (userInputNumber%2 == 0 && userInputNumber < 101) {
			System.out.println(userName + " this number is even.");
		}
		
/*This continue question sets a character to see if we enter back into the initial loop.
I did not ask for the name again in the loop, it felt redundant, but easily 
could have by including lines 18 and 19 within the while statement starting at line 22.*/
		
		System.out.println("Continue? (y to continue)");
		contin = scnr.next().charAt(0);

		}
		scnr.close();
	}
		
}



