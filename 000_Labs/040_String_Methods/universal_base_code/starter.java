/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a name: ");
		String name = sc.nextLine();
		
		int space = name.indexOf(" ");
		String lastName = name.substring(space + 1);
		System.out.println(lastName);
		
		
	}
}
