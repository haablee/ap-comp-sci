/*
 *	Author:  Haabee Lee
 *  Date: 2024-10-01
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What name?");
		String name = sc.nextLine();
		
		System.out.println("How many times do you want to write it?");
		int n = sc.nextInt();
		sc.nextLine();
		
		int c = 0;
		while(c < n){
			System.out.println(name);
			c++;
		}
		

		
	}
}
