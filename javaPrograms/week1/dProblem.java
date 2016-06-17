//lab7 Q2
import java.util.Scanner;
public class dProblem{
   public static void main(String [] args)
   {
         Scanner scan = new Scanner (System.in);
         int ROW = 3;
         int COL = 2;
         int smallest= Integer.MAX_VALUE;
         int largest = -Integer.MAX_VALUE;
         float avg=0
         ;
         int total=0;
         int num = ROW * COL;
         int numbers[][] = new int [ROW][COL];
         for(int i = 0;i < ROW;i++)
         {
            for(int j=0;j<COL;j++)
            {
               //part a
               System.out.printf("array index (%d,%d)",i,j);
               numbers[i][j] = scan.nextInt();
            }//end inner for
         }//end outter for

         for(int i = 0;i < ROW;i++)
         {
            for(int j=0;j<COL;j++)
            {

               //part b
               ///System.out.printf("array index (%d,%d) = [%d,%d]",i,j,numbers[i][j];
               System.out.println("numbers [" + i + " , " + j + " ] = " + numbers[i][j]);

               //part c finding the smallest and largest
               if(numbers[i][j] < smallest)
               {
                  smallest = numbers[i][j];
               }//end if

               if(numbers[i][j] > largest)
               {
                  largest = numbers[i][j];
               }//end if

               //Part D finding the average
               total = total + numbers[i][j];
               avg = total / num;
            }//end inner for
         }//end outter for

         //displaying the answers of C and D
         System.out.println("The smallest number in the array is " + smallest);
         System.out.println("The largest number in the array is " + largest);
         System.out.println("The Average number of the array is " + avg);

   }//end main
}//end class
