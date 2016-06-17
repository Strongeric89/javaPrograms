import java.util.Scanner;
import java.io.Console;

public class nameGame{
   public static void main(String [] args)
   {

      System.out.println("Please enter the number of words you want?");
      Scanner scanf = new Scanner(System.in);
      Console con = System.console();
      int num = scanf.nextInt();
      System.out.println("Please enter your words....");
      String words[]= new String [num];

      for(int i=0;i<num;i++)
      {
         words[i] = con.readLine("enter word #" + (i + 1) + " Please: ");

      }//end for

      System.out.println("Enter a number at random to pick that word.");
      int guess = scanf.nextInt();
      guess = guess -1;
      if(guess <= num )
      {
         System.out.printf("the word you requested is %s",words[guess]);
      }//end if
      else
      {
         System.out.println("Not a valid number!");
      }//end else

   }//end main
}//end class
