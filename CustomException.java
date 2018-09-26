package test;

import java.util.Scanner;

public class CustomException {
	   static void checkEligibilty(int stuage, int stuweight){ 
	      if(stuage<12 && stuweight<40) {
	         throw new ArithmeticException("Student is not eligible for registration"); 
	      }
	      else {
	         System.out.println("Student Entry is Valid!!"); 
	      }
	   } 

	   public static void main(String args[]){ 
		   Scanner sc = new Scanner(System.in);
	     System.out.println("Welcome to the Registration process!!");
	     System.out.println("Enter the age of student : ");
	     int age = sc.nextInt();
	     System.out.println("Enter the weight of student : ");
	     int weight = sc.nextInt();	     
	     checkEligibilty(age,weight); 
	     System.out.println("Have a nice day.."); 
	 } 
	}

