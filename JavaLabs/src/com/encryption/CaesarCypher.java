package com.encryption;

import java.util.Scanner;

public class CaesarCypher
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("[1]Encrypt\n[2]Decrypt\nUSER:");
		int option = scan.nextInt();

		boolean toEncrypt;
		if (option == 1)
		{
			toEncrypt = true;
		} else
		{

			toEncrypt = false;
		}

		System.out.println("Please enter the word: ");
		String word = scan.next();

		System.out.println("Please enter key: ");
		int key = scan.nextInt();

		String newWord = encrypt(word, key, toEncrypt);
		System.out.printf("Word:%s\nKey:%d\nCyperText:%s", word, key, newWord);
	}// end main

	public static String encrypt(String word, int key, boolean toEncrypt)
	{
		String newWord = "";
		if (toEncrypt == true)
		{
			for (int i = 0; i < word.length(); i++)
			{
				char letter = word.charAt(i);
				char encrypted = (char) (letter + key);
				newWord = newWord + encrypted;

			} // end for

			return newWord;

		} // end if

		else
		{
			for (int i = 0; i < word.length(); i++)
			{
				char letter = word.charAt(i);
				char encrypted = (char) (letter - key);
				newWord = newWord + encrypted;

			} // end for
			return newWord;

		} // end else

	}// end encrypt

}// end class
