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
		System.out.println("Please enter a sentence or a phrase:");
		String sentence = sc.nextLine();
		
		String backwards = "";
		
		while(true){
			if(sentence.indexOf(" ") == -1){
				backwards = sentence + " " + backwards;
				break;
			}
			int space = sentence.indexOf(" ");
			String word = sentence.substring(0, space);
			String WORD = word;
			
			backwards = WORD + " " + backwards;
			
			sentence = sentence.substring(space + 1);
		}
		System.out.println(backwards);

	}
	
}
