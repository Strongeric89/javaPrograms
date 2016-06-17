/*The following program is for lab 5 Q2


*/
import java.util.Scanner;
public class lab5Q2{
	public static void main(String [] args)
	{	
		Scanner scanf = new Scanner(System.in);
		System.out.println("Enter a number between 1-100");
		int num = scanf.nextInt();
		System.out.println("The initial value of num is " + num);
		int i = 0;
		
		if(num < 1)
		{
			System.out.println("Error!");
			

		}//end if
		
		else
		{
		while(num !=1)
		{
			if(num % 2==0)
			{	num = num /2;
			}//end if
			else if(num % 2 == 1)
			{
				num = (num * 3) + 1;
			}//end else if
		System.out.println("next Value is " + num);
		i ++;
		}//end while
		}//end else
		System.out.println("finally 1, number of steps is " + i);
		
			
	}//end main
	
}//end class