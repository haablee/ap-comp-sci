/*
	Author: Haabee Lee
	Date: 2024/10/28
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Spiderman tobey = new Spiderman("Tobey Maguire");
		tobey.setAge(48);
		tobey.setVillain("Green Goblin");
		
		Spiderman andrew = new Spiderman("Andrew Garfield");
		andrew.setAge(40);
		andrew.setVillain("Electro");
		
		Spiderman tom = new Spiderman("Tom Holland");
		tom.setAge(27);
		tom.setVillain("The Vulture");
		
		Spiderman fart = new Spiderman("Fart");
		fart.setAge(5);
		fart.setVillain("Poop");
	}
}
