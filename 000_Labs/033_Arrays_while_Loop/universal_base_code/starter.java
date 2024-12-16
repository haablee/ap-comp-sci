/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] x = new int [1001];
		
		int i = 0;
		while(i < 1001){
			int y = (int)(Math.random()*100);
			x[i] = y;
			
			System.out.println(x[i]);
			
			i++;
		}


		
	}
}
