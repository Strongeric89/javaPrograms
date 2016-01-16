/*
 * new array app
 * version 2.0
 * es
 */
import java.util.Scanner;
public class New_Array
{
    public static void main(String [] args)
    {
        int n;
        int [] [] array = 
        { {2 ,4 ,6 },
          { 10 , 12 ,14 },
          { 20 ,22 ,24 }};
            Scanner Scan = new Scanner (System.in);
            System.out.println("This is the Array now:");
            System.out.println();
            for(int col=0;col<array.length;col ++)
            {for(int row=0;row<array[0].length;row ++)
                {System.out.print(array[col][row] + " ");}
                System.out.println();
            }
   System.out.println();
   System.out.print("Please enter a number;  ");
   n=Scan.nextInt();
   System.out.println("increase the array by " + n);
   System.out.println("The new array is ;  ");
   System.out.println();
   for(int col=0;col<array.length;col ++)
            {for(int row=0;row<array[0].length;row ++)
                {System.out.print(array[col][row]+n + " ");}
                System.out.println();
            }
        }
    }
   