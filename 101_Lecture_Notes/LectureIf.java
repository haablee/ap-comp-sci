/* 
    Lecture note example - If Statements
*/

import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        // Your Code Goes here!
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if(num > 10){
            System.out.println("Your number is greater than 10");
        }
        
        else{
            //THIS ELSE CATCHES EVERYTHING ELSE
            //GREATER THAN OR EQUAL TO 10
            System.out.print("Your value isn't greater than 10");
        }
    }
}
        
        

        int      //Yes Primitive
        string   //Not Primitive
        double
        Scanner
        
        PRIMITIVE DATA
        These are foundational blocks of data 
        (lower case data, int, double boolean, char, float, long, etc.)
        
        String is NOT primitive because it is made up of char's.
        'h' + 'e' + 'l' + 'l' + 'o'  --> 
        
        
        BOOLEANS
        VALUES = true or false
        
        boolean x = true;
        boolean y = false;
        
        These are the ONLY values a boolean can store.
        Beyond that, we can store Expressions.
        These act as answers to YES/NO questions.
        
        
        boolean z = 5 > 3;   //Greater than
        boolean a = 3 < 4;   //Less than
        boolean b = 4 == 4;  //Equal to
        boolean c = 4 != 5;  //NOT Equal to
        boolean d = 3 <= 3;  //Less than or equal to
        boolean e = 5 >= 8;  //Greater than or equal to
        
        
        These are all the expressions we can use for PRIMITIVE DATA ONLY.
        
        Above we compare JUST integers.
        boolean f = 5.5 != 6.5;
        boolean g = true == false;
        
        We cannot use these to compare String.
        
        
        FOR STRINGS
        NEW METHOD
        
        .equals()
        boolean h = ("hello").equals("hello");
        
        Strings must use the .equals method to compare.
        This does a letter by letter comparison till finished or different.
        
        
        
        IF STATEMENTS
        We can start to CHOOSE our own adventure! 
        
        
        This whole chunk is called a "BRANCH"
        if(x > 5){
            This runs when x s is bigger than 5
        }
        
        else if(x < 5){
            This runs when x is NOT bigger than 5
            AND
            when x is smaller than 5
        }
        
        else{
            This runs when x is equal to 5
            but not smaller or greater than 5
        }
        
        
        
        if(5 > 3){  // <- here we can place a questions or answer
            //IF THE CONDITIION ABOVE IS TRUE
            //THEN THIS CODE RUNS
            System.out.print("This runs!");
        }
        
        if (a){
            System.out.print("This runs too!");
        }
        
        else if(3 < 4){
            System.out.print("This runs!");
        }
        
        else if(4 != 5){
            System.out.print("This will run!");
        }
        
        else if(4 == 4){
            System.out.print("Yay, it runs!");
        }
        
        else if(3 <= 3){
            System.out.print("The statement is true.");
        }
        
        else if(5 >= 8){
            System.out.print("This won't run because it is false.");
        }


