/*The following program is to use a switch case*/
package com.eric;
import java.util.Scanner;
public class decisionSwitch{

    public static String enter(){

        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter a month");
        String userInput = scan.nextLine();
        return userInput;
    }


    public static int enterNum(){

        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter a month number:");
        int userInput = scan.nextInt();
        return userInput;
    }


    public static void main(String [] args)
    {

        Scanner scan = new Scanner (System.in);
        System.out.println("1.number\n2.String");
        int decision = scan.nextInt();
        if(decision ==1)
        {
            int userInput =decisionSwitch.enterNum();
            switch(userInput){

                case 1: {
                    System.out.println("You entered January");
                }break;//end case 1


                case 2: {
                    System.out.println("You entered February");
                }break;//end case 2


                case 3: {
                    System.out.println("You entered March");
                }break;//end case 3


                case 4: {
                    System.out.println("You entered April");
                }break;//end case 4


                case 5: {
                    System.out.println("You entered May");
                }break;//end case 5


                case 6: {
                    System.out.println("You entered June");
                }break;//end case 6


                case 7: {
                    System.out.println("You entered July");
                }break;//end case 7


                case 8: {
                    System.out.println("You entered August");
                }break;//end case 8


                case 9: {
                    System.out.println("You entered September");
                }break;//end case 9


                case 10: {
                    System.out.println("You entered October");
                }break;//end case 10


                case 11: {
                    System.out.println("You entered November");
                }break;//end case 11


                case 12: {
                    System.out.println("You entered December");
                }break;//end case 12

                default: {
                    System.out.println(userInput + " is not a valid month");
                }break;//end default

            }//end switch
        }//end if

        else if(decision ==2)
        {
            String userInput =decisionSwitch.enter();
            switch(userInput){

                case "January":
                case "january": {
                    System.out.println("You entered January");
                }break;//end case 1

                case "February":
                case "february": {
                    System.out.println("You entered February");
                }break;//end case 2

                case "March":
                case "march": {
                    System.out.println("You entered March");
                }break;//end case 3

                case "April":
                case "april": {
                    System.out.println("You entered April");
                }break;//end case 4

                case "May":
                case "may": {
                    System.out.println("You entered May");
                }break;//end case 5

                case "June":
                case "june": {
                    System.out.println("You entered June");
                }break;//end case 6

                case "July":
                case "july": {
                    System.out.println("You entered July");
                }break;//end case 7

                case "August":
                case "august": {
                    System.out.println("You entered August");
                }break;//end case 8

                case "September":
                case "september": {
                    System.out.println("You entered September");
                }break;//end case 9

                case "October":
                case "october": {
                    System.out.println("You entered October");
                }break;//end case 10

                case "November":
                case "november": {
                    System.out.println("You entered November");
                }break;//end case 11

                case "December":
                case "december": {
                    System.out.println("You entered December");
                }break;//end case 12

                default: {
                    System.out.println(userInput + " is not a valid month");
                }break;//end default

            }//end switch
        }//end else if

    }//end main()
}//end class
