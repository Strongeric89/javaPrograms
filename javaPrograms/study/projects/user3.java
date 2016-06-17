/*the following program is Q1 lab3
-ask user for 3 inputs and display them
*/
import java.util.Scanner;

public class user3{
	public static void main(String [] args)
	{
	Scanner scanf = new Scanner(System.in);
	int num1,num2,num3;
	System.out.println("Enter 3 numbers:");
	num1 = scanf.nextInt();
	num2 = scanf.nextInt();
	num3 = scanf.nextInt();
	
	//displaying the numbers
	System.out.println("Num1: "+ num1 +"\nnum2: " + num2 +"\nnum3: " + num3);

	System.out.println("Enter 2 Characters:");
	char ch1,ch2;
	ch1 = scanf.next(".").charAt(0);
	ch2 = scanf.next(".").charAt(0);
	System.out.println("Char1: " + ch1 + "\nChar2: " + ch2);
	
	
	}//end main()


	


}//end class