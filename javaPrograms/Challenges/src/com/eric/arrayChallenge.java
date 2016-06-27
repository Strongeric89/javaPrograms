package com.eric;
import java.util.Scanner;

public class arrayChallenge {
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		String names[] = {"Eric","Laura","Margaret","Gerry","Conor","Dave","Ger"};
		
		for(int i =0;i<names.length;i++)
		{
			System.out.println("Index:" + i + " name:" + names[i]+ " Element:"+(i+1));
		}//end for
		
	}//end main
}//end class
