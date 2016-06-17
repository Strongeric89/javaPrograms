package com.eric;

public class Challenge4 {
	public static void main(String [] args)
	{
		System.out.println("Numbers between 1-50 that are divisable by 5(USING FOR)");
		boolean isRunning = true;
		int sumFor = 0;
		for(int i=0;i<=50;i++)
		{
			if(i % 5 == 0)
			{
				System.out.print(i+" , ");
				sumFor = sumFor + i;
			}//end if
		}//end for
		
		System.out.println("Sum of numbers using for loop: " + sumFor );
		
		int j = 0;
		int sumWhile =0;
		System.out.println("\nNumbers between 1-50 that are divisable by 5(USING WHILE)");
		while(j !=51)
		{
			if(j % 5 ==0)
			{
				System.out.print(j+ " , ");
				sumWhile = sumWhile + j;
			}
			j++;
		}//end while
		System.out.println("Sum of numbers using While loop: " + sumWhile );
	}//end main
}
