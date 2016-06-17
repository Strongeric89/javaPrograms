/*The following program is an implementation of a password verification
Author: eric Strong
Date: 08/06/2016
*/
package com.eric;//chabges
import java.util.Scanner;
public class PasswordVerifier{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        String UserName,Password,User1,Pass1;
        boolean isNotConfirmed = false;

        System.out.println("Please enter your username:");
        UserName = scan.nextLine();

        System.out.println("Please enter your Password:");
        Password = scan.nextLine();
        //verify the process

        System.out.println("Please Verify your Username and Password:");
        do
        {
            System.out.print("Username:\t");
            User1 = scan.nextLine();

            System.out.print("Password:\t");
            Pass1 = scan.nextLine();
            if(User1.equalsIgnoreCase(UserName) && Pass1.equals(Password))
            {
                isNotConfirmed =true;
                break;
            }//end if
            System.out.println("username or password incorrect. Try again!");

        }//end do
        while(isNotConfirmed == false);
        System.out.println("username and password confirmed! thank you");
    }//end main()

}//end class
