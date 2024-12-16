/*
 *	Author: Haabee Lee
 *  Date: 2024-10-01
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Here are the slot machine rules:");
		System.out.println("You will start with $100 and you can only wage an amount less than your total.");
		System.out.println("The slot machine will roll three dices, each giving a number between 1 and 10.");
		System.out.println("If none of the numbers are the same, you lose your money.");
		System.out.println("If two numbers are the same, you double your money.");
		System.out.println("If all three numbers are the same, triple your money.");
		 
		System.out.println();
		
		int total = 100;
		
		System.out.println("Would you like to play the game?");
		String answer = sc.nextLine();
			
		if((answer.equals("Yes")) || (answer.equals("yes")) || (answer.equals("Y")) || (answer.equals("y"))){

			while(total > 0){
				System.out.println();
				System.out.println("How much money will you wager? (Only input the number).");
				int w = sc.nextInt();
			
				if((w > total) || (w < 0)){
				System.out.println("You know the rules >:(");
				System.out.println("Enter your amount again.");
				w = sc.nextInt();
				}


				System.out.println();
				System.out.println("Okay! Let's roll the dice!");
				
				int x = (int)(Math.random()*10);
				int y = (int)(Math.random()*10);
				int z = (int)(Math.random()*10);
			
				System.out.println();
				System.out.println(x + " || " + y + " || " + z);
				System.out.println();
			
				if((x == y) || (x == z) || (y == z)){
					System.out.println("You won! Your wagered money is now doubled.");
					System.out.println("You have $" + ((w*2)+total) + " left.");
					total = ((w*2)+total);
				}
				else if((x == y) && (x == z)){
					System.out.println("You won! Your wagered money is now tripled.");
					System.out.println("You have $" + ((w*3)+total) + " left.");
					total = ((w*3)+total);
				}
				else if((y == x) && (y == z)){
					System.out.println("You won! Your wagered money is now tripled.");
					System.out.println("You have $" + ((w*3)+total) + " left.");
					total = ((w*3)+total);
				}
				else if((z == x) && (z == y)){
					System.out.println("You won! Your wagered money is now tripled.");
					System.out.println("You have $" + ((w*3)+total) + " left.");
					total = ((w*3)+total);
				}
				else{
					System.out.println("You lose!");
					System.out.println("You have $" + (total - w) + " left.");
					total = total - w;
				}
			
			}
			
			System.out.println("Thank you for playing! Press 'start' to play again.");
			
			
		}
		
		else if((answer.equals("No")) || (answer.equals("no")) || (answer.equals("N")) || (answer.equals("n"))){
			System.out.println();
			System.out.println("Maybe next time. You still have $" + total + " left.");
			System.out.println("Press 'start' to play.");
		}
		else{
			System.out.println("Sorry, would you like to play the game?");
			answer = sc.nextLine();
			
			if((answer.equals("Yes")) || (answer.equals("yes")) || (answer.equals("Y")) || (answer.equals("y"))){

			while(total > 0){
				System.out.println();
				System.out.println("How much money will you wager? (Only input the number).");
				int w = sc.nextInt();
			
				if((w > total) || (w < 0)){
				System.out.println("You know the rules >:(");
				System.out.println("Enter your amount again.");
				w = sc.nextInt();
				}


				System.out.println();
				System.out.println("Okay! Let's roll the dice!");
				
				int x = (int)(Math.random()*10);
				int y = (int)(Math.random()*10);
				int z = (int)(Math.random()*10);
			
				System.out.println();
				System.out.println(x + " || " + y + " || " + z);
				System.out.println();
			
				if((x == y) || (x == z) || (y == z)){
					System.out.println("You won! Your wagered money is now doubled.");
					System.out.println("You have $" + ((w*2)+total) + " left.");
					total = ((w*2)+total);
				}
				else if((x == y) && (x == z)){
					System.out.println("You won! Your wagered money is now tripled.");
					System.out.println("You have $" + ((w*3)+total) + " left.");
					total = ((w*3)+total);
				}
				else if((y == x) && (y == z)){
					System.out.println("You won! Your wagered money is now tripled.");
					System.out.println("You have $" + ((w*3)+total) + " left.");
					total = ((w*3)+total);
				}
				else if((z == x) && (z == y)){
					System.out.println("You won! Your wagered money is now tripled.");
					System.out.println("You have $" + ((w*3)+total) + " left.");
					total = ((w*3)+total);
				}
				else{
					System.out.println("You lose!");
					System.out.println("You have $" + (total - w) + " left.");
					total = total - w;
				}
			
			}
			
			System.out.println("Thank you for playing! Press 'start' to play again.");
		
			}
			
		}	 
		 
		 
	}
}
