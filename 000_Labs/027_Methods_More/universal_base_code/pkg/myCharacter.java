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
		role = "No Role";
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		charisma = 0;
	}
	
	public myCharacter(String r, int s, int d, int i, int c) {
		role = r;
		strength = s;
		dexterity = d;
		intelligence = i;
		charisma = c;
	}
	
	public String setRole(String r){
		if(r != "Warrior" && r != "Wizard" && r != "Rogue"){
			r = "No Role";
		}
		role = r;
		return role;
	}
	
	public int setStrength(int s){
		if(s < 0){
			s = 0;
		}
		strength = s;
		return strength;
	}
	
	public int setDexterity(int d){
		if(d < 0){
			d = 0;
		}
		dexterity = d;
		return dexterity;
	}
	
	public int setIntelligence(int i){
		if(i < 0){
			i = 0;
		}
		intelligence = i;
		return intelligence;
	}
	
	public int setCharisma(int c){
		if(c < 0){
			c = 0;
		}
		charisma = c;
		return charisma;
	}
	
	public boolean setAll(String r, int s, int d, int i, int c){
		boolean v = (r.equals("Warrior") || r.equals("Wizard") || r.equals("Rogue"));
		boolean w = s > 0;
		boolean x = d > 0;
		boolean y = i > 0;
		boolean z = c > 0;
		
		if(v & w & x & y & z){
			return true;
		}
		return false;
	}
	
	public void myToString(){
		System.out.println("Your role is " + role);
		System.out.println("Your strength is " + strength);
		System.out.println("Your dexterity is " + dexterity);
		System.out.println("Your intelligence is " + intelligence);
		System.out.println("Your charisma is " + charisma);
	}

}

