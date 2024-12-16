/*
 *	Author:  Haabee Lee
 *  Date: 2024-09-23
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Would you like to be a Wizard, a Warrior, or a Rogue?");
		String player = sc.nextLine();
		System.out.println();
		
		if((player.equals("Wizard")) || (player.equals("wizard"))){
			System.out.print("You have chosen to be a Wizard!");
		}
		
		else if((player.equals("Warrior")) || (player.equals("warrior"))){
			System.out.print("You have chosen to be a Warrior!");
		}
		
		else if((player.equals("Rogue")) || (player.equals("rogue"))){
			System.out.print("You have chosen to be a Rogue!");
		}
		
		else{
			System.out.print("You didn't choose a character :( Please rerun the program!");
		}
		
	}
}
