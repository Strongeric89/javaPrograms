/*
*the following program is an implementation of many methods.
*Postage Calculator-lab
*/
package com.eric;
import java.util.Scanner;
public class PostageCalculator{
    public static void main(String [] args)
    {
        //PART1
        Scanner scan = new Scanner (System.in);
        //calling the regionSelector methods
        String region = regionSelector();
        System.out.println("You selected: " + region);

        //PART2
        boolean isRunning = true;
        int items =0;
        String euro = "\u20ac";
        do{
            System.out.println("Please select number of Items:(1-50)");
            items = scan.nextInt();

            if(items >0 && items <=50 )
            {
                isRunning = false;
            }//end if
            else
            {
                System.out.println("incorrect between(1-50)");
            }//end else
        }//end do
        while(isRunning);
        double total = postCal(region,items);

        //PART3
        System.out.printf("Your total Costs will be � %.1f to send %d items",total, items);



    }//end main

    //Country Selector method
    public static String regionSelector()
    {
        String country=" ";
        Scanner scan = new Scanner (System.in);
        System.out.println("Please select a Region:");
        boolean isRunning = true;
        do{
            System.out.println("[1]Ireland\n[2]UK\n[3]Rest of EU\n[4]Rest of World\n");
            int userInput = scan.nextInt();

            switch(userInput){
                    case 1: {
                        country = "Ireland";
                        isRunning = false;

                    }break;//end case 1

                    case 2: {
                        country = "UK";
                        isRunning = false;
                    }break;//end case 2

                    case 3: {
                        country = "Rest of EU";
                        isRunning = false;
                    }break;//end case 3

                    case 4: {
                        country = "Rest of World";
                        isRunning = false;
                    }break;//end case 4

                    default: {
                        System.out.println("Not a valid Region. Try again");
                    }break;//end default
            }//end switch
        }//end do
        while(isRunning);
        return country;
    }//end regionSelector

    public static double postCal(String region,int items)
    {
        Scanner scan = new Scanner(System.in);

        double total = 0.00;
        System.out.println("Calculating the Postage:");
        switch(region)
        {
            case "Ireland": {
                total = items * 1;
                System.out.println("each item @ FREE");

            }break;//end case1

            case "UK": {
                total = items * 1.99;
                System.out.println("each item @ 1.99");

            }break;//end case2

            case "Rest of the EU": {
                total = items * 2.50;
                System.out.println("each item @ 2.50");

            }break;//end case3

            case "Rest of World": {
                total = items * 7.99;
                System.out.println("each item @ 7.99");

            }break;//end case4
        }//end switch
        return total;
    }//end postCal
}//end class
