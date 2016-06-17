/*months til Christmas!*/
package com.eric;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;
public class MonthsTilXmas{
    public static int counter(String current)
    {

        int totalMnts = 0;
        switch(current)
        {
            case "January": totalMnts ++;
            case "February": totalMnts ++;
            case "March": totalMnts ++;
            case "April": totalMnts ++;
            case "May": totalMnts ++;
            case "June": totalMnts ++;
            case "July": totalMnts ++;
            case "August": totalMnts ++;
            case "September": totalMnts ++;
            case "October": totalMnts ++;
            case "November": totalMnts ++;
            case "December": totalMnts ++;
        }//end switch
        return totalMnts;
    }//end counter
    public static void main(String [] args)throws IOException
    {
        FileWriter outFile = new FileWriter("monthsTilXmas.txt");
        PrintWriter text = new PrintWriter(outFile);
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Month: ");
        String current_month = scan.nextLine();
        int monthsTil = MonthsTilXmas.counter(current_month);
        System.out.println("It is " + monthsTil + " months until Christmas!");
        text.println("It is " + monthsTil + " months until Christmas!");

        text.close();
    }//end main
}//end class
