/*
enter a number and check if it is odd or even from cmd
*/
import java.util.Scanner;
public class oddEven{
	public static void main(String [] arg)
	{
		Scanner scanf = new Scanner(System.in);
		int num;
		System.out.println("Enter a number between 1 and 100:");
		num = scanf.nextInt();
		
		//checking the number
		if(num <1 || num > 100)
		{
		System.out.println("The number is not in the range of 1-100");
		}//end if	
		else
		{	
			if(num % 2 ==0) //even
			{	
				System.out.printf("%d is Even",num);
			}//end if
			else
			{
				System.out.printf("%d is Odd",num);	
			}
		}//end else

	}//end main	

}//end class
