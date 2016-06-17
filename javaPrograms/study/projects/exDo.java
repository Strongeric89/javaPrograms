/*the following is to practice do while loops*/
import java.util.Scanner;
public class exDo{
  public static void main(String [] args)
    {
      Scanner scanf = new Scanner (System.in);
      int num;
      int i=0;

      //implementing the do while
      do {
        System.out.println("Please  Guess a Number:");
        num = scanf.nextInt();
        System.out.println("Sorry. Try again!");
        i ++;

      }//end do
      while(num !=5);
      System.out.println("Well done you guessed correctly!\n it only took you " + i + " Guesses");
    }//end main()

}//end class
