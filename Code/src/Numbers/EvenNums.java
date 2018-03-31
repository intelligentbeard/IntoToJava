//Copyright 2018 Ibrahim J.
//This program prints the Even numbers between the starting and ending integers the user provides.

package Numbers;

import java.util.Scanner;  // import scanner 

public class EvenNums {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the starting number: ");
		int startingNum = sc.nextInt();  // Take input from user

		System.out.println("Enter the ending number: ");
		int endingNum = sc.nextInt();  // Take input from user

		/*
		 * modulus % is the remainder operator of two numbers. 
		 */
		
		/* 
		 * start from the starting number(starting number also included), 
		 * and end at the ending number(ending number also included),
		 *  iterating +1 every time the loop runs.
		 */
		for (int i = startingNum; i < endingNum; ++i) {
			if (i % 2 == 0)
				System.out.println(i); // if i is even, print it.
		}  // Ending bracket of for loop
		
	}  // End bracket of main method 
}  // End bracket of public class


