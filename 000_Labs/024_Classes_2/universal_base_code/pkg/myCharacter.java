/*
 *	Author:  Haabee Lee
 *  Date: 2024/10/16
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
		role = "warrior";
		strength = 10;
		dexterity = 8;
		intelligence = 6;
		charisma = 5;
	}
	
	public myCharacter(String r, int s, int i){
		role = r;
		strength = s;
		intelligence = i;
		dexterity = 8;
		charisma = 5;
	}
	
	public void statistics(){
		System.out.println("Your role is " + role);
		System.out.println("Your strength is " + strength);
		System.out.println("Your dexterity is " + dexterity);
		System.out.println("Your intelligence is " + intelligence);
		System.out.print("Your charisma is " + charisma);
	}

}

