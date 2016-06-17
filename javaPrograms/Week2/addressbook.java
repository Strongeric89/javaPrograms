//the following program is to build an address book, you enter END to end the address book and will print out the contents
package com.eric;
import java.util.Scanner;
import java.io.*;
import java.io.IOException;
public class addressbook {
    public static void main(String [] args)throws IOException
    {
        FileWriter fileOut = new FileWriter("PhoneBook.txt");
        PrintWriter text =  new PrintWriter(fileOut);
        Scanner scan = new Scanner(System.in);
        String name[] = new String[100];
        String dob[] = new String[100];
        String phone[] = new String [100];
        int i=0;
        boolean flag =false;

        do
        {
            //name
            System.out.print("\nEnter First Name and Surname #" + (i +1) + " : ");
            name[i] = scan.nextLine();
            //dob
            System.out.print("\nEnter date of birth (DD/MM/YYYY)#" + (i+1) + " : ");
            dob[i] = scan.nextLine();
            //phone number
            System.out.print("\nEnter Phone number #" + (i+1) + " : ");
            phone[i] = scan.nextLine();
            System.out.println("Record added to database");

            System.out.println(" ");

            if(name[i].equalsIgnoreCase("end") || dob[i].equalsIgnoreCase("end") || phone[i].equalsIgnoreCase("end"))
            {
                flag = true;
                break;
            }//end if
            else{
                i++;
            }//end else

        } //end doc
        while(flag != true);
        System.out.println("Printing Address book....");
        for(int counter =0;counter<i;counter++)
        {
            text.println("#" + (counter + 1) + ": " + name[counter] + ": " + dob[counter] + ": " + phone[counter] );
            System.out.println("Record #" + (counter + 1) + ": " + name[counter] + ": " + dob[counter] + ": " + phone[counter] );
        }//end for
        text.close();
    }//end main
}//end class
