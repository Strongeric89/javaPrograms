/*the following program is to implement a 2D array*/
import java.util.Scanner;
public class Arrays{
	public static void main(String [] args)
	{
		Scanner scanf = new Scanner (System.in);
		int ROWS;
		int COLS;
		System.out.println("How many rows?");
		ROWS = scanf.nextInt();
		System.out.println("How many cols?");
		COLS = scanf.nextInt();

		int array[][]= new int [ROWS][COLS];
		int i,j;
		System.out.println("Populate the array");
		for(i=0;i<ROWS;i++)
		{
			for(j=0;j<COLS;j++)
			{
				array[i][j]= scanf.nextInt();
			}//end inner for
		}//end for

		System.out.println("Enter a number to multiply the array by: ");
		int num = scanf.nextInt();
		for(i=0;i<ROWS;i++)
		{
			for(j=0;j<COLS;j++)
			{
				array[i][j]= array[i][j] * num;
				System.out.printf("%d\t",array[i][j]);
			}//end inner for
			System.out.println();
		}//end for



	}//end main

}//end class
