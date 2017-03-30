package com.eric.lab10;

/**
 * @author Eric Strong Date: 29 Mar 2017 Lab: 10 ID: C15708709
 */
public class Password
{
	private String username;
	private String password;
	private int passwordLength;

	public Password(String username, String password, int passwordLength)
	{
		this.username = username;
		this.password = password;
		this.passwordLength = passwordLength;

		System.out.println("password created and stored");

	}// end constructor

	// getters and setters

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public int getPasswordLength()
	{
		return passwordLength;
	}

	public void setPasswordLength(int passwordLength)
	{
		this.passwordLength = passwordLength;
	}

	// toString
	public String toString()
	{
		return " \n\n\nUsername:" + this.username + "\nPassword:" + this.password + "\nPassword Length:"
				+ this.passwordLength;
	}

}// end class
