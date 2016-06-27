/*
 * the following program is a menu driven game to print x amount of stars. implemented 
 * by functions in Java
 */
package com.eric;
import java.util.Scanner;
import java.util.Random;

public class Stars {
	public static void main(String [] args)
	{
		
        
		Scanner scan = new Scanner (System.in);
		Random r = new Random ();
		int userInput;
		int number=0;
		int randNum = r.nextInt(100);
		char exit;
		boolean isRunning = true;
		while(isRunning)
		{
			System.out.println("\n[1]Specify the amount of stars\n[2]Random amount of stars\n[3]End Game");
			userInput = scan.nextInt();
			switch(userInput)
			{
				case 1: {
					System.out.println("Please Specify the amount of stars to print:");
					number = scan.nextInt();
					printStars(number, userInput);
				}break;//end case
				
				case 2: {
					
					printStars(randNum, userInput);
				}break;//end case 2
				
				case 3:{
					System.out.println("you chose option 3. Are you sure you want to end the game?");
					exit = scan.next(".").charAt(0);
					
					if(exit == 'Y' || exit =='y')
					{
						System.out.println("Goodbye!");
						isRunning = false;
					}//end if
					
				}break;//end case 3
				default : {
					System.out.println("not a valid Option!");
				}break;
			}//end switch
			randNum = r.nextInt(100);
		}//end while
		
	}//end main
	public static void printStars(int num, int user)
	{
	
		System.out.println("You chose Option " + user);
		System.out.println("Printing " + num + " Stars");
		for(int i =0; i < num;i++)
		{
			System.out.print("* ");
		}//end for
	}//printStars
	
}//end class
