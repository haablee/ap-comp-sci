/*
 *	Author:  Haabee Lee
 *  Date: 2024-09-24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter your character's name.");
		String name = sc.nextLine();
		
		
		System.out.println("Create a title that everyone will know you by! E.x. Slayer of Dragons:");
		String title = sc.nextLine();
		
		
		System.out.println("Would you like to be Wizard, Warrior, or a Rogue?");
		String player = sc.nextLine();
		System.out.println();
		
		if((player.equals("Wizard")) || (player.equals("wizard"))){
			System.out.println("You have chosen to be a Wizard!");
		}
		
		else if((player.equals("Warrior")) || (player.equals("warrior"))){
			System.out.println("You have chosen to be a Warrior!");
		}
		
		else if((player.equals("Rogue")) || (player.equals("rogue"))){
			System.out.println("You have chosen to be a Rogue!");
		}
		
		else{
			System.out.println("You didn't choose a character :(");
			System.out.println("Would you like to be Wizard, Warrior, or a Rogue?");
			player = sc.nextLine();
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println("You have a maximum of 20 points to spend on the following traits: Strength, Dexterity, Intelligence, and Charisma.");
		System.out.println("Strength (1-10 pts), Dexterity (1-10 pts), Intelligence (1-10 pts), Charisma (1-10 pts). Choose carefully!");
		System.out.println();
		
		
		int points = 20;
		System.out.println("Strength (input the amount of points you wish to spend):");
		int strength = sc.nextInt();
		
		if(strength > 10){
			System.out.println("Please input a smaller number. Max is ten points on each trait!");
			System.out.println("Strength (input the amount of points you wish to spend):");
			strength = sc.nextInt();
			System.out.println();
		}
		System.out.println("You have " + (points-strength) + " points left to spend.");
		System.out.println();
		
		
		points = points - strength;
		System.out.println("Dexterity (input the amount of points you wish to spend):");
		int dexterity = sc.nextInt();
		
		if(dexterity > 10){
			System.out.println("Please input a smaller number. Max is ten points on each trait!");
			System.out.println("Dexterity (input the amount of points you wish to spend):");
			dexterity = sc.nextInt();
			System.out.println();
		}
		System.out.println("You have " + (points - dexterity) + " points left to spend.");
		System.out.println();
		
		
		points = points - dexterity;
		System.out.println("Intelligence (input the amount of points you wish to spend):");
		int intelligence = sc.nextInt();
		
		if(intelligence > 10){
			System.out.println("Please input a smaller number. Max is ten points on each trait!");
			System.out.println("Intelligence (input the amount of points you wish to spend):");
			intelligence = sc.nextInt();
			System.out.println();
		}
		System.out.println("You have " + (points-intelligence) + " points left to spend.");
		System.out.println();
		
		if(points-intelligence < 0){
			System.out.println("Please input zero points for the rest of the traits.");
			System.out.println("Intelligence (input the amount of points you wish to spend):");
			intelligence = sc.nextInt();
		}
		
		points = points - intelligence;
		System.out.println("Charisma (input the amount of points you wish to spend):");
		int charisma = sc.nextInt();
		
		if(charisma > 10){
			System.out.println("Please input a smaller number. Max is ten points on each trait!");
			System.out.println("Charisma (input the amount of points you wish to spend):");
			charisma = sc.nextInt();
			System.out.println();
		}
		System.out.println("You have " + (points-charisma) + " points left to spend.");
		System.out.println();
		
		points = points - charisma;
		if(points < 0){
			System.out.println("Please input zero points for the rest of the traits.");
			System.out.println("Charisma (input the amount of points you wish to spend):");
			charisma = sc.nextInt();
		}
		
		if(points != 0){
			System.out.println("You have " + points + " points left to spend on your next play!");
			System.out.println();
		}
		
		
	
		System.out.println("Here is a summary of your stats!");
		System.out.println("Character name: " + name);
		System.out.println("Character title: " + title);
		System.out.println("Strength: " + strength);
		System.out.println("Dexterity: " + dexterity);
		System.out.println("Intelligence: " + intelligence);
		System.out.println("Charisma: " + charisma);
		System.out.println();
		System.out.println("You are ready for your adventure! Good luck and safe travels :D");
		
	}
}
