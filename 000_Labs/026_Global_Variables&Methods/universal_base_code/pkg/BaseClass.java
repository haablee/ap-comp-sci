/*
 *	Author:  Haabee Lee
 *  Date: 2024/10/22
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	String role;
	int strength;
	int dexterity;
	int intelligence;
	int charisma;

	public myCharacter() {
		role = "no role";
		strength = 5;
		dexterity = 8;
		intelligence = 4;
		charisma = 9;
	}
	
	public myCharacter(String r) {
		role = r;
		strength = 5;
		dexterity = 8;
		intelligence = 4;
		charisma = 9;
	}
	
	public void myToString(){
		System.out.println("Your role is " + role);
		System.out.println("Your strength is " + strength);
		System.out.println("Your dexterity is " + dexterity);
		System.out.println("Your intelligence is " + intelligence);
		System.out.println("Your charisma is " + charisma);
	}

}

