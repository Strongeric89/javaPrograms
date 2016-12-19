package com.vectorLab;

public class ComplexNumber
{
	private int num1 = 0;
	private int num2 = 0;
	private char letter = 'i';
	private char sign = '+';

	public ComplexNumber(int num1, int num2, char sign)
	{

		this.num1 = num1;
		this.num2 = num2;
		this.sign = sign;

	}// end constructor

	public ComplexNumber(int num1)
	{

		this.num1 = num1;

	}// end constructor

	// toString method
	public String toString()
	{
		if (this.num2 == 0)
		{
			return "" + this.num1;

		}
		return "" + this.num1 + this.sign + this.num2 + "" + this.letter;
	}

	// method overloading
	public ComplexNumber __add__(ComplexNumber x)
	{
		int one = this.num1 + x.getNum1();
		int two = this.num2 + x.getNum2();
		// create a new object
		ComplexNumber n3 = new ComplexNumber(one, two, '+');
		return n3;

	}// end add

	public ComplexNumber __sub__(ComplexNumber x)
	{
		int one = this.num1 - x.getNum1();
		int two = this.num2 - x.getNum2();
		// create a new object
		ComplexNumber n3 = new ComplexNumber(one, two, '-');
		return n3;

	}// end sub

	public ComplexNumber __mult__(ComplexNumber x)
	{
		int one = (this.num1 * x.getNum1()) + (this.num1 * x.getNum2());
		int two = (this.num2 * x.getNum1()) + (this.num2 * x.getNum2());
		// create a new object
		ComplexNumber n3 = new ComplexNumber(one, two, '-');
		return n3;

	}// end mult

	public ComplexNumber multByX(ComplexNumber x, int realNum)
	{
		int one = this.num1 * realNum;

		// create a new object
		ComplexNumber n3 = new ComplexNumber(one, 0, '+');
		return n3;

	}// end multByX

	public int getNum1()
	{
		return num1;
	}

	public void setNum1(int num1)
	{
		this.num1 = num1;
	}

	public int getNum2()
	{
		return num2;
	}

	public void setNum2(int num2)
	{
		this.num2 = num2;
	}

	public char getLetter()
	{
		return letter;
	}

	public void setLetter(char letter)
	{
		this.letter = letter;
	}// end add

}// end class
