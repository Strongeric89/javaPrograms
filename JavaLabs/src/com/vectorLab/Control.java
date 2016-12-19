package com.vectorLab;

/**
 * @author Eric Date: 19 Dec 2016 Lab: python lab2 vectors in JAVA
 *         implementation
 */
public class Control
{
	public static void main(String[] args)
	{
		// create a complex Number
		ComplexNumber n1 = new ComplexNumber(7, 5, '+');
		ComplexNumber n2 = new ComplexNumber(5, 2, '-');

		System.out.println("num1:" + n1);
		System.out.println("num2:" + n2);

		ComplexNumber n3 = n1.__add__(n2);
		System.out.println("n1 + n2 = " + n3);

		ComplexNumber n4 = n1.__sub__(n2);
		System.out.println("n1 - n2 = " + n4);

		ComplexNumber n5 = n1.__mult__(n2);
		System.out.println("n1 * n2 = " + n5);

		ComplexNumber n6 = n1.multByX(n1, 2);
		System.out.println("n1 * [2]= " + n6);

	}// end main

}
