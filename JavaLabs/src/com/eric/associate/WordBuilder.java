package com.eric.associate;

import java.util.Scanner;

/**
 * @author Eric Date: 22 Dec 2016 Lab: word builder - extra homework challenge
 */
public class WordBuilder
{
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args)
	{
		// part 1
		System.out.println("Welcome to the word builder.");
		System.out.println("Enter your first word:");
		String firstWord = scan.next();
		System.out.println("Enter your second word:");
		String secondWord = scan.next();

		String thirdWord = secondWord + firstWord;
		System.out.println("Your new word is: " + thirdWord);

		// part 2
		int len = thirdWord.length();

		// odd logic
		if (len / 2 == 1)
		{
			// get middle letter
			int index = len / 2;
			char middle = thirdWord.charAt(index);

			System.out.printf("\nThere are %d letters in the new Word", len);
			System.out.printf("\nThe middle letter is %c ", middle);

			String newWord = String.format("%s", middle) + thirdWord + String.format("%s", middle);
			System.out.println(newWord);
		} else
		{
			// get middle letter
			int index = len / 2;
			String middle = thirdWord.substring(index, (index + 1));

			System.out.printf("\nThere are %d letters in the new Word", len);
			System.out.printf("\nThe middle letter(s) are %s ", middle);

			int firstLen = firstWord.length();
			char lastOfFirstWord = firstWord.charAt(firstLen - 1);
			char firstOfLastWord = secondWord.charAt(0);
			String part3 = String.format("%s", lastOfFirstWord) + String.format("%s", firstOfLastWord);

			String newWord = part3 + thirdWord + part3;
			System.out.println(newWord);

		}

	}// end main

}// end class
