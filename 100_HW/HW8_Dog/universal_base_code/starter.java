/*
 *	Author: Haabee Lee
 *  Date: 2024/10/22
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Dog Poppy = new Dog("Poppy");
		Poppy.setAge(5);
		
		Dog Flower = new Dog("Flower", "Sheltie");
		
		
		boolean ps = Poppy.isSleeping();
		if(ps){
			System.out.println(Poppy.getName() + " is asleep.");
		}
		else{
			Poppy.bark();
		}
		
		boolean fs = Flower.isSleeping();
		if(fs != (ps != false)){
			Flower.bark();
		}
		else if(fs == (ps == false)){
			Flower.bark();
		}
		
	}
}
