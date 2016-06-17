/*fizzbuzz
it counts to 100, replacing each multiple of 5 with word fizz, each multple of 7 with buzz and each multiple of both with fizzbuzz


*/
package com.eric;
import java.util.Scanner;
public class Fizzbuzz{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a number:");
        int SIZE = scan.nextInt();
        for(int i=0;i<SIZE;i++)
        {
            if(i % 5 ==0)
            {
                System.out.println("\nFizz");
            }//end if
            else if(i % 7 ==0)
            {
                System.out.print("\nBuzz");
            }//end else if
            else if(i % 5 ==0 && i % 7 ==0)
            {
                System.out.print("\nFizzBuzz");
            }
            else
            {
                System.out.printf("\n%d",i);
            }
        }//end if
    }//end main
}//end class
