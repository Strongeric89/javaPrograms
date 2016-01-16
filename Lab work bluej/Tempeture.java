
/**
 * Tempeture app
 * comp science
 * v1.0
 */
 
 import java.util.Scanner;
 public class Tempeture
 {
     public static void main (String args[])
     {
         Scanner scan = new Scanner(System.in);
        
         System.out.println("Please enter the tempeture between 0-100");
          int temp = scan.nextInt();
          String first_letter = null;
         
         if (temp >=0 && temp <40) 
         { System.out.println("It is cold");
            }
            else if (temp >39 && temp <60)
            {System.out.println("it is warm");
            }
            else if (temp >59 && temp <80)
            {System.out.println("it is hot");
            }
            else if (temp >79 && temp <=100)
            {System.out.println("it is v hot");
            }
            else 
            {System.out.println("please enter a number between 0-100");
                
            }
        }
    }