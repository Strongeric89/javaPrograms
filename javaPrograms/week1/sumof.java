/*The following is lab2 Q1 for additional exercises on Java
Get the sum of numbers 1-5 numbers 
*/

public class sumof{
	public static void main (String [] args)
	{
		int num=0;
		int SIZE = 6;
		float sumFloat =0;

		for(int i =1;i< SIZE; i++)
		{
			num = num + i;
		}//end for
		
		System.out.printf("\nthe sum of %d numbers is %d",SIZE -1,num);
		
		//Displaying the average
		float number = 0.0f;
		for(int i =1;i<20;i++)
		{
			number = number + 0.1f;
			sumFloat = sumFloat + number;

			System.out.printf("\nThe value of number is %.2f",number);
		}//end for	
		System.out.println("\nThe sum of float numbers is " + sumFloat);
		float avg = sumFloat / 20;
		System.out.printf("\nThe average of 20 float numbers is %.2f", avg);
		
	
	}//end main
}//end class