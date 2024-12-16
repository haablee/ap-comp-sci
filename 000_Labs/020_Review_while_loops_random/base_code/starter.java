/*
 *	Author:  Haabee Lee
 *  Date: 2024-10-01
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int correct = (int)Math.random()*1000;
		
		System.out.println("Guess an integer between 0 to 1000");
		int guess = sc.nextInt();
		
		
		while(correct != guess){
		if(guess < correct){
			System.out.println("Try guessing a bigger number");
			guess = sc.nextInt();
		}
		else if(guess > correct){
			System.out.println("Try guessing a smaller number");
			guess = sc.nextInt();
		}
		
		}
		
		System.out.println();
		System.out.println("You guessed it!");


		
	}
}
