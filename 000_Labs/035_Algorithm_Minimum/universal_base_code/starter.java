/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		int x = (int)((Math.random()*149)+51);
		int [] arr = new int [x];
		System.out.println("Elements (Size): " + x);
		
		for(int i = 0; i < arr.length; i++){
			 arr[i] = (int)((Math.random()*99)+1);
		}
		System.out.print("Elements (Value): ");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
		
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		System.out.println("Min: " + min);
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println("Max: " + max);
		
		int n = 0;
		double avg = 0;
		for(int i = 0; i < arr.length; i++){
			n = n + arr[i];
		}
		avg = n/((double)(arr.length));
		System.out.println("Average: " + avg);
		
	}
}
