/* The following program will ask for 3 numbers from command line


*/
import java.util.Scanner;

public class decimal{
	public static void main(String [] args)
	{		
		
		Scanner scanf = new Scanner(System.in);
		System.out.printf("Enter 3 numbers:");
		float num1 = scanf.nextFloat();
		float num2 = scanf.nextFloat();
		float num3 = scanf.nextFloat();

		System.out.printf("The first float is %.3f \nThe second float is %.2f\n The third float is %.4f",num1,num2,num3);

		
		
		
				
	}//end main
}//end class
		
		
