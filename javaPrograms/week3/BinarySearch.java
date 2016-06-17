/*the following program is the implementation of Binary Search algorithm. NOTE: the array must be sorted first. use selection sort algorithm
Author: Eric Strong
Date: 08/06/2016
*/
package com.eric;
import java.util.*;
class BinSearch{
    Scanner scan = new Scanner(System.in);

    public int search(int numbers[], int SIZE)
    {
        //implementing the binary search algorithm
        int pos=0;
        int first =0;
        int last = SIZE-1;
        int middle = first + last /2;
        System.out.println("What element are you searching for??");
        int key = scan.nextInt();
        while(first <= last)
        {
            if(numbers[middle] < key)
            first = middle + 1;

            else if(numbers[middle] == key)
            {
                System.out.printf("%d found!\nFound at position %d", key,middle + 1);
                break;
            }
            else

                last = middle -1;
                middle = first + last/2;

                if(first > last)
                {
                    System.out.println("Key " + key + " not found in array");
                }//end if

        }//end while

        return (middle + 1);
    }//end search
}//end class

public class BinarySearch{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        BinSearch binS = new BinSearch();
        int temp=0;
        System.out.println("How many elements in the array?");
        int SIZE = scan.nextInt();
        int numbers[] = new int[SIZE];
        for(int i=0;i<numbers.length;i++)
        {
            numbers[i] = (r.nextInt(1000));
            System.out.println("Position " + (i + 1) + ". = " + numbers[i]);
        }//end for

        //sort the array now
        System.out.println("Sorting the array...(MUST BE SORTED!)\n\n");
        //Selection sort
        for(int i=0;i<=SIZE-1;i++)
        {
            int smallest = i;
            for(int j=i+1;j<=SIZE-1;j++)
            {

                if(numbers[i] > numbers[j])
                {
                    smallest = j;
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }//end if
            }//end inner for
        }//end outter for

        //print sorted array
        System.out.println("Numbers are sorted!\n\n");
        for(int i=0;i<numbers.length;i++)
        {
            System.out.println("Position " + (i + 1) + ". = " + numbers[i]);
        }//end for

        //calling binary search
        binS.search(numbers,SIZE);

    }//end main
}//end class
