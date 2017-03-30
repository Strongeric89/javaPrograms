package com.eric.lab10;

public class Authentication
{
	public static char numbers[] =
	{ '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };

	private String password1;
	private String password2;

	public Authentication(String password1, String password2)
	{
		this.password1 = password1;
		this.password2 = password2;

	}// end constructor

	public String passwordCheck()
	{
		String warningMessage = "";

		int one = this.password1.length();
		int two = this.password2.length();

		// part 2 - empty fields check
		// or use .empty()
		if (one == 0 || two == 0)
		{
			warningMessage += "ERROR 1: both password fields must contain characters";
		}

		// part 2 - character count check
		else if (one < 8 || one > 15 || two < 8 || two > 15)
		{
			warningMessage += "ERROR 2: both passwords need to contain more than 8 characters but less than 15 characters ";
		}

		else if (this.numberCheck(this.password1) == true || this.numberCheck(this.password2) == true)
		{
			warningMessage += "ERROR 3:both passwords need to contain numbers";
		}

		else if (this.UpperCheck(this.password1) == false || this.UpperCheck(this.password2) == false)
		{
			warningMessage += "ERROR 4:both passwords need to contain uppercase letters";
		}

		else if (this.mispellChecker() == false)
		{
			warningMessage += "ERROR 5: You have misspelt something. check your passwords";

		}

		else
		{
			warningMessage += "PASSWORD";
		}

		return warningMessage;

	}// end empty check

	public boolean numberCheck(String password)
	{

		// part 3 - checker for numbers

		boolean notcontainsNumbers = true;

		for (int i = 0; i < password.length(); i++)
		{

			for (int j = 0; j < numbers.length; j++)
			{
				if (password.charAt(i) == numbers[j])
				{
					notcontainsNumbers = false;
					break;
				}
				if (notcontainsNumbers == false)
				{
					break;
				}

			} // end inner for

		} // end for

		return notcontainsNumbers;
	}// end numberChecker

	public boolean UpperCheck(String password)
	{
		boolean nothasUpper = true;

		if (!password.matches(".*[A-Z].*"))
		{
			nothasUpper = false;
		} // end if

		return nothasUpper;
	}// end uppercheck

	public boolean mispellChecker()
	{

		boolean isMisspelt = false;
		int one = this.password1.length();
		int two = this.password2.length();

		if (one == two)
		{
			// the strings are the same length.
			if (!this.password1.equals(this.password2))
			{
				isMisspelt = false;
			} else
			{
				isMisspelt = true;
			}

		}

		return isMisspelt;
	}

}// end class
