/*
 *	Author:  Haabee Lee
 *  Date: 2024/10/22
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		myCharacter poppy = new myCharacter();
		
		poppy.setRole("Wizard");
		poppy.setStrength(8);
		poppy.setDexterity(5);
		poppy.setIntelligence(10);
		poppy.setCharisma(7);
		
		poppy.setAll("Warrior", 1, 2, 3, 4);
		boolean check = poppy.setAll("Warrior", 1, 2, 3, 4);
		System.out.print(check);
		
		System.out.println();
		
		poppy.myToString();

	}
}
