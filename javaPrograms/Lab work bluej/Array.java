/*
 * array app
 * version 1.0
 * eric
 */
import java.util.Scanner;
public class Array
{
    public static void main(String [] args)
    {
       
      int Number;
        int [] [] array = 
        { { 12 ,15 ,16 },
           {10 ,5  ,9  },
           {1  ,2  ,35 },
           {42 ,36 ,25 }};
            Scanner Scan = new Scanner (System.in);
           System.out.println("This is my array now; ");
                  for(int col=0;col<array.length;col++)
                  {for(int row = 0;row< array[0].length;row++)
                  {System.out.print(array[col][row] + " ");}
                  
        System.out.println();
    }
    System.out.println();
    System.out.print("Please enter a number;");
    Number=Scan.nextInt();
    System.out.println();
    System.out.print("Multiply the Array by " + Number );
    System.out.println(" The new array is ;");
    for(int col = 0;col < array.length; col ++)
    { for(int row = 0;row< array[0].length;row++)
        {System.out.print(array[col][row]*Number + " ");}
         System.out.println();
    }
}
}

    