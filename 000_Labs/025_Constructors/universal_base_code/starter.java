/*
 *	Author:  Haabee Lee
 *  Date: 2024/10/16
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your role? Wizard, warrior, or rogue?");
		myCharacter poop = new myCharacter();
		poop.statistics();
		
		System.out.println();
		
		System.out.println("What is your role? Wizard, warrior, or rogue?");
		myCharacter hello = new myCharacter(sc.nextLine());
		hello.statistics();
	}
}
