/*
 *	Author: Haabee Lee
 *  Date: 2024-09-17
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What day is it today? Enter a number corresponding to the day, e.g. 1 = Sunday, 2 = Monday, 3 = Tuesday, etc.");
		int day = sc.nextInt();
		
		if(day == 1 || day == 7){
			System.out.println("Wake up at 10:00 AM!");
		}
		else{
			System.out.println("Wake up at 7:00 AM!");
		}
		
	}
}
