/*the following game is paper rock scissors*/
package com.eric;
import java.util.Scanner;
import java.util.Random;
public class PRS{
  public static void main(String [] args)
  {
    Scanner scan = new Scanner(System.in);
    Random r = new Random();
    String games[] = {"Paper","Rock","Scissors","Paper","Rock","Scissors"};
    String messages[] = {"oooohh Sorry!", "hard luck!","too bad", "a machine beat you!"};
    int rand = (r.nextInt(3));
    int randNum = (r.nextInt(5));
    int userScore=0;
    int compScore=0;
    int flag =0;
    System.out.print("Enter your Name: ");
    String name = scan.nextLine();
    //0 = paper , 1=Rock, 2=scissors
    System.out.print("Define how many rounds...best out of: ");
    int bestoutof = scan.nextInt();
    System.out.println("Let the Games Begin......");

    while(flag ==0)
    {
      rand= (r.nextInt(3));
      randNum = (r.nextInt(5));
      //System.out.println("Random word is " + games[randNum]);

      System.out.println("---------------------------------------------");

      System.out.println("\t"+name + "= " + userScore + "\tCOMP=" + compScore);
      System.out.println("\nPaper, Rock, Scissors...Ready.....\n\n");
      System.out.print(name + " :");
      String userInput = scan.nextLine();
      System.out.println("1......");
      scan.nextLine();
      System.out.println("2......\n");

      if(userInput.equalsIgnoreCase("Rock") && games[randNum].equalsIgnoreCase("scissors"))
      {
        System.out.println(name + " WINS!. \nUSER=" + userInput + "\tCOMP=" + games[randNum]);
        userScore ++;
      }//end scissors/rock
      else if(userInput.equalsIgnoreCase("scissors") && games[randNum].equalsIgnoreCase("Rock"))
      {
        System.out.println(messages[rand]);
        System.out.print(" COMP WINS!.\n" + name + " =" + userInput + "\tCOMP=" + games[randNum]);
        compScore ++;
      }//end scissors/Rock

      else if(userInput.equalsIgnoreCase("Paper") && games[randNum].equalsIgnoreCase("Rock"))
      {
        System.out.println(name + " WINS!. \nUSER=" + userInput + "\tCOMP=" + games[randNum]);
        userScore ++;
      }//end paper/Rock

      else if(userInput.equalsIgnoreCase("Rock") && games[randNum].equalsIgnoreCase("Paper"))
      {
        System.out.println(messages[rand]);
        System.out.print(" COMP WINS!\n" + name + " =" + userInput + "\tCOMP=" + games[randNum]);
        compScore ++;
      }//end paper/Rock

      else if(userInput.equalsIgnoreCase("Paper") && games[randNum].equalsIgnoreCase("Scissors"))
      {
        System.out.print(messages[rand]);
        System.out.println("\nCOMP WINS!\n" + name + "=" + userInput + "\tCOMP=" + games[randNum]);
        compScore ++;
      }//end paper/scissors

      else if(userInput.equalsIgnoreCase("Scissors") && games[randNum].equalsIgnoreCase("Paper"))
      {
        System.out.println(name + "WINS!.\nUSER=" + userInput + "\tCOMP=" + games[randNum]);
        userScore ++;
      }//end paper/Scissors

      else if(userInput.equalsIgnoreCase("Paper") && games[randNum].equalsIgnoreCase("Paper"))
      {
        System.out.println("DRAW!" + name + "=" + userInput + "\tCOMP=" + games[randNum]);

      }//end paper/paper
      else if(userInput.equalsIgnoreCase("Scissors") && games[randNum].equalsIgnoreCase("Scissors"))
      {
        System.out.println("DRAW!" + name + "=" + userInput + "\tCOMP=" + games[randNum]);

      }//end Scissors/Scissors
    else if(userInput.equalsIgnoreCase("Rock") && games[randNum].equalsIgnoreCase("Rock"))
      {
        System.out.println("DRAW!" + name + "=" + userInput + "\tCOMP=" + games[randNum]);

      }//end Rock/Rock
      //print spaces
      for(int i=0;i<5;i++)
      {
        System.out.println(" ");
        if(userScore == bestoutof || compScore == bestoutof)
        {
          flag = 1;
          break;
        }//end if
      }//end for

    }//end do

    System.out.println("---------------------------------------------");
    System.out.println("\t"+name + "= " + userScore + "\tCOMP=" + compScore);

    if(userScore == bestoutof)
    {
      System.out.println(name + " Wins! GAME OVER");
    }
    else
    {
      System.out.println("Computer Wins! GAME OVER");
    }
  }//end main
}//end class
