/*The following program asks the user to press Y to continue*/
import java.util.Scanner;
public class pressY{
	public static void main(String [] args)
	{
		
		Scanner scanf = new Scanner(System.in);
		char letter;
		boolean flag = true;
		
		//System.out.println("Press Y/Y to continue");
		//letter = scanf.next(".").charAt(0);
		
		while(flag == true)
		{
		
			System.out.println("Press Y/y to continue");
			letter = scanf.next(".").charAt(0);

		if(letter == 'y' || letter =='Y')
		{
			flag = false;
			
			
		}//end if
		else
		{	System.out.println("Try again.");
			
		}//end else

		}//end while
		
		System.out.println("Thank you for enter y.");
		
		
		
			
	}//end main()

}//end classdir
