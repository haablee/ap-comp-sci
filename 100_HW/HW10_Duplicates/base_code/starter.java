/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int [] arr = new int [20];
		for(int i = 0; i < arr.length; i++){
			 arr[i] = (int)((Math.random()*9)+1);
		}
		
		System.out.print("Here are the 20 numbers in this array: ");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
		System.out.println();
		
		
		int comp = (int)((Math.random()*9)+1);
		System.out.println("Comparing Number: " + comp);
		
		int dup = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == comp){
				System.out.println("Duplicate found at index: " + i);
				dup++;
			}
		}
		System.out.println("Total number of duplicates: " + dup);
		
		
		for(int i = 0; i < arr.length - 1; i++){
			if(arr[i] == arr[i + 1]){
				System.out.println("Two in a row found at indexes " + i + " and " + (i + 1));
			}
		}
		
	}
}
