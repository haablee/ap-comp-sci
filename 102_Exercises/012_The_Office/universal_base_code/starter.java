/*
 *	Author: Haabee Lee
 *  Date: 2024/10/22
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		michael.raiseSalary(8);
		double raise1 = michael.getAnnualSalary();
		System.out.println("Employee Annual Salary (with raise): " + raise1);
		
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.employeeToString();
		dwight.raiseSalary(6);
		double raise2 = dwight.getAnnualSalary();
		System.out.println("Employee Annual Salary (with raise): " + raise2);
		
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.employeeToString();
		jim.raiseSalary(7);
		double raise3 = jim.getAnnualSalary();
		System.out.println("Employee Annual Salary (with raise): " + raise3);
		
		Employee pam = new Employee(2011, "Pamm", "Beesly", 2250);
		pam.employeeToString();
		pam.raiseSalary(9);
		double raise4 = pam.getAnnualSalary();
		System.out.println("Employee Annual Salary (with raise): " + raise4);
		
		Employee poppy = new Employee(0001, "Poppy", "Poop", 5500.12);
		poppy.employeeToString();
		poppy.raiseSalary(5);
		double raise5 = poppy.getAnnualSalary();
		System.out.println("Employee Annual Salary (with raise) " + raise5);
		
		
	}
}
