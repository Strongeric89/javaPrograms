/*
The following program is from lab 5 Q1`. using a for loop to print numbers in Descending order 10-1



*/
import java.util.Scanner;
public class descending {
	public static void main(String [] args)
	{
		Scanner scanf = new Scanner (System.in);
		int SIZE;
		System.out.println("What number do you want to start at??");
		SIZE = scanf.nextInt();
		
		//now loop in descending order to 0
		while(SIZE >=0)
		{
			System.out.print(SIZE + ",");
			SIZE --;

		}//end while		
	}//end main
}//end class