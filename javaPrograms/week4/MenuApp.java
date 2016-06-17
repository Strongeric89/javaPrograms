/*
* the following program is the use of a Do while loop menu driven game
*
*/
package com.eric;
import java.util.Scanner;
public class MenuApp{
    public static void main(String [] args)
    {
        //creating scanner object
        Scanner scan = new Scanner(System.in);
        //boolean for while
        boolean isRunning = true;
        do{
            //menu output
            System.out.println("Please Pick an option:\n\n[1]A nice Compliment\n[2]A piece of information\n[3]A joke\n[4]Exit");
            //user input
            int userOption = scan.nextInt();
            //switch through the options
            switch(userOption){
                case 1: {
                    System.out.println("You are loosing loads of weight and look great!");

                }break;//end case1
                case 2: {
                    System.out.println("Did you know Dean loves Games!!");
                }break;//end case 2
                case 3: {
                    System.out.println("What did one computer say to the other?");
                    System.out.println("010101101010101010101");

                }break;//end case 3
                case 4: {
                    System.out.println("You picked Exit.");
                    System.out.println("Are you sure?? [Y/N]");
                    //graceful termination
                    char exit = scan.next(".").charAt(0);
                    if(exit == 'Y' || exit == 'y')
                    {
                        isRunning = false;
                    }//end if
                }break;//end case 4
                default : {
                    System.out.println("Not a valid Option!");
                }break;//end default
            }//end switch
        }//end do
        while(isRunning);
        System.out.println("Thank you. GoodBye");

    }//end main
}//end class
