/*	File: Vowels.java
 * 	Author: Alex Combas
 * 	TRUid: 	T00655895
 * 	Course: COMP 1131 Assignment 3 Question 2
 * 	
 * 	Description: An application that reads a string from the user, then determines 
 * and displays how many (of each) vowels (a, e, i, o, and u) appear in the entire 
 * string. Have a separate counter for each vowel. Also count and print the number 
 * of non-vowel characters. The logic must include a switch-case structure to determine 
 * which counter to increment.
 */

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		
		// store String words in lower case
		String words = scan.nextLine().toLowerCase();
		
		// A variable for each vowel, and other to store the rest
		int a = 0, e = 0, i = 0, o = 0, u = 0, other = 0;
		
		// iterate once for each letter
		for (int j = 0; j < words.length(); j++) {
			
			// use the counter variable to iterate through each letter
			char c = words.charAt(j);
			
			// each case will increment the corresponding vowel that is matched
			switch (c) {
			case 'a':
				a++;
				break;
			case 'e':
				e++;
				break;
			case 'i':
				i++;
				break;
			case 'o':
				o++;
				break;
			case 'u':
				u++;
				break;
			default:
				// everything that is not a vowel is incremented here
				// includes space and punctuation
				other++;
			}
		}
		
		System.out.println("a : " + a);
		System.out.println("e : " + e);
		System.out.println("i : " + i);
		System.out.println("o : " + o);
		System.out.println("u : " + u);
		System.out.println("Other : " + other);

		scan.close();
	}

}
