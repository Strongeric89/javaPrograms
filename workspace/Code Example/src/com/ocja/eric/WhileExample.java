/*
 * The following program is a while Example
 */
package com.ocja.eric;
import java.util.Scanner;

public class WhileExample {
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter a number:");
	int num = scan.nextInt();
	int count = 0;
	while(num!=1)
	{
		System.out.println(num);
		count ++;
		num = num /2;
	}//end while
}
