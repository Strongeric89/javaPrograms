//lab 6 q 5
import java.util.Scanner;
public class CharacterArray{
  public static void main(String [] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your characters");
    int SIZE = 5;
    char array[] = new char[SIZE];
    for(int i =0;i<SIZE;i++)
    {
      System.out.println("Enter Character #" + (i + 1));
      array[i]=scan.next(".").charAt(0);
    }//end for

    for(int i = SIZE-1;i>-1;i--)
    {
      System.out.println("character #" + (i+ 1)+ " is " + array[i]);
    }//end for

  }//end main
}//end class
