/*
The following program is from lab 4 Q1 using a switch
*/
import java.util.Scanner;
public class Exswitch{
	public static void main(String [] args)
	{	
		Scanner scanf = new Scanner(System.in);
		char letter;
		
		int flag = 0;
		
		while(flag == 0)
		{
			System.out.println("Enter a character to see if it is a vowel");
		
			letter = scanf.next(".").charAt(0);
		
			switch(letter)
			{
				case 'a' :{
					System.out.println("The letter " + letter + " is a Vowel");
					
				}break;//end case a
				case 'e' :{
					System.out.println("The letter " + letter + " is a Vowel");
					
				}break;//end case e
				case 'i' :{
					System.out.println("The letter " + letter + " is a Vowel");
					
				}break;//end case i
				case 'o' :{
					System.out.println("The letter " + letter + " is a Vowel");
				}break;//end case o
				case 'u' :{
					System.out.println("The letter " + letter + " is a Vowel");
					
				}break;//end case u
				case 0 :{
					System.out.println("you pressed 0 to exit");
					flag = 1;
					
				}break;//end case exit

				default: {
					System.out.println("The letter " + letter + " is not a vowel");
					
				}break;//end default

			}//end switch
		}//end while

	}//end main
	
}//end class
