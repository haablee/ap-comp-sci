/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		int [] x = new int [10];
		
		int i = 0;
		int y = 10;
		while(i < 10){
			y = y - 1;
			x[i] = y;
			System.out.println(x[i]);
			i++;
		}
		
	}
}
