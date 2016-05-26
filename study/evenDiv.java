/*the following program is for lab5 Q3

*/
import java.util.Scanner;
public class evenDiv{
	public static void main(String [] args)
	{	
		Scanner scanf = new Scanner (System.in);
		System.out.println("Enter a number between 1-5");
		int num = scanf.nextInt();
		int i;
		
		//error checking
		if(num <1 || num>5)
		{
			System.out.println("The number is not Valid");
		}//end if
		else
		{
			for(i=1;i<21;i++)
			{
				if(i % num ==0)
				{
					System.out.printf("\n%d is evenly divisable by %d",i,num);
				}//end if
			}//end for
			
		}//end else
		
		
	}//end main

}//end class