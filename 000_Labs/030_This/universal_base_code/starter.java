/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf a = new PooleDwarf(randName(), (int)Math.random());
		PooleDwarf b = new PooleDwarf(randName(), (int)Math.random());
		PooleDwarf c = new PooleDwarf(randName(), (int)Math.random());
		PooleDwarf d = new PooleDwarf(randName(), (int)Math.random());
		PooleDwarf e = new PooleDwarf(randName(), (int)Math.random());
		PooleDwarf f = new PooleDwarf(randName(), (int)Math.random());
		PooleDwarf g = new PooleDwarf(randName(), (int)Math.random());
		
		a.isSameName(b.getName());
		a.isSameName(c.getName());
		a.isSameName(d.getName());
		a.isSameName(e.getName());
		a.isSameName(f.getName());
		a.isSameName(g.getName());
		
		int duplicate = 0;
		
		if (a.isSameName(b.getName())); duplicate++;
		if (a.isSameName(c.getName())); duplicate++;
		if (a.isSameName(d.getName())); duplicate++;
		if (a.isSameName(e.getName())); duplicate++;
		if (a.isSameName(f.getName())); duplicate++;
		if (a.isSameName(g.getName())); duplicate++;
		
		System.out.print("The name was " + a.getName() + " with " + duplicate + " matches!");
		
	}
}
