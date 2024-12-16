/*
 *	Author:  Haabee Lee
 *  Date: 2024-09-23
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess a number between 1 and 1000!");
		int guess = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		if(guess == 482){
			System.out.print("You guessed correct! Amazing!");
		}
		else if(guess > 482){
			System.out.print("Nope, try guessing a smaller number!");
		}
		else if(guess < 482){
			System.out.print("Sorry, try guessing a bigger number!");
		}
		
	}
}
