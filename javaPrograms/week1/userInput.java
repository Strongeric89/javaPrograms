import java.util.Scanner;
public class userInput {
	public static void main(String [] args)
	{
		Scanner scanf = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String name = scanf.nextLine();
		System.out.printf("Your name is %s", name);
		
		System.out.println("\nPlease enter your age:");
		int age = scanf.nextInt();
		System.out.printf("Thank you %s\nYour age is %d",name, age);
	}//end main()
}//end class