/*The following program is to test boolean and logical conditions if and else*/
package com.eric;
import java.util.Scanner;
class Age{
    Scanner scan = new Scanner(System.in);
    public int getAge()
    {
        System.out.println("Please enter your age:");
        int user_age = scan.nextInt();
        return user_age;
    }//end getAge

}//end class

public class Over18{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        Age age = new Age();

        int user_age = age.getAge();
        if(user_age < 18)
        {
            System.out.println("You are too young. Not allowed into the Nightclub");
        }//end if
        else
        {
            System.out.println("Welcome to the Nightclub");
            System.out.println("What is your favourite Drink?");
            String drink = scan.nextLine();
            if(drink.equals("Bud") || drink.equals("heineken"))
            {
                System.out.println("That will be 6.50 please");
            }//end if
            else
            {
                System.out.println("We do not have " + drink + " in this pub. Sorry");
            }//end else

        }//end else

    }//end main
}//end class
