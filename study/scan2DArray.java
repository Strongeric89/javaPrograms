/*using scanner and arrays together*/
import java.util.Scanner;
public class scan2DArray{
  public static void main(String [] args)
  {
    Scanner scanf = new Scanner(System.in);
    System.out.println("How many rows??");
    int ROW = scanf.nextInt();
    System.out.println("How many cols??");
    int COL = scanf.nextInt();

    int numbers[][] = new int [ROW][COL];
    //populate the arrays
    for(int i =0; i<ROW;i++)
    {
      for(int j=0;j<COL;j++)
        {
          System.out.printf("\n(%d,%d)",i,j);
          numbers[i][j]= scanf.nextInt();
        }//end inner for
    }//end outter for

    //printing the contents of the 2d array
    for(int i =0; i<ROW;i++)
    {
      for(int j=0;j<COL;j++)
        {
          System.out.print(numbers[i][j] + ",\t");
        }//end inner for
        System.out.println();
    }//end outter for


  }//end main()
}//end class
