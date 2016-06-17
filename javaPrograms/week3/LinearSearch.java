/*the following program is an implementation of Linear Search algorithm*/
package com.eric;
import java.util.*;
public class LinearSearch {
    public static void main(String [] args)
    {
        Random r = new Random();
        Scanner scan = new Scanner (System.in);
        int flag = 0;
        int pos=0;
        System.out.println("How many elements for the array?");
        int SIZE = scan.nextInt();
        int array[] = new int[SIZE];
        System.out.println("Populate the array with random numbers...");
        for(int i=0;i<array.length;i++)
        {
            array[i] = (r.nextInt(1000));
            System.out.println("element " + (i + 1) + ": " + array[i]);

        }//end for

        System.out.println("Enter the key element to search for...");
        int key = scan.nextInt();

        //implementing the linear Search algorithm
        while(pos <= SIZE)
        {

            if(key == array[pos])
            {
                flag = 1; //exit the loop
                break;
            }//end if
            pos++;
        }//end while
        if(flag == 1)
        {
            System.out.println("Key:" + key + " found at position " +
            (pos + 1));
        }//end if
        else
        {
            System.out.println("Value " + key + " is not in the array");
        }//end else

    }//end main
}//end class
