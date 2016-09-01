package com.eric.objects;

public class AddressBook
{
	public static void main(String[] args)
	{

		System.out.print("Address Book\n------------------------------\n");
		ContactDetails eric = new ContactDetails("Eric", "0851077975", 'M', 27);
		System.out.print("\nName:" + eric.getName() + "\tPhone:" + eric.getNumber() + "\tGender:" + eric.getGender()
				+ "\tAge:" + eric.getAge());
	}// endmain

}// endclass
