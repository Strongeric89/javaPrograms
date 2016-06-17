/*the following program is a Guessing Game. The computer picks a number at random and the user must guess it. A score is decremented everytime an incorrect guess is made. if wrong the computer will tell you higher or lower
Author: Eric Strong
Date: 08/06/2016
*/
package com.eric;
import java.io.*;
import java.io.IOException;
import java.util.*;
public class GuessingGame{
    public static void main(String [] args)throws IOException
    {
        Console con = System.console();
        FileWriter fileout = new FileWriter("GuessingGameScores.txt");
        PrintWriter text = new PrintWriter(fileout);
        String name;
        Random r = new Random();
        Scanner scan = new Scanner(System.in);
          //generate a random number between 0 and 100

        System.out.println("\nRandom Number Selected....\n-------------------------------\n");
        int flag =0;
        int array[] = new int[11];
        int gameStart=0;
        int tries=0;

        boolean isCorrect = false;
        boolean isRunning = true;
        int score = 100;
        while(isRunning)
        {
            int gameNumber = (r.nextInt(100));
            System.out.println("Enter your name:");
            name = con.readLine();
            if(name.equalsIgnoreCase("end"))
            {
                isRunning = false;
                break;
            }//end if

            do
            {
                if(gameStart>0)
                {
                    for(int i =1;i<gameStart+1;i++)
                    {
                        System.out.printf("\nGUESSED NUMBER %d. %d ",i,array[i]);
                    }//end for
                }//end if
                System.out.println("\n\nSCORE: " + score);

                System.out.print("\nPlease Enter a number between (0-100):\n" + name + ": ");
                int userNumber=  scan.nextInt();
                System.out.println("\n-------------------------------\n");

                tries ++;

                if(userNumber == gameNumber)
                {
                    isCorrect = true;
                    flag =1;
                    break;
                }//end if
                else
                {
                    gameStart ++;
                    array[gameStart]=userNumber;
                    System.out.println("\n\t(minus 10 points!)");
                    score =score -10;
                    if(score ==0)
                    {
                        System.out.println("\nYOU LOOSE! the number was " + gameNumber);
                        break;
                    }//end if
                    if(userNumber < gameNumber)
                    {
                        System.out.println("\n\t....oooh TOO LOW! try again!");
                    }//end if
                    if(userNumber > gameNumber)
                    {
                        System.out.println("\n\t....Wooooow TOO HIGH!!");
                    }//end if

                    if(userNumber < 0 && userNumber > 100)
                    {
                        System.out.println("\n\t....Number outside range! try again!!");
                    }//end if

                }//end else
            }//end do
            while (isCorrect == false);
            if(flag ==1)
            {
                text.println(name + ": Congratulations!! you win!! the number was " + gameNumber + "\nYour Score is " + score);
                text.println("It took you " + tries + " attempts to guess!");

                System.out.println("\n\n\tCongratulations!! you win!! the number was " + gameNumber + "\nYour Score is " + score);
                System.out.println("It took you " + tries + " attempts to guess!");
                System.out.println("-------------------------------------------------");
                text.println("-------------------------------------------------");
            }//end if
            else{
                text.println("\n\t" + name + ": You lost!\t");
                System.out.println("\n\t" + name + ": You lost!\t");
                for(int i =1;i<gameStart+1;i++)
                {
                    text.printf("\nGUESSED NUMBER %d. %d ",i,array[i]);
                    System.out.printf("\nGUESSED NUMBER %d. %d ",i,array[i]);

                }//end for
                System.out.println("-------------------------------------------------");
                text.println("-------------------------------------------------");
            }//end else
        }//end while
        text.close();

    }//end main()
}//end class
