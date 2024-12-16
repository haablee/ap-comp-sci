import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
		
		int valid1 = 0;
		int valid2 = 0;
		int valid3 = 0;
		
		for(int c = 0; c < passwords.length; c++){
			boolean flag1 = false;
			boolean flag2 = false;
			
		    if(passwords[c].length() >= 8){
		        valid1++;
		        flag1 = true;
		    }
		    if(passwords[c].contains("!") || passwords[c].contains("@") || passwords[c].contains("#") || passwords[c].contains("$") || passwords[c].contains("%") || passwords[c].contains("^") || passwords[c].contains("&") || passwords[c].contains("*")){
		        valid2++;
		        flag2 = true;
		    }
		    if(flag1 && flag2){
		    	valid3++;
		    }
		}
		System.out.println("There are " + valid1 + " valid passwords of the first strength.");
		System.out.println("There are " + valid2 + " valid passwords of the second strength.");
		System.out.println("There are " + valid3 + " valid passwords of the third strength.");
	}
}
