//The following program is to colulate the hours played per year. Eric and Peter
package com.EricPeter;
import java.util.Scanner;
public class gaming{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner(System.in);  //initializing scanner instance
        System.out.println("Welcome User to Gaming time calculator");  //welcome prompt
        System.out.println("Enter your GameTag/Username:"); //prompt user
        String username = scan.nextLine(); //take users input store to variable
        System.out.println("Enter your favourite game:"); // prompt user
        String favGame = scan.nextLine(); //take users input store to variable

        //calculate gamming hours
        System.out.println("how many hours per year do you play games"); // prompt user
        int hoursYear = scan.nextInt();

        //calculations
        float hoursPerWeek = hoursYear / 52;
        float hoursPerDay = hoursPerWeek / 7;

        System.out.println(username + ": your favourite game is " + favGame + " . you play " + hoursPerDay + " hours of this game a day");
        //addtional
        System.out.println("Hours Per year:" + hoursYear);
        System.out.println("Hours Per Month:" + hoursYear / 12);
        System.out.println("Hours Per Week:" + hoursPerWeek);
        System.out.println("Hours Per Day:" + hoursPerDay);

    }//end main()
} //end class
