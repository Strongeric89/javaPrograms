/*Additonal exercise on if statements*/
package com.eric;
import java.io.Console;

public class LegaltoDrive{
    public static void main(String [] args)
    {
        Console con = System.console();
        System.out.println("Please enter you age:");
        int age = Integer.parseInt(con.readLine("Users_age:"));

        if(age >= 17 )
        {
            System.out.println("You are legal to drive a car in Ireland");

            if(age >= 23)
            {
                System.out.println("You are also legal to drive a car anywhere in the world");
            }//end if
        }//end if
        else
        {
            System.out.println("Sorry you are not legal age to drive in Ireland");
        }//end else
    }//end main
}//end class
