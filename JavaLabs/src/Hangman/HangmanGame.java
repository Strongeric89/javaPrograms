package Hangman;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Eric Strong Date: 19 Dec 2016 Lab: Hangman Game
 */
public class HangmanGame
{
	public static Scanner scan = new Scanner(System.in);
	public static String listOfWords[] =
	{ "java", "python", "ruby", "html", "bootstrap", "javaScript", "c" };

	public static ArrayList<String> letters = new ArrayList<String>();
	public static ArrayList<String> wrongGuesses = new ArrayList<String>();
	public static ArrayList<String> correctGuesses = new ArrayList<String>();

	public static void main(String[] args)
	{
		Random r = new Random();
		// select a word from the array at random
		int size = listOfWords.length;
		// selects a random index from the list of words
		int randInt = r.nextInt(size);
		String word = listOfWords[randInt];
		System.out.println("todays word is: " + word);

		// load the letters into the array list
		for (int i = 0; i < word.length(); i++)
		{
			char letter = word.charAt(i);
			String letter1 = "" + letter;
			letters.add(letter1);
			correctGuesses.add("_");

		}

		// users guess
		game();

	}// end main

	public static void game()
	{
		int lives = letters.size();
		System.out.println("Today's Word has " + letters.size() + " Letters");

		System.out.println("\nLives = " + lives + "\nPlease Guess your Letter:");
		while (lives != 0)
		{

			if (letters.size() == 1)
			{
				System.out.println("Congratulations you guessed all the letters!");
				break;
			} // end if

			else
			{

				// check if the letter exists in the letters
				for (String i : letters)
				{
					int count = 0;

					for (String j : correctGuesses)
					{
						System.out.print(j + " ");
					}
					String guess = scan.next();

					if (i.equalsIgnoreCase(guess))
					{
						// letter found
						System.out.println("Correct! : " + guess);

						int index = letters.indexOf(guess);
						wrongGuesses.add(guess);
						correctGuesses.set(index, guess);
						// letters.remove(guess);

					} // end if
					else
					{

						// wrong attempt
						System.out.print("Wrong Guesses: " + wrongGuesses);

						lives -= 1;
					}
				}

			} // end else
		} // end while
		System.out.println("\n\nHard Luck. You lost!");

	}

}// end class
