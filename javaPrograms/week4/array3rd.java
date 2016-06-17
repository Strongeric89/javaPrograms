/*The following is the lab8 q1*/
import java.util.Scanner;
public class array3rd{
  public static void main(String [] args)
  {
    Scanner scan = new Scanner (System.in);
    int ROW = 3;
    int COL = 2;
    int array1 [][] = new int [ROW][COL];
    int array2 [][] = new int [ROW][COL];
    int array3 [][] = new int [ROW][COL];
    //populate array1
    for(int i=0;i<ROW;i++)
    {
      for(int j = 0;j<COL;j++)
      {
        System.out.println("ARRAY1:element [" + i + " , " + j + " ]");
        array1[i][j]= scan.nextInt();
      }//end inner for
    }//end outter for

    //populate array2
    for(int i=0;i<ROW;i++)
    {
      for(int j = 0;j<COL;j++)
      {
        System.out.println("ARRAY2:element [" + i + " , " + j + " ]");
        array2[i][j]= scan.nextInt();
        //part3
        array3[i][j]= array1[i][j] * array2[i][j];
      }//end inner for
    }//end outter for

    //Displaying Array3
    for(int i=0;i<ROW;i++)
    {
      for(int j = 0;j<COL;j++)
      {
        System.out.println("ARRAY3:element [" + i + " , " + j + " ] = " + array3[i][j]);

      }//end inner for
    }//end outter for
  }//end main
}//end class
