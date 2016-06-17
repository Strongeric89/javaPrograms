/*the following program is to practice methods and passing parameters*/
package com.eric;
import java.util.Scanner;
//method used to return the largest number
class Numbers{
    public int largest(int num1,int num2,int num3)
    {

        if(num1 > num2 && num1 > num3)
        {
            return num1;
        }//end if
        else if(num2 > num1 && num2 > num3)
        {
            return num2;
        }//end if
        else if(num3> num1 && num3 > num2)
        {
            return num3;
        }//end if
        return 0;
    }//end largest
}//end numbers

public class PracMethods{
    public static void main(String [] args)
    {
        int num1,num2,num3;
        Scanner scan = new Scanner (System.in);
        Numbers numbers = new Numbers();

        //get user to enter 3 numbers
        System.out.println("Please enter 3 numbers: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();

        //pass 3 numbers over to the new function
        int largest = numbers.largest(num1,num2,num3);
        System.out.println("The largest number is " + largest);
    }//end main
}//end class
