/**
 * New Tables app
 * Version 1.0
 * Eric Strong
 */

import java.util.Scanner;

public class New_Table
{
    public static void main(String [] args)
    {
        Scanner Userinput = new Scanner(System.in);
        String first_name;
     int first_number;
        System.out.print("Hello. Please enter your name :");
        first_name = Userinput.nextLine ();
        System.out.print("Hi" + first_name + "Please enter the number of the timestable you would like to see");
       first_number = Userinput.nextInt ();
        
            for(int first_number;first_number<13;first_number++)
        {
            for(int y=1;y<13;y++)
            {
                System.out.println(first_number + "+" + y + "=" + (first_number+y));
            }
        }
    }
}
