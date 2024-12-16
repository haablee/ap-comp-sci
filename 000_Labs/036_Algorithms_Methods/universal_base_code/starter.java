/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr = new int [100];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)((Math.random()*99) + 1);
		}
		
		toStringArray(arr);
		getArrayAverage(arr);
		getArrayMax(arr);
		getArrayMin(arr);
	}
	
	public static void toStringArray(int [] x){
		for(int i = 0; i < x.length; i++){
			System.out.print(x[i] + ", ");
		}
	}
	
	public static int getArrayAverage(int [] x){
		int total = 0;
		for(int i = 0; i < x.length; i++){
			total = total + x[i];
		}
		return total/x.length;
	}
	
	public static int getArrayMax(int [] x){
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < x.length; i++){
			if(x[i] > max){
				max = x[i];
			}
		}
		return max;
	}
	
	public static int getArrayMin(int [] x){
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < x.length; i++){
			if(x[i] < min){
				min = x[i];
			}
		}
		return min;
	}
}
