/*implementation of Hangman*/
package com.eric;
import java.util.Scanner;
import java.util.Random;
public class Hangman{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        String words[] = {"Hello", "World", "Java","Metallica","Python","Javascript","Ruby","CSS","Windows","Linux"};

        //Random Word Generator


        int gameNumber = (r.nextInt(words.length));
        String gameWord = words[gameNumber];
        //output the Random Word
        System.out.println(gameWord);
        int length = (gameWord.length());
        System.out.println("The word has " + length + " characters");
            char guesses[] = new char[length];
        char first = gameWord.charAt(0);
        System.out.println("The first letter in the word is " + first);
        guesses[0] = first;
        System.out.println("Guess the remaining " + (length -1) + " letters in the word.");
        char userInput;
        int score = 0;
        int endGame = 1;

        char guessWord[] = new char[length];

        for(int i =0;i<length;i++)
        {
            first = gameWord.charAt(i);
            guessWord[i] = first;

        }//end for

        //System.out.println(guessWord);

        //game logic
        for(int i = 0;i<length-1;i++)
        {
            //read in users letter
            userInput = scan.next(".").charAt(0);

            //check users letter if is in the word
            for(int j=1;j<guessWord.length;j++)
            {
                if(userInput == guessWord[j])
                {
                    System.out.println("Correct!\nYour Guesses:");

                    endGame++;

                    //remove element from array
                    for(int k= j +1;k<guessWord.length;k++)
                    {
                        guessWord[j] = guessWord[k];
                        j++;
                        guesses[j] = guessWord[j];
                    }//end for
                    System.out.println("\t" + guesses[i]);

                    break;
                }//end if
                else
                {
                    score ++;
                    System.out.println("Incorrect guess! Score:" + score );
                    break;
                }//end else
            }//end inner for
        }//end for
        if(score == (length*2))
        {
            System.out.println("Sorry you guessed wrong. Game over. the word was " + gameWord);
        }//end if
        if(endGame == (length))
        {
            System.out.println("Well done. you guessed all the correct letters!" + gameWord);
        }//end if
    }//end main
}//end class
