/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Warrior [] warrior = new Warrior [100];
		Wizard [] wizard = new Wizard [100];
		
		for(int i = 0; i < warrior.length; i++){
			warrior[i] = new Warrior();
		}
		
		for(int i = 0; i < wizard.length; i++){
			wizard[i] = new Wizard();
		}
		
		int c = 0;
		int k = 0;
		while(c < wizard.length && k < warrior.length){
			wizard[c].attack(warrior[k]);
			if(warrior[k].isDead()){
				k++;
			}
			if(k == warrior.length-1){
				System.out.print("Wizards have won with " + (100-c) + " wizards left.");
				break;
			}
			
			warrior[k].attack(wizard[c]);
			if(wizard[c].isDead()){
				c++;
			}
			if(c == wizard.length-1){
				System.out.print("Warriors have won with " + (100-k) + " warriors left.");
				break;
			}
		}
		
	}
}
