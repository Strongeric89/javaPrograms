/*sum 2d array lab8 Q3*/
import java.util.Scanner;
public class sumArray{
  public static void main(String [] args)
  {
    Scanner scan = new Scanner (System.in);
    int ROW = 3;
    int COL = 2;
    int array1[][] = new int [ROW][COL];
    System.out.println("populate the array");
    int highest = -Integer.MAX_VALUE;
    int totalRow1=0;
    int totalRow2=0;
    int totalRow3=0;
    int totalCol1 = 0;
    int totalCol2 =0;
    for(int i =0;i<ROW;i++)
    {
      for(int j =0;j<COL;j++)
      {
        System.out.printf("\narray1:[%d,%d]  ",i,j);
        array1[i][j] = scan.nextInt();
      }//end for
    }//end for

    for(int i =0;i<ROW;i++)
    {
      for(int j=0;j<COL;j++)
      {
        System.out.printf("\narray1:[%d,%d]=%d",i,j,array1[i][j]);
        if(array1[i][j] > highest)
        {
          highest = array1[i][j];
        }//end if
        totalRow1 = array1[0][1] + array1[0][0];
        totalRow2 = array1[1][0] + array1[1][1];
        totalRow3 = array1[2][0] + array1[2][1];
        totalCol1 = array1[0][0] + array1[1][0] + array1[2][0];
        totalCol2 = array1[0][1] + array1[1][1] + array1[2][1];
      }//end for
    }//end for
    System.out.println("\nThe max value in the array is " + highest);
    System.out.println("The total of Row 0 is " + totalRow1);
    System.out.println("The total of Row 1 is " + totalRow2);
    System.out.println("The total of Row 2 is " + totalRow3);
    System.out.println("The total of Col 0 is " + totalCol1);
    System.out.println("The total of Col 1 is " + totalCol2);
    System.out.println("TOTAL OF ROW 0 + 1 + 2 = " + (totalRow1 + totalRow2 + totalRow3) );
    System.out.println("TOTAL OF COL 0 + 1 = " + (totalCol1 + totalCol2) );
  }//end main
}//end class
