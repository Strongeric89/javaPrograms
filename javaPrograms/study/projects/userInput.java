/*the Following program uses scanner class to get user input*/
import java.util.Scanner;
public class userInput{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in); //scanner class init to input and set to sys in ie..the keyboard

    System.out.println("Enter a name");
    String line = input.nextLine();
    System.out.printf("\nyou entered %s", line);


  }//endmain()
}//end class
