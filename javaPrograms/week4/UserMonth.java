package com.eric;

import java.io.Console;
public class UserMonth{
    public static void main(String [] main)
    {
        //Scanner scan = new Scanner (System.in);
        Console con = System.console();
        int day;
        int month;
        int year;
        String month1;

        System.out.println("please enter your date of birth. (DD/MM/YYYY)");
        day = Integer.parseInt(con.readLine("Day: "));
        month = Integer.parseInt(con.readLine("Month: "));
        year = Integer.parseInt(con.readLine("Year: "));

        switch(month){
            case 1 : {
                month1 = "January";
                System.out.println("January");
            }break;

            case 2 : {
                month1 = "February";
                System.out.println("February");
            }break;

            case 3 : {
                month1 = "March";
                System.out.println("March");
            }break;

            case 4 : {

                month1 = "April";
                System.out.println("April");
            }break;

            case 5 : {

                month1 = "May";
                System.out.println("May");
            }break;

            case 6 : {
                month1 = "June";
                System.out.println("June");
            }break;

            case 7 : {
                month1 = "July";
                System.out.println("July");
            }break;

            case 8 : {
                month1 = "August";
                System.out.println("August");
            }break;

            case 9 : {
                month1 = "September";
                System.out.println("September");
            }break;

            case 10 : {
                month1 = "October";
                System.out.println("October");
            }break;

            case 11 : {
                month1 = "November";
                System.out.println("November");
            }break;

            case 12 : {
                month1 = "December";
                System.out.println("December");
            }break;

            default: {
                month1 = "unknown";
                System.out.println("not a valid month");
            }break;



        }//end switch
        System.out.println("You were born on the " + day + " of " + month1 + " " + year);

    }//end main
}//end class
